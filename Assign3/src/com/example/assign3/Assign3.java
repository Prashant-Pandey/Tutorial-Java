package com.example.assign3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assign3 extends Activity {

	Button b1,b2,b3,b4,b5,b6;
	EditText e1,e2,e3;
	TextView t1,t2,t3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout);
		
		b1= (Button)findViewById(R.id.button1);
		b2= (Button)findViewById(R.id.button2);
		b3= (Button)findViewById(R.id.button3);
		b4= (Button)findViewById(R.id.button4);
		b5= (Button)findViewById(R.id.button5);
		b6= (Button)findViewById(R.id.button6);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String s=e1.getText().toString();
				String s1=e2.getText().toString();
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
		

		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String s=e1.getText().toString();
				String s1=e2.getText().toString();
				try
	            {
	            double x = Double.parseDouble(s);
	            double y = Double.parseDouble(s1);
	            double res = x - y;
	            t3.setText("Result = " + res);
	            }catch(Exception ex){
	                
	                t3.setText("Result Error = " + ex.getMessage());
	            }
				e1.setText(null);
				e2.setText(null);
			}
		});
		
  
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String s=e1.getText().toString();
				String s1=e2.getText().toString();
				try
	            {
	            double x = Double.parseDouble(s);
	            double y = Double.parseDouble(s1);
	            double res = x * y;
	            t3.setText("Result = " + res);
	            }catch(Exception ex){
	                
	                t3.setText("Result Error = " + ex.getMessage());
	            }
				e1.setText(null);
				e2.setText(null);
			}
		});
	
b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String s=e1.getText().toString();
				String s1=e2.getText().toString();
				try
	            {
	            double x = Double.parseDouble(s);
	            double y = Double.parseDouble(s1);
	            double res = x / y;
	            t3.setText("Result = " + res);
	            }catch(Exception ex){
	                
	                t3.setText("Result Error = " + ex.getMessage());
	            }
				e1.setText(null);
				e2.setText(null);
			}
		});
	b5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		String s=e1.getText().toString();
		String s1=e2.getText().toString();
		try
        {
        double x = Double.parseDouble(s);
        double y = Double.parseDouble(s1);
        double res = x % y;
        t3.setText("Result = " + res);
        }catch(Exception ex){
            
            t3.setText("Result Error = " + ex.getMessage());
        }
		e1.setText(null);
		e2.setText(null);
	}
});
	b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			e1.setText(null);
			e2.setText(null);
			e3.setText(null);
		}
	});
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout, menu);
		return true;
	}

}
