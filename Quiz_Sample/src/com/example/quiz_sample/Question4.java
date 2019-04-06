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

public class Question4 extends Activity {
	RadioGroup r4;
	RadioButton bt4;
	Button s4,n4;
	Question1 q1=new Question1();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question4);
		s4=(Button)findViewById(R.id.button1);
		n4=(Button)findViewById(R.id.button2);
		r4=(RadioGroup)findViewById(R.id.radioGroup1);
		s4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i4= r4.getCheckedRadioButtonId();
				bt4=(RadioButton)findViewById(i4);
				if(i4==0x7f070006){
					q1.k++;
				}
				Intent i=new Intent(Question4.this,Question5.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		}); 
		n4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i4= r4.getCheckedRadioButtonId();
				bt4=(RadioButton)findViewById(i4);
				if(i4==0x7f070008){
					q1.j++;
				}
				Intent i=new Intent(Question4.this,Question5.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_question4, menu);
		return true;
	}

}
