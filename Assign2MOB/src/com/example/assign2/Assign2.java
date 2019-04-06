package com.example.assign2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assign2 extends Activity {
	
	Button b;
	EditText ed, ed2, ed3, ed4;
	TextView tv,tv2,tv3,tv4,tv5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design);
		
		b= (Button)findViewById(R.id.button1);
		ed=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		ed3=(EditText)findViewById(R.id.editText3);
		ed4=(EditText)findViewById(R.id.editText4);
		tv=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		tv4=(TextView)findViewById(R.id.textView4);
		tv5=(TextView)findViewById(R.id.textView5);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String s= ed.getText().toString();
				tv5.setText(s);
				ed.setText(null);
				
				String s1= ed2.getText().toString();
				tv5.setText(s+" "+s1);
				ed2.setText(null);
				
				String s2= ed3.getText().toString();
				if (s2.length()==10)
				{
					tv5.setText(s+" "+s1+" "+s2);
				}
				else
				{
					System.out.print("Invalid Mobile Number");
				}
				//tv5.setText(s+" "+s1+" "+s2);
				ed3.setText(null);
				
				String s3= ed4.getText().toString();
				tv5.setText(s+" "+s1+" "+s2+" "+s3);
				ed4.setText(null);
			
			if((ed==null)&&(ed2==null)&&(ed3==null)&&(ed4==null))
			{
			 System.out.print("Error Any one is blank");
			}
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
