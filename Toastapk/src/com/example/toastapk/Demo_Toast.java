package com.example.toastapk;

import com.example.toastapk.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Demo_Toast extends Activity implements OnClickListener{
         EditText ed1,ed2;
         TextView tv1,tv2;
         Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo__toast);
		 b1=(Button)findViewById(R.id.button1);
	        
	        ed1=(EditText)findViewById(R.id.editText1);
	        ed2=(EditText)findViewById(R.id.editText2);
	        tv1=(TextView)findViewById(R.id.textView1);
	        tv2=(TextView)findViewById(R.id.textView2);
	       
	        b1.setOnClickListener(this);
	       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_demo__toast, menu);
		return true;
	}
	public void onClick(View v){
		String s1=ed1.getText().toString();
		String s2=ed2.getText().toString();
		if(s1.length()==0||s2.length()==0){
		Toast.makeText(Demo_Toast.this, "plz try again", 111).show();
		}
		else
		{Toast.makeText(Demo_Toast.this, "welcome to login",Toast.LENGTH_LONG).show();
	}
}}
