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

public class Question3 extends Activity {
	RadioGroup r3;
	RadioButton bt3;
	Button s3,n3;
	Question1 q1=new Question1();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question3);
		s3=(Button)findViewById(R.id.button1);
		n3=(Button)findViewById(R.id.button2);
		r3=(RadioGroup)findViewById(R.id.radioGroup1);
		s3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i3= r3.getCheckedRadioButtonId();
				bt3=(RadioButton)findViewById(i3);
				if(i3==0x7f070006){
					q1.k++;
				}
				Intent i=new Intent(Question3.this,Question4.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
		n3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i3= r3.getCheckedRadioButtonId();
				bt3=(RadioButton)findViewById(i3);
				if(i3==0x7f070008){
					q1.j++;
				}
				Intent i=new Intent(Question3.this,Question4.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_question3, menu);
		return true;
	}

}
