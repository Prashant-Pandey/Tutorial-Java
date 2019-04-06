package com.example.checkbut;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckBut extends Activity {
	RadioGroup rg;
	RadioButton bt;
	Button b;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_but);
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				int i= rg.getCheckedRadioButtonId();
				bt=(RadioButton)findViewById(i);
				Toast.makeText(CheckBut.this, "Gender-->>"+bt.getText().toString(), 11).show();
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_check_but, menu);
		return true;
	}

}
