package com.example.calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends Activity {
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	EditText e;
	static String s1,s2,res;
	static double a,b,c;
	boolean add,sub,mul,div;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design_calc);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
		b7=(Button)findViewById(R.id.button7);
		b8=(Button)findViewById(R.id.button8);
		b9=(Button)findViewById(R.id.button9);
		b10=(Button)findViewById(R.id.button10);
		b11=(Button)findViewById(R.id.button11);
		b12=(Button)findViewById(R.id.button12);
		b13=(Button)findViewById(R.id.button13);
		b14=(Button)findViewById(R.id.button14);
		b15=(Button)findViewById(R.id.button15);
		b16=(Button)findViewById(R.id.button16);
		b17=(Button)findViewById(R.id.button17);
		e=(EditText)findViewById(R.id.editText1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				e.setText(e.getText()+"1"); 
					
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				e.setText(e.getText()+"2"); 
				
			}
		});

		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				e.setText(e.getText()+"3"); 
				
			}
		});

		b4.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"4"); 
				
			}
		});

		b5.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"5"); 
					
			}
		});
		b6.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"6"); 
				
			}
		});
		b7.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"7"); 
				
			}
		});

		b8.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"8"); 
				
			}
		});

		b9.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"9"); 
				
			}
		});

		b10.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"0"); 
				
			}
		});

		b11.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				e.setText(e.getText()+"."); 
				
			}
		});
		b13.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
					s1=e.getText().toString();
					a=Double.parseDouble(s1);
					e.setText(null);
					add=true;
			}
		});

		b14.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
					s1=e.getText().toString();
					a=Double.parseDouble(s1);
					e.setText(null);
					sub=true;	
			}
		});

		b15.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
					s1=e.getText().toString();
					a=Double.parseDouble(s1);
					e.setText(null);
						mul=true;		
			}
		});

		b16.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
					s1=e.getText().toString();
					a=Double.parseDouble(s1);
					e.setText(null);
					div=true;
			}
		});


		b12.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
		// TODO Auto-generated method stub
				s2=e.getText().toString();
				b=Double.parseDouble(s2);
				
				if(add=true){
				c=a+b;
			    res=String.valueOf(c);		
				e.setText(res);
				add=false;
				}
				
				if(sub=true){
					c=a-b;
				    res=String.valueOf(c);
				e.setText(res);
				sub=false;
				}
				if(mul=true){
					c=a*b;
				    res=String.valueOf(c);
				e.setText(res);
				mul=false;
				}
				if(div=true){
			    c=a/b;
				res=String.valueOf(c);
				e.setText(res);
				div=false;
				}
			}
		});
		


		b17.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				e.setText(null);
				s1=null;
				s2=null;
				a=0;
				b=0;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design_calc, menu);
		return true;
	}

}
