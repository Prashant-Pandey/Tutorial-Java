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

public class Question1 extends Activity {
	RadioGroup r;
	RadioButton bt;
	Button s,n;
	int k=0,j=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question1);
		s=(Button)findViewById(R.id.button1);
		n=(Button)findViewById(R.id.button2);
		r=(RadioGroup)findViewById(R.id.radioGroup1);
		s.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i1= r.getCheckedRadioButtonId();
				bt=(RadioButton)findViewById(i1);
				if(i1==0x7f070004){
					k++;
				}
				Intent i=new Intent(Question1.this,Question2.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
		n.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i1= r.getCheckedRadioButtonId();
				bt=(RadioButton)findViewById(i1);
				if(i1==0x7f070008){
					j++;
				}
				Intent i=new Intent(Question1.this,Question2.class);
				i.setFlags(i.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_question1, menu);
		return true;
	}

}
