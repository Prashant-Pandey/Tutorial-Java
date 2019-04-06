package com.example.demo_calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Demo_Calc extends Activity {

	Button b1,b2,add;
	EditText e1;
	static String s1,s2;
	static int a,b,c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design__calc);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button3);
		add=(Button)findViewById(R.id.button2);
		e1=(EditText)findViewById(R.id.editText1);
		
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0){ 
				// TODO Auto-generated method stub
			e1.setText("5"); 
			}
		});

		b2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			 e1.setText("6");		
			}
		});
		add.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0){ 
				// TODO Auto-generated method stub
			if(a==0){
			s1=e1.getText().toString();
			a=Integer.parseInt(s1);
			e1.setText(null);
			}
			else{
				s2=e1.getText().toString();
				b=Integer.parseInt(s2);
				c=a+b;
				String res=String.valueOf(c);
				e1.setText(res);
				}
			}
		});
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design__calc, menu);
		return true;
	}

}
