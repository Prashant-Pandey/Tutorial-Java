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
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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


public class OnclickEdit extends Activity {
    EditText etnameEDIT,etageEDIT,etgenderEDIT,etcityEDIT;
    Button btsubmitEDIT;
    String  spIDeditcr,oneditVIEW;
    ProgressDialog pDialog;
    StringBuilder stringBuilder;
    BufferedReader bufferedReader;
    ProgressDialog pDialog1;
    StringBuilder stringBuilder1;
    BufferedReader bufferedReader1;
   String etnameEDITValue,etageEDITValue,etcityEDITValue  ,etgenderEDITValue;
   int idEditValue;
   String nameEditValue,ageEditValue,cityEditValue,genderEditvalue;
	String idEditValueString,editfinale;
	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_onclick_edit);
		etnameEDIT = (EditText)findViewById(R.id.edttxtname_EDIT);
		etageEDIT = (EditText)findViewById(R.id.edttxtage_EDIT);
		etgenderEDIT = (EditText)findViewById(R.id.edttextgen_EDIT);
		etcityEDIT = (EditText)findViewById(R.id.edttxtcity_EDIT);
		btsubmitEDIT = (Button)findViewById(R.id.btnsubmit_EDIT);
		
		if (android.os.Build.VERSION.SDK_INT >9) {
		    StrictMode.ThreadPolicy policy = 
		    new StrictMode.ThreadPolicy.Builder().permitAll().build();      
		        StrictMode.setThreadPolicy(policy);
		       
			  
			
			SharedPreferences sp=getSharedPreferences(FetchData.PREF_SHAREDedit, Context.MODE_PRIVATE);
			spIDeditcr=sp.getString("edt_idcr", "");
		   	System.out.println("sp value of id is &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" +spIDeditcr );
		   	
		 }
		
		isInternetOn();
		
		btsubmitEDIT.setOnClickListener(new OnClickListener()
				 {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etnameEDITValue = etnameEDIT.getText().toString().trim();
				etageEDITValue = etageEDIT.getText().toString().trim();
				etcityEDITValue = etcityEDIT.getText().toString().trim();
				etgenderEDITValue = etgenderEDIT.getText().toString().trim();
				
				
		System.out.println("name is  SSSSSSSSSSSSSSSS"+etnameEDITValue);
		System.out.println("age is  SSSSSSSSSSSSSSSS"+etageEDITValue);
		System.out.println("city is  SSSSSSSSSSSSSSSS"+etcityEDITValue);
		System.out.println("gender is  SSSSSSSSSSSSSSSS"+etgenderEDITValue);
		
		isInternetOnEditFinally();
				
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
	       LongOperation();
	       return true;
	       
	   } else if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||  connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {
	     
	   // Toast.makeText(this, "Internet Not Connected, Connect it first! ", Toast.LENGTH_LONG).show();
		   new AlertDialog.Builder(OnclickEdit.this).setTitle("Alert....").setMessage("Internet Not Connected, Connect it first! ").setNeutralButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Intent inotr =new Intent(OnclickEdit.this,OnclickEdit.class);
					startActivity(inotr);
					//finish();
					dialog.cancel();
				
		   }
		}).create().show();
	       return false;
	       
	   }
	    return false;
	  }
	
	
	
	private void LongOperation() {
		
		//connectWithHttpGet(spin_rentcategory.getSelectedItem().toString(),spin_rentlocation.getSelectedItem().toString(),spin_rentprice.getSelectedItem().toString());
	
		connectWithHttpGet(spIDeditcr);
		
	}
	
	
	
	private void connectWithHttpGet(String givenidedit) {

		class CustomerEditable extends AsyncTask<String, Void, String>{
			
			 @Override
		        protected void onPreExecute() {
		            super.onPreExecute();
		            pDialog = new ProgressDialog(OnclickEdit.this);
		            pDialog.setMessage("Loading...");
		            //pDialog.setIndeterminate(false);
		            pDialog.setCancelable(false);
		            pDialog.show();
		            
		            lockScreenOrientation();
		        }
			
			@Override
			protected String doInBackground(String... params) {

				String paramidEdit = spIDeditcr;//params[0];  //
				
				System.out.println(paramidEdit);
				

				    HttpClient httpClient = new DefaultHttpClient();
				
				 
				    oneditVIEW = "http://www.jaipurplots.com/webservices/test1/details.php?eid="+paramidEdit;
					System.out.println(oneditVIEW);
					oneditVIEW = oneditVIEW.replace(" ", "%20");
	                 HttpGet httpGet = new HttpGet(oneditVIEW);
		 
				//HttpGet httpGet = new HttpGet("http://jaipurrental.com/webservices/properties-by-rent.php?category="+paramcategory + "&location=" + paramlocation+ "&price=" +paramprice);
              //System.out.println(httpGet);
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
		   
		    resultJsonArr = json.getJSONArray("List");
		    System.out.println(resultJsonArr);
		     for(int j=0; j<resultJsonArr.length(); j++){
		    	 
		                  JSONObject jsonResult = resultJsonArr.getJSONObject(j);
		              
		                  idEditValue =jsonResult.getInt("id");
			               System.out.println("id value^^^^^^^^^^^^^^^^^^^^^^^  "+idEditValue);
			               
		   	            nameEditValue =jsonResult.getString("name");
			               System.out.println("name value^^^^^^^^^^^^^^^^^^^^^^^  "+nameEditValue);
			              
			           ageEditValue =jsonResult.getString("age");
			               System.out.println("age value^^^^^^^^^^^^^^^^^^^^^^^  "+ageEditValue);
			           cityEditValue =jsonResult.getString("city");
			               System.out.println("city value^^^^^^^^^^^^^^^^^^^^^^^  "+cityEditValue);
			             genderEditvalue =jsonResult.getString("gender");
			               System.out.println("gender value^^^^^^^^^^^^^^^^^^^^^^^  "+genderEditvalue);
			               

			              
			               unlockScreenOrientation();
			               
			                
					       
			       	
			               etnameEDIT.setText(nameEditValue);
			            
			               etageEDIT.setText(ageEditValue);
			              
			               etcityEDIT.setText(cityEditValue);
			              
			               etgenderEDIT.setText(genderEditvalue);
			              
			               
			              
			           
			       	   	
			       		
		                
		     }
		   }catch (JSONException e) {


			    e.printStackTrace();
			   }
		   
				
			
				
				
			
				
				
				
				
				
			}			
		}

		// Initialize the AsyncTask class
		CustomerEditable customerEditable = new CustomerEditable();
		// Parameter we pass in the execute() method is relate to the first generic type of the AsyncTask
		// We are passing the connectWithHttpGet() method arguments to that
		customerEditable.execute(givenidedit); 

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
	   
	   public final boolean isInternetOnEditFinally() {
		     
		     // get Connectivity Manager object to check connection
		  ConnectivityManager connec =  (ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);
		  
		     // Check for network connections
		   if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
		        connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
		        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
		        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {
		      
		    // if connected with internet
		    
		       //Toast.makeText(this, "Internet is Connected ", Toast.LENGTH_LONG).show();
			  new EditcustomerFinale().execute();
			   
			 /*  SendHttpRequestTask t = new SendHttpRequestTask();
			   String[] params = new String[]{url, param1, param2};
			   t.execute(params);
			   */
		       return true;
		       
		   } else if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||  connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {
		     
		   // Toast.makeText(this, "Internet Not Connected, Connect it first! ", Toast.LENGTH_LONG).show();
			   new AlertDialog.Builder(OnclickEdit.this).setTitle("Alert....").setMessage("Internet Not Connected, Connect it first! ").setNeutralButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						
						finish();
						dialog.cancel();
					
			   }
			}).create().show();
		       return false;
		       
		   }
		    return false;
		  }
		
		
	 
		class EditcustomerFinale extends AsyncTask<String, Void, String>{ 
			
			@Override
		    protected void onPreExecute() {
		        super.onPreExecute();
		        pDialog1 = new ProgressDialog(OnclickEdit.this);
		        pDialog1.setMessage("Loading...");
		       // pDialog.setIndeterminate(false);
		        pDialog1.setCancelable(false);
		        pDialog1.show();
		        
		        lockScreenOrientation1();
		    }
			
				@Override
				protected String doInBackground(String... params) {
					//String paramurl = upLoadServerUri;
					//String paramtype = addprptTypeValue; //params[0];
					idEditValueString = String.valueOf(idEditValue);
					System.out.println("id in sring &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+idEditValueString);
					String paramid = idEditValueString;
				
					
					String paramname = etnameEDITValue;//params[1];
					
					String paramage = etageEDITValue;
					String paramcity = etcityEDITValue;
					
					String paramgender = etgenderEDITValue;//params[2];
					
					
	            System.out.println(paramid+paramname+paramage+paramcity+paramgender);
					HttpClient httpClient = new DefaultHttpClient();
					
					
					
					
	//http://www.jaipurplots.com/webservices/post-property.php?type="+paramcategory+"&scheme="+paramscheme+"&area="+paramarea+"&location="+paramlocation+"&price="+paramprice+"&contact="paramcontact+"&name="paramname+"&description="paramprodtl
					
					editfinale = "http://www.jaipurplots.com/webservices/test1/action.php?action=edit&id="+paramid+"&fname="+paramname+"&age="+paramage+"&city="+paramcity+"&gender="+paramgender;
					System.out.println(editfinale);
					editfinale = editfinale.replace(" ", "%20");
					 HttpGet httpGet = new HttpGet(editfinale);
					 
					 
					try {
						
						
						HttpResponse httpResponse = httpClient.execute(httpGet);
						System.out.println("httpResponse"); 

						InputStream inputStream = httpResponse.getEntity().getContent();
						InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
					     bufferedReader1 = new BufferedReader(inputStreamReader);

						System.out.println("#####################"+bufferedReader1);
						 stringBuilder1 = new StringBuilder();
						String bufferedStrChunk = null;
						while((bufferedStrChunk = bufferedReader1.readLine()) != null){
							stringBuilder1.append(bufferedStrChunk);
							
						}

						System.out.println("Returning value of doInBackground :" + stringBuilder1.toString());
						System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + stringBuilder1.toString() );
										
						return stringBuilder1.toString();

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
		            if (pDialog1 != null) {
		                pDialog1.dismiss();
		                pDialog1 = null;
		            }
		        }

				// Argument comes for this method according to the return type of the doInBackground() and
				//it is the third generic type of the AsyncTask
				@Override
				protected void onPostExecute(String result) {
					super.onPostExecute(result);
					pDialog1.dismiss();
					
				try {
					JSONObject json = new JSONObject(stringBuilder1.toString());
			        System.out.println(json);
			        
			       // if(json.has("api_result")){
			            JSONArray resultJsonArr;
			   
			    resultJsonArr = json.getJSONArray("EditRecord");
			    System.out.println(resultJsonArr);
			     for(int j=0; j<resultJsonArr.length(); j++){
			    	 
			                  JSONObject jsonResult = resultJsonArr.getJSONObject(j);
			                  
			                  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&"+jsonResult);
			                  
			                  unlockScreenOrientation1();
			                  
			               
			                 
			                 new AlertDialog.Builder(OnclickEdit.this).setMessage("Profile Edited Successfully!").setNeutralButton("OK", new DialogInterface.OnClickListener() {
			      				
			      				@Override
			      				public void onClick(DialogInterface dialog, int which) {
			      					Intent inotr =new Intent(OnclickEdit.this,FetchData.class);
			      					startActivity(inotr);
			      					finish();
			      					dialog.cancel();
			      				
			      		   }
			      		}).create().show(); 	                
			       }
			    
			   }catch (JSONException e) {


				    e.printStackTrace();
				   }
		}
			}
		
		
		private void lockScreenOrientation1() {
		    int currentOrientation = getResources().getConfiguration().orientation;
		    if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
		        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		    } else {
		        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		    }
		}
		 
		   private void unlockScreenOrientation1() {
		    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
		}
}
