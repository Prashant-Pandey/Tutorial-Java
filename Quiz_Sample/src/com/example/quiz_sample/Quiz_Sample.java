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
import android.widget.Toast;

public class Quiz_Sample extends Activity {
	
	Button b;
	EditText e,e1;
	TextView t;
	String u="admin";
	String p="12345";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz__sample);
		b=(Button)findViewById(R.id.button1);
		e=(EditText)findViewById(R.id.editText1);
		e1=(EditText)findViewById(R.id.editText2);
		t=(TextView)findViewById(R.id.textView1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s=e.getText().toString();
				
				String s1=e1.getText().toString();
				if(s1.length()==0||s.length()==0){
					Toast.makeText(Quiz_Sample.this, "Plz Try Again", 11).show();
					}
					else if(s.equals(u) && s1.equals(p)){
					Toast.makeText(Quiz_Sample.this, "Welcome to Quiz", Toast.LENGTH_LONG).show();
					Intent i=new Intent(Quiz_Sample.this,Question1.class);
					i.putExtra("n", s);
					i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
					startActivity(i);
					}	
					else{
						Toast.makeText(Quiz_Sample.this, "Invalid User ", 11).show();	
					}
				//Intent i=new Intent(Quiz_Sample.this,Question1.class);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_quiz__sample, menu);
		return true;
	}

}
