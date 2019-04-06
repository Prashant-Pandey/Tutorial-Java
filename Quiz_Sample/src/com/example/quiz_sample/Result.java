package com.example.quiz_sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends Activity {
	EditText e1,e2,e3,e4;
	TextView t1,t2,t3,t4,t5;
	Button b;
	Quiz_Sample q = new Quiz_Sample();
	Question1 q1 = new Question1();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		e4=(EditText)findViewById(R.id.editText4);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		t4=(TextView)findViewById(R.id.textView4);
		t5=(TextView)findViewById(R.id.textView5);
		b=(Button)findViewById(R.id.button1);
		Intent i= getIntent();
		String d = i.getStringExtra("n");
		e1.setText(d);  
		e2.setText(q1.k);
		e3.setText(q1.j);
		
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			  
				Intent i1=new Intent(Result.this,Quiz_Sample.class);
				i1.setFlags(i1.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i1);	
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}

}
