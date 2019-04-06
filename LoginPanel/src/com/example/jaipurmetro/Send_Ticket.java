package com.example.jaipurmetro;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Send_Ticket extends Activity {

	Button bu1,bu2;
	EditText eu1;
	String phoneNo;
	static int w;
	static String m,n;
	int o;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send__ticket);
		eu1=(EditText)findViewById(R.id.ed1);
		bu1=(Button)findViewById(R.id.b1);
		bu2=(Button)findViewById(R.id.b2);
		JaipurMetro t=new JaipurMetro();
		w=t.fare;
		m=t.e;
		n=t.q;
		bu1.setOnClickListener(new OnClickListener()
		    {
		    	public void onClick(View v)
		    	{
		    		phoneNo = eu1.getText().toString();
					 
					try 
					 	{
						o=phoneNo.length();
						if(o==10){
						
			 			SmsManager smsManager = SmsManager.getDefault();
			 			smsManager.sendTextMessage(phoneNo, null, "Your Metro Ticket Details: Fare = "+w+"From"+m+"To"+n, null, null);
			 			Toast.makeText(Send_Ticket.this, "SMS Sent.",Toast.LENGTH_LONG).show();}
						else{
							Toast.makeText(Send_Ticket.this, "The No. Should be equal to 10 digits",Toast.LENGTH_LONG).show();
						}
					}  
			catch (Exception e) 
			{
			 			Toast.makeText(Send_Ticket.this,"SMS failed,Please type message to send or Try Again",
			 			Toast.LENGTH_LONG).show();
			 			e.printStackTrace();
					}
		    		
		    	}
		    });
		 bu2.setOnClickListener(new OnClickListener()
		    {
		    	public void onClick(View v)
		    	{
		    		Intent u=new Intent(Send_Ticket.this,JaipurMetro.class);
		    		startActivity(u);
		    		finish();
		    	}
		    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_send__ticket, menu);
		return true;
	}

}
