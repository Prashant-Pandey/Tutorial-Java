package com.example.smsdemo;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SMSDemo extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smsdemo);
		Button snt=(Button)findViewById(R.id.button1);
		snt.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_smsdemo, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		try{
			SmsManager sm=SmsManager.getDefault();
			sm.sendTextMessage("9828134900", null, "Hello ", null, null);
			 Toast.makeText(SMSDemo.this, "SMS Sent", 111).show();
		}catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(SMSDemo.this, "Plzz Try Again", 111).show();
		}
	}

}
