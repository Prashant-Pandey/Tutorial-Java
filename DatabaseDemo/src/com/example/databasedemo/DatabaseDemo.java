package com.example.databasedemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DatabaseDemo extends Activity {
	EditText nm,fnm;
	Button b;
	DBTest dt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_database_demo);
		nm=(EditText)findViewById(R.id.editText1);
		fnm=(EditText)findViewById(R.id.editText2);
		b=(Button)findViewById(R.id.button1);
		dt=new DBTest(this);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				dt.insertvalue(nm.getText().toString(),fnm.getText().toString());
				Toast.makeText(DatabaseDemo.this, "Inserted", 111).show();
				nm.setText(null);
				fnm.setText(null);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_database_demo, menu);
		return true;
	}

}
