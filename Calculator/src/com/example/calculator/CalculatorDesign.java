package com.example.calculator;

import com.example.calculator.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorDesign extends Activity {
	Button b1,b2,b3,bdiv,b5,b6,b7,bmul,b9,b10,b11,bsub,b13,b14,bequ,badd;
	EditText e1;
	String s1,s2;
	float a,b,c;
	boolean div,add,sub,mul;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_design);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		bdiv=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
		b7=(Button)findViewById(R.id.button7);
		bmul=(Button)findViewById(R.id.button8);
		b9=(Button)findViewById(R.id.button9);
		b10=(Button)findViewById(R.id.button10);
		b11=(Button)findViewById(R.id.button11);
		bsub=(Button)findViewById(R.id.button12);
		b13=(Button)findViewById(R.id.button13);
		b14=(Button)findViewById(R.id.button14);
		bequ=(Button)findViewById(R.id.button15);
		badd=(Button)findViewById(R.id.button16);
		e1=(EditText)findViewById(R.id.editText1);
		b1.setOnClickListener(new OnClickListener(){
	

	@Override
	public void onClick(View arg0){
		e1.setText(e1.getText()+"9");
	}
	});
		
		b2.setOnClickListener(new OnClickListener(){
		@Override
	
		public void onClick(View arg1){
			e1.setText(e1.getText()+"8");
		}
		});
		b3.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg2){
				e1.setText(e1.getText()+"7");
			}
			});
		b5.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg3){
				e1.setText(e1.getText()+"6");
			}
			});
		b6.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg4){
				e1.setText(e1.getText()+"5");
			}
			});
		b7.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg5){
				e1.setText(e1.getText()+"4");
			}
			});
		b9.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg6){
				e1.setText(e1.getText()+"3");
			}
			});
		b10.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg7){
				e1.setText(e1.getText()+"2");
			}
			});
		b11.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg8){
				e1.setText(e1.getText()+"1");
			}
			});
		b13.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg9){
				e1.setText(e1.getText()+"0");
			}
			});
		b14.setOnClickListener(new OnClickListener(){
			@Override
		
			public void onClick(View arg10){
				e1.setText(e1.getText()+".");
			}
			});
		bdiv.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg12){
				
			     s1=e1.getText().toString();
				 a=Float.parseFloat(s1);
				 div=true;
				 e1.setText(null);
			
				
			}
	    	 
	     });
			
		bmul.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg13){
			
				 s1=e1.getText().toString();
				 a=Float.parseFloat(s1);
				 mul=true;
				 e1.setText(null);
		
				
			}
	    	 
	     });
		bsub.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg14){
                
				 s1=e1.getText().toString();
				 a=Float.parseFloat(s1);
				 sub=true;
				 e1.setText(null);
            }
			
			 });
		badd.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg15){
		    
				 s1=e1.getText().toString();
				 a=Float.parseFloat(s1);
				 add=true;
				 e1.setText(null);
		    
			 }
	     });
	
bequ.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		s2=e1.getText().toString();
		 b=Float.parseFloat(s2);
		
		 if(div==true){
			 c=a/b;
			 String res=String.valueOf(c);
			 e1.setText(res);
		     div=false;
		 }
		 if(mul==true)
		 {
			 c=a*b;
			 String res=String.valueOf(c);
			 e1.setText(res);
			 mul=false;
		 }
		 if(sub==true){
			 c=a-b;
			 String res=String.valueOf(c);
			 e1.setText(res);
			 sub=false;
		 }
		 if(add==true){
			 c=a+b;
			 String res=String.valueOf(c);
			 e1.setText(res);
			 add=false;
		 }
		 }
		 });
}}