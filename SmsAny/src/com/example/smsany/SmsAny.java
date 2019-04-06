package com.example.smsany;

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

public class SmsAny extends Activity {
	
	Button add,msg;
	EditText ed,ed1;
	static String s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sms_any);
			add=(Button)findViewById(R.id.button2);
			msg=(Button)findViewById(R.id.button1);
			ed=(EditText)findViewById(R.id.editText1);
			ed1=(EditText)findViewById(R.id.editText2);
	        add.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(SmsAny.this,ListofNum.class);
					startActivity(i);
				    s=ed.getText().toString();
					i=getIntent();
					startActivity(i);
					ed1.setText(i.getStringExtra("k"));
				}
			});
			msg.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					try{
						SmsManager sm=SmsManager.getDefault();
						sm.sendTextMessage(ed1.toString(), null, ed.getText().toString(), null, null);
						 Toast.makeText(SmsAny.this, "SMS Sent", 111).show();
					}catch (Exception e) {
						// TODO: handle exception
						Toast.makeText(SmsAny.this, "Plzz Try Again", 111).show();
					}
				}
			});
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sms_any, menu);
		return true;
	}

}
