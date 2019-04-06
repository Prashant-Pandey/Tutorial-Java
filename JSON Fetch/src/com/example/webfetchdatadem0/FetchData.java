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
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


public class FetchData extends Activity {
	TableLayout tabLayout;
	int getID;
	 String getName,getage,getcity,getgender; 
	 TableRow  rowname,rowage,rowcity,rowgender,rowaction1,rowaction2;
	 TextView tvname,tvage,tvcity,tvgender,tvactionedit,tvactiondelete;
	 TextView tvname1,tvage1,tvcity1,tvgender1;
	 JSONParser jsonParser = new JSONParser();
	 Dialog delete_dialog;
	 String textIDnameSTR_DLT;
	Button alert_btndltyesCR ,alert_btndltnoCR;
		ProgressDialog pDialog2;
		StringBuilder stringBuilder2;
		BufferedReader bufferedReader2;
		String deletetermAll;
		TextView searchData;
		String spNameSrch;
		ProgressDialog pDialog;
		StringBuilder stringBuilder;
		BufferedReader bufferedReader;
		String searchAll;
		String texteditstr;
		 static String PREF_SHAREDedit="My Prefs";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fetch_data);
		tabLayout = (TableLayout)findViewById(R.id.table_data);
		
		
		if (android.os.Build.VERSION.SDK_INT >9) {
		    StrictMode.ThreadPolicy policy = 
		    new StrictMode.ThreadPolicy.Builder().permitAll().build();      
		        StrictMode.setThreadPolicy(policy);
		 }
		
		
		
		
		
		isInternetOn() ;
		
		
		   	
		   	
		
		
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
	   
	     // Toast.makeText(this, "Internet is Connected ", Toast.LENGTH_LONG).show();
	      
	      
	      //JSONParser jParser = new JSONParser();
		   JSONParser jsonParser = new JSONParser();
	  	
	 	 JSONObject json = jsonParser.getJSONFromUrl("http://www.jaipurplots.com/webservices/test1/list.php");
	 	 System.out.println(json);
	    
	 	 // if(json.has("api_result")){
	        JSONArray resultJsonArr;
	        try {
	     	   resultJsonArr = json.getJSONArray("List");
	     	   
	     	   System.out.println(resultJsonArr);
	     	   for(int j=0; j<resultJsonArr.length(); j++){
	 	 
	              JSONObject jsonResult = resultJsonArr.getJSONObject(j);
	              
	              getID = jsonResult.getInt("id");
	       		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^  "+getID);
	              
	                    getName = jsonResult.getString("name");
	            		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^  "+getName);
	            
	            	
	            		getage = jsonResult.getString("age");
	            		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^  "+getage);
	            		
	            		getcity = jsonResult.getString("city");
	            		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^  "+getcity);
	            		
	            		getgender = jsonResult.getString("gender");
	            		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^  "+getgender);
	            		
	               
	            
	                       		  
	            		rowname=new TableRow(getApplicationContext());
	            		
	            		rowname.setLayoutParams(new LayoutParams(40, 50));
	            		
	                     rowage=new TableRow(getApplicationContext());
	            		
	                     rowage.setLayoutParams(new LayoutParams(40, 50));
	                     
	                     rowcity=new TableRow(getApplicationContext());
		            		
	                     rowcity.setLayoutParams(new LayoutParams(40, 50));
	                     
	                     rowgender=new TableRow(getApplicationContext());
		            		
	                     rowgender.setLayoutParams(new LayoutParams(40, 50));
	                     
	                     
	                     rowaction1=new TableRow(getApplicationContext());
		            		
	                     rowaction1.setLayoutParams(new LayoutParams(40, 50));
	                     rowaction2=new TableRow(getApplicationContext());
		            		
	                     rowaction2.setLayoutParams(new LayoutParams(40, 50));
	            		
	                    /* textdotP=new TextView(this);
	                     textdotP.setText("*");
	             		
	                     textdotP.setPadding(5, 5, 0, 2);
	                     textdotP.setTextSize(20);
	                     textdotP.setTextColor(Color.parseColor("#437392"));
	                     textdotP.setTypeface(null, Typeface.BOLD);*/
	             		
	            		
	                     tvname1=new TextView(this);
		            		tvname1.setText("Name");
		            		tvname1.setPadding(40, 0, 0, 5);
		            		tvname1.setTextSize(20);
		            		
		            		tvage1=new TextView(this);
		            		tvage1.setText("Age");
		            		tvage1.setPadding(40, 0, 0, 5);
		            		tvage1.setTextSize(20);
		            		
		            		tvcity1=new TextView(this);
		            		tvcity1.setText("City");
		            		tvcity1.setPadding(40, 0, 0, 5);
		            		tvcity1.setTextSize(20);
		            		
		            		tvgender1=new TextView(this);
		            		tvgender1.setText("Gender");
		            		tvgender1.setPadding(40, 0, 0,30);
		            		tvgender1.setTextSize(20);
		            		
	            		tvname=new TextView(this);
	            		tvname.setText(getName);
	            		tvname.setPadding(40, 0, 0, 5);
	            		tvname.setTextSize(20);
	            		
	            		tvage=new TextView(this);
	            		tvage.setText(getage);
	            		tvage.setPadding(40, 0, 0, 5);
	            		tvage.setTextSize(20);
	            		
	            		tvcity=new TextView(this);
	            		tvcity.setText(getcity);
	            		tvcity.setPadding(40, 0, 0, 5);
	            		tvcity.setTextSize(20);
	            		
	            		tvgender=new TextView(this);
	            		tvgender.setText(getgender);
	            		tvgender.setPadding(40, 0, 0,30);
	            		tvgender.setTextSize(20);
	            		
	            		

	     	            tvactionedit=new TextView(this);
	     	            tvactionedit.setText("Edit");
	     	           tvactionedit.setId(getID);
	     	             tvactionedit.setPadding(30, 0, 0,0);
	     	            tvactionedit.setTextColor(Color.BLUE);
	     	            tvactionedit.setTextSize(16);	
		            		

	     	            
	     	            tvactiondelete=new TextView(this);
	     	           tvactiondelete.setText("Delete");
	     	          tvactiondelete.setTextColor(Color.RED);
	     	          tvactiondelete.setId(getID);
	     	        tvactiondelete.setPadding(30, 0, 0,20);
	     	         tvactiondelete.setTextSize(16);	
		            		
		            		
	            		
	            		
	            		
	            		
	     	        rowname.addView(tvname1);
	                   rowage.addView(tvage1);
	                   rowcity.addView(tvcity1);
	                   rowgender.addView(tvgender1);

	            		
	                   rowname.addView(tvname);
	                   rowage.addView(tvage);
	                   rowcity.addView(tvcity);
	                   rowgender.addView(tvgender);
	                   
	                   rowaction1.addView(tvactionedit);
	                   rowaction2.addView(tvactiondelete);
	                   
	                   
	                   tvactiondelete.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								
								  int textIDDLT =v.getId();
								  //String  textIDname_DLT =(String) v.getTag();
							 
							       
					
					
					delete_dialog=new Dialog(FetchData.this);
					delete_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
					//edit_dialog.setTitle("Edit Your Term...");
					delete_dialog.setContentView(R.layout.delete_reports);
					alert_btndltyesCR = (Button)delete_dialog.findViewById(R.id.btndlt_YES_CR);
					alert_btndltnoCR = (Button)delete_dialog.findViewById(R.id.btndlt_NO_CR);
					 textIDnameSTR_DLT= String.valueOf(textIDDLT);
					 System.out.println("{}{}{}{}{}{}{}{}{}{}+++++++++++++++++++++"+textIDnameSTR_DLT);
					alert_btndltyesCR.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							isInternetOnDELETE_CR();
						}
								
						});
					alert_btndltnoCR.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							delete_dialog.cancel();
						}
					});
					delete_dialog.show();
				    
				

							}
	            		});
	                   
	                   tvactionedit.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								
								  int textedit =v.getId();
								 System.out.println("id is"+textedit);
								 texteditstr= String.valueOf(textedit);
							 
							   //Toast.makeText(getApplicationContext(), text, duration)    
					
								 SharedPreferences sp= getApplicationContext().getSharedPreferences(PREF_SHAREDedit, Context.MODE_PRIVATE);
					          		Editor edt=sp.edit();
					          		edt.putString("edt_idcr", texteditstr);
					          		
					          		System.out.println("************************" + edt.toString());
					          		edt.commit();
								Intent iGoEditcr = new Intent(FetchData.this,OnclickEdit.class);
								startActivity(iGoEditcr);
					
				    
				

							}
	            		});
	                
	                  
	                  tabLayout.addView(rowname,new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT)); 
	                  tabLayout.addView(rowage,new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
	                  tabLayout.addView(rowcity,new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
	                  tabLayout.addView(rowgender,new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
	                  tabLayout.addView(rowaction1,new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
	                  tabLayout.addView(rowaction2,new TableLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
	     	   }
	          
	 	

	        }catch (JSONException e) {


	    e.printStackTrace();
	   }
	  
	      return true;
	      
	  } else if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||  connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {
	    
	   Toast.makeText(this, "Please check your Internet connection, Internet is not Connected! ", Toast.LENGTH_LONG).show();
	   
		  
		   
	      return false;
	  }
	   return false;
	 }

	public final boolean isInternetOnDELETE_CR() {
	    
	    // get Connectivity Manager object to check connection
	 ConnectivityManager connec =  (ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);
	 
	    // Check for network connections
	  if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
	       connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
	       connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
	       connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {
	     
	   // if connected with internet
	   
	      //Toast.makeText(this, "Internet is Connected ", Toast.LENGTH_LONG).show();
	   new DELETET_CUSTOMERReport().execute();
		   
		  /* SendHttpRequestTask t = new SendHttpRequestTask();
		   String[] params = new String[]{url, param1, param2};
		   t.execute(params);*/
		   
	      return true;
	      
	  } else if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||  connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {
	    
	  // Toast.makeText(this, "Internet Not Connected, Connect it first! ", Toast.LENGTH_LONG).show();
		   new AlertDialog.Builder(FetchData.this).setTitle("Alert....").setMessage("Internet Not Connected, Connect it first! ").setNeutralButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Intent inotr =new Intent(FetchData.this,FetchData.class);
					startActivity(inotr);
					finish();
					dialog.cancel();
				
		   }
		}).create().show();
	      return false;
	      
	  }
	   return false;
	 }


	class DELETET_CUSTOMERReport extends AsyncTask<String, Void, String>{ 
		
		@Override
	    protected void onPreExecute() {
	        super.onPreExecute();
	        pDialog2 = new ProgressDialog(FetchData.this);
	        pDialog2.setMessage("Loading...");
	       // pDialog.setIndeterminate(false);
	        pDialog2.setCancelable(false);
	        pDialog2.show();
	        
	        lockScreenOrientation2();
	    }
		
			@Override
			protected String doInBackground(String... params) {
				//String paramurl = upLoadServerUri;
				//String paramtype = addprptTypeValue; //params[0];
				String paramiddelete = textIDnameSTR_DLT;//params[1];
				
				
				
				
				
	        System.out.println(paramiddelete);
				HttpClient httpClient = new DefaultHttpClient();
				
				
				
				
	//http://www.jaipurplots.com/webservices/post-property.php?type="+paramcategory+"&scheme="+paramscheme+"&area="+paramarea+"&location="+paramlocation+"&price="+paramprice+"&contact="paramcontact+"&name="paramname+"&description="paramprodtl
				
				deletetermAll = "http://www.jaipurplots.com/webservices/test1/action.php?action=delete&id="+paramiddelete;
				System.out.println(deletetermAll);
				deletetermAll = deletetermAll.replace(" ", "%20");
				 HttpGet httpGet = new HttpGet(deletetermAll);
				 
				 
				try {
					
					
					HttpResponse httpResponse = httpClient.execute(httpGet);
					System.out.println("httpResponse"); 

					InputStream inputStream = httpResponse.getEntity().getContent();
					InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
				     bufferedReader2 = new BufferedReader(inputStreamReader);

					System.out.println("#####################"+bufferedReader2);
					 stringBuilder2 = new StringBuilder();
					String bufferedStrChunk = null;
					while((bufferedStrChunk = bufferedReader2.readLine()) != null){
						stringBuilder2.append(bufferedStrChunk);
						
					}

					System.out.println("Returning value of doInBackground :" + stringBuilder2.toString());
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%" + stringBuilder2.toString() );
									
					return stringBuilder2.toString();

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
	            if (pDialog2 != null) {
	                pDialog2.dismiss();
	                pDialog2 = null;
	            }
	        }

			// Argument comes for this method according to the return type of the doInBackground() and
			//it is the third generic type of the AsyncTask
			@Override
			protected void onPostExecute(String result) {
				super.onPostExecute(result);
				pDialog2.dismiss();
				
			try {
				JSONObject json = new JSONObject(stringBuilder2.toString());
		        System.out.println(json);
		        
		       // if(json.has("api_result")){
		            JSONArray resultJsonArr;
		   
		    resultJsonArr = json.getJSONArray("DeleteRecord");
		    System.out.println(resultJsonArr);
		     for(int j=0; j<resultJsonArr.length(); j++){
		    	 
		                  JSONObject jsonResult = resultJsonArr.getJSONObject(j);
		                  
		                  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&"+jsonResult);
		                  
		                  unlockScreenOrientation2();
		                  
		            
		             	 new AlertDialog.Builder(FetchData.this).setMessage("Successfully Deleted." ).setNeutralButton("OK", new DialogInterface.OnClickListener() {
			      				
			      				@Override
			      				public void onClick(DialogInterface dialog, int which) {
			      					Intent gorefreshIntent  =new Intent(FetchData.this,FetchData.class);
			      					startActivity(gorefreshIntent);
			      					finish();
			      					dialog.cancel();
			      				
			      		   }
			      		}).create().show();   
		                delete_dialog.cancel();               
		       }
		    
		   }catch (JSONException e) {


			    e.printStackTrace();
			   }
	}
		}
	
	
	private void lockScreenOrientation2() {
	    int currentOrientation = getResources().getConfiguration().orientation;
	    if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	    } else {
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	    }
	}
	 
	   private void unlockScreenOrientation2() {
	    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
	}
	  

	
}
