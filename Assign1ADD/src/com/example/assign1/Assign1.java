package com.example.assign1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assign1 extends Activity {
	
	Button b;
	EditText e1;
	EditText e2;
	EditText e3;
	TextView t1;
	TextView t2;
	TextView t3;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design);
		
		b=(Button)findViewById(R.id.button1);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s=e1.getText().toString();
				//t1.setText(s);
				String s1=e2.getText().toString();
				//t2.setText(s1);
	            try
	            {
	            double x = Double.parseDouble(s);
	            double y = Double.parseDouble(s1);
	            double res = x + y;
	            t3.setText("Result = " + res);
	            }catch(Exception ex){
	                 t3.setText("Result Error = " + ex.getMessage());
	            }
				e1.setText(null);
				e2.setText(null);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design, menu);
		return true;
	}

}
