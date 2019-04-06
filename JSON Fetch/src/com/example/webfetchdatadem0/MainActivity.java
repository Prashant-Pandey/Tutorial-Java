package com.example.webfetchdatadem0;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
     EditText etname,etage,etgender,etcity;
     Button btsubmit,btnshow_data;
     String etname_Value,etage_Value,etgender_Value,etcity_Value,submitAll;
     ProgressDialog pDialog;
     StringBuilder stringBuilder;
     BufferedReader bufferedReader;
     JSONParser jsonParser = new JSONParser();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etname = (EditText)findViewById(R.id.edttxtname);
		etage = (EditText)findViewById(R.id.edttxtage);
		etgender = (EditText)findViewById(R.id.edttextgen);
		etcity = (EditText)findViewById(R.id.edttxtcity);
		btsubmit = (Button)findViewById(R.id.btnsubmit);
		btnshow_data = (Button)findViewById(R.id.btnshowdata);
		
		if (android.os.Build.VERSION.SDK_INT >9) {
		    StrictMode.ThreadPolicy policy = 
		    new StrictMode.ThreadPolicy.Builder().permitAll().build();      
		        StrictMode.setThreadPolicy(policy);
		 }
		
		
		btnshow_data.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent showdata = new Intent(MainActivity.this,FetchData.class);
		          startActivity(showdata);
			}
		});
		btsubmit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				

				  etname_Value = etname.getText().toString().trim();
				  etage_Value = etage.getText().toString().trim();
				  etgender_Value = etgender.getText().toString().trim();
				  etcity_Value = etcity.getText().toString().trim();
				  
				  
				  if(etname_Value.equals("") || etage_Value.equals("") || etgender_Value.equals("") || etcity_Value.equals("")  )
					{
						//Toast.makeText(getApplicationContext(), "Please Fill All Entries ", Toast.LENGTH_LONG).show();
						
						
						
	                     new AlertDialog.Builder(MainActivity.this).setTitle("Alert....").setMessage("Please Fill Required Fields.").setNeutralButton("OK", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								/*Intent inotr =new Intent(AddProperty.this,Home.class);
								startActivity(inotr);
								finish();*/
								dialog.cancel();
							
					   }
					}).create().show();
					}
				
					else {
					
					isInternetOn();
				
			
			
			}
			}
		});
	
		
	}
	public final boolean isInternetOn() {
	     
	     // get Connectivity Manager object to check connection
	  ConnectivityManager connec =  (ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);
	  
	     // Check for network connections
	   if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
	        connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
	        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
	        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {
	      
	    // if connected with internet
	    
	       //Toast.makeText(this, "Internet is Connected ", Toast.LENGTH_LONG).show();
		   new SubmitData().execute();
	       return true;
	       
	   } else if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||  connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {
	     
	   // Toast.makeText(this, "Internet Not Connected, Connect it first! ", Toast.LENGTH_LONG).show();
		   new AlertDialog.Builder(MainActivity.this).setTitle("Alert....").setMessage("Internet Not Connected, Connect it first! ").setNeutralButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					/*Intent inotr =new Intent(AddProperty.this,Home.class);
					startActivity(inotr);
					finish();*/
					dialog.cancel();
				
		   }
		}).create().show();
	       return false;
	       
	   }
	    return false;
	  }
	
class SubmitData extends AsyncTask<String, Void, String>{ 
		
		@Override
	    protected void onPreExecute() {
	        super.onPreExecute();
	        pDialog = new ProgressDialog(MainActivity.this);
	        pDialog.setMessage("Loading...");
	        //pDialog.setIndeterminate(false);
	        pDialog.setCancelable(false);
	        pDialog.show();
	        
	        lockScreenOrientation();
	    }
		
