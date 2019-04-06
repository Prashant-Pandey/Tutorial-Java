package com.example.demo_toast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Demo_Toast extends Activity implements OnClickListener{
	
	EditText n,m;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo__toast);
		m=(EditText)findViewById(R.id.editText2);
		n=(EditText)findViewById(R.id.editText1);
		Button b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_demo__toast, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		String s= n.getText().toString();
		String s1= m.getText().toString();
		s.trim();
		s1.trim();
		if(s1.length()==0||s.length()==0){
		Toast.makeText(Demo_Toast.this, "Plz Try Again", 11).show();
		}
		else{
		Toast.makeText(Demo_Toast.this, "Welcome to Toast", Toast.LENGTH_LONG).show();

		}	
	}

}
