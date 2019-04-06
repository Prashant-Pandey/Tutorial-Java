package com.example.fact;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fact extends Activity {
	
	Button b;
	EditText et;
	TextView tv1;
	TextView tv2;
	int f=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design_1);
	
	b=(Button)findViewById(R.id.button1);
	et=(EditText)findViewById(R.id.editText1);
	tv1=(TextView)findViewById(R.id.textView1);
	tv2=(TextView)findViewById(R.id.textView2);
	
	b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View argView0) {
			// TODO Auto-generated method stub
			String s=et.getText().toString();
		int d=Integer.parseInt(s);
		for (int i=1; i<=d; i++) {
			f=f*i;
		tv2.setText(f);
		//tv2.setText("Result Error");
		}
		et.setText(null);
		}
	});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design_1, menu);
		return true;
	}

}