			@Override
			protected String doInBackground(String... params) {
						
				
				String paramname = etname_Value;
				String paramage = etage_Value;
				String paramgender = etgender_Value;
		        String paramcity = etcity_Value;
		        
			   
		  System.out.println(paramname+paramage+paramgender+paramcity);
            
				HttpClient httpClient = new DefaultHttpClient();
				
				
				
           		submitAll=	"http://www.jaipurplots.com/webservices/test1/action.php?action=add&fname="+paramname+"&age="+paramage+"&city="+paramcity+"&gender="+paramgender;
            submitAll = submitAll.replace(" ", "%20");
				 HttpGet httpGet = new HttpGet(submitAll);
				
				
				 
				try {
					
					HttpResponse httpResponse = httpClient.execute(httpGet);
					System.out.println("httpResponse"); 

					InputStream inputStream = httpResponse.getEntity().getContent();
					InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
				     bufferedReader = new BufferedReader(inputStreamReader);

					System.out.println("#####################"+bufferedReader);
					 stringBuilder = new StringBuilder();
					String bufferedStrChunk = null;
					while((bufferedStrChunk = bufferedReader.readLine()) != null){
						stringBuilder.append(bufferedStrChunk);
						
					}

					System.out.println("Returning value of doInBackground :" + stringBuilder.toString());
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + stringBuilder.toString() );
									
					return stringBuilder.toString();

				} catch (ClientProtocolException cpe) {
					System.out.println("Exception generates caz of httpResponse :" + cpe);
					cpe.printStackTrace();
				} catch (IOException ioe) {
					System.out.println("Second exception generates caz of httpResponse :" + ioe);
					ioe.printStackTrace();
				}
				
				return null;
			
	        }
			public void onDestroy() {
	            if (pDialog != null) {
	                pDialog.dismiss();
	                pDialog = null;
	            }
	        }

			// Argument comes for this method according to the return type of the doInBackground() and
			//it is the third generic type of the AsyncTask
			@Override
			protected void onPostExecute(String result) {
				super.onPostExecute(result);
				pDialog.dismiss();
				
			try {
				JSONObject json = new JSONObject(stringBuilder.toString());
		        System.out.println(json);
		        
		       // if(json.has("api_result")){
		            JSONArray resultJsonArr;
		   
		    resultJsonArr = json.getJSONArray("AddStudent");
		    System.out.println(resultJsonArr);
		     for(int j=0; j<resultJsonArr.length(); j++){
		    	 
		                  JSONObject jsonResult = resultJsonArr.getJSONObject(j);
		                  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&"+jsonResult);
		                  
		                  
		                  unlockScreenOrientation();
		                  
		                  /*if(stringBuilder.toString().contains("message")){
		      				Toast.makeText(getApplicationContext(), "Please Fill All Required Field.", Toast.LENGTH_LONG).show();
		      			}
		                  else{
		                	  Toast.makeText(getApplicationContext(), "Your Property Added Successfully", Toast.LENGTH_LONG).show();
		                	
		                  }*/
		                  
		                  /* messageget =jsonResult.getString("message");
			               System.out.println("message value^^^^^^^^^^^^^^^^^^^^^^^  "+messageget);
			              */
		                  /*if(stringBuilder.toString().contains("message"))
		                	  Toast.makeText(getApplicationContext(), "HO gya Submitt" , Toast.LENGTH_LONG).show();
		                  
		                  else{
		                	  Toast.makeText(getApplicationContext(), "no value", Toast.LENGTH_LONG).show();
		                	
		                  }*/
		              //	Toast.makeText(getApplicationContext(), "Your Property Added Successfully", Toast.LENGTH_LONG).show();
		                  
		                	  
		                  
		          Toast.makeText(getApplicationContext(), "Your Data Submitted Successfully.", Toast.LENGTH_LONG).show();
		          
		         Intent gonext = new Intent(MainActivity.this,FetchData.class);
		          startActivity(gonext);
		                      	                  
		       }
		    
		   }catch (JSONException e) {


			    e.printStackTrace();
			   }
	}
		}

		

private void lockScreenOrientation() {
   int currentOrientation = getResources().getConfiguration().orientation;
   if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
   } else {
       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
   }
}

  private void unlockScreenOrientation() {
   setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
}


	}


	


