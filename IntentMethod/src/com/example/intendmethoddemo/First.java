package com.example.intendmethoddemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class First extends Activity {
	
	Button ok;
	EditText ed1;
	TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		ok=(Button)findViewById(R.id.button1);
		ed1=(EditText)findViewById(R.id.editText1);
		tv1=(TextView)findViewById(R.id.textView1);
		ok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i =new Intent(First.this,Second2.class);
				String s = ed1.getText().toString();
				i.putExtra("k", s);
				startActivity(i);	
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first, menu);
		return true;
	}

}
