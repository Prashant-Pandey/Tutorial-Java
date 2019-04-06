package com.example.quiz_sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question5 extends Activity {
	RadioGroup r5;
	RadioButton bt5;
	Button s5,n5;
	Question1 q1=new Question1();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question5);
		s5=(Button)findViewById(R.id.button1);
		n5=(Button)findViewById(R.id.button2);
		r5=(RadioGroup)findViewById(R.id.radioGroup1);
		s5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i5= r5.getCheckedRadioButtonId();
				bt5=(RadioButton)findViewById(i5);
				if(i5==0x7f070005){
					q1.k++;
				}
				Intent i=new Intent(Question5.this,Result.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
		
		n5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i5= r5.getCheckedRadioButtonId();
				bt5=(RadioButton)findViewById(i5);
				if(i5==0x7f070008){
					q1.j++;
				}
				Intent i=new Intent(Question5.this,Result.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_question5, menu);
		return true;
	}

}
