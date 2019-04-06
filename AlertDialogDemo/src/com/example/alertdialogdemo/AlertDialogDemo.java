package com.example.alertdialogdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogDemo extends Activity {
	Button alt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alert_dialog_demo);
		alt=(Button)findViewById(R.id.button1);
		alt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog a =new AlertDialog.Builder(AlertDialogDemo.this).create();
				a.setTitle("JECRC");
				a.setMessage("Welcome");
				a.setButton("Student", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(AlertDialogDemo.this, "Hello", 111).show();
					}
				});
				a.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_alert_dialog_demo, menu);
		return true;
	}
}
