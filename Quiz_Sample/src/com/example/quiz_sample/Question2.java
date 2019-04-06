package com.example.quiz_sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question2 extends Activity {
	RadioGroup r2;
	RadioButton bt2;
	Button s2,n2;
	Question1 q1=new Question1();
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question2);
		s2=(Button)findViewById(R.id.button1);
		n2=(Button)findViewById(R.id.button2);
		r2=(RadioGroup)findViewById(R.id.radioGroup1);
		s2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i2= r2.getCheckedRadioButtonId();
				bt2=(RadioButton)findViewById(i2);
				if(i2==0x7f070004){
					q1.k++;
				}
				Intent i=new Intent(Question2.this,Question3.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
		
		n2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i2= r2.getCheckedRadioButtonId();
				bt2=(RadioButton)findViewById(i2);
				if(i2==0x7f070008){
					q1.j++;
				}
				Intent i=new Intent(Question2.this,Question3.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_question2, menu);
		return true;
	}

}
