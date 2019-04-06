package com.example.foodcornerdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SelectedItems extends Activity implements OnClickListener{
	 TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,
	 tv20,tv21,tv22,tv23,tv24,tv25,tv26,tv27,tv28,tv29;
     Button b1,b2;
     //int num1,num2,num3,num4,num5,num6,num7,num8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selected_items);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		tv4=(TextView)findViewById(R.id.textView4);
		tv5=(TextView)findViewById(R.id.textView5);
		tv6=(TextView)findViewById(R.id.textView6);
		tv7=(TextView)findViewById(R.id.textView7);
		tv8=(TextView)findViewById(R.id.textView8);
		tv9=(TextView)findViewById(R.id.textView9);
		tv10=(TextView)findViewById(R.id.textView10);
		tv11=(TextView)findViewById(R.id.textView11);
		tv12=(TextView)findViewById(R.id.textView12);
		tv13=(TextView)findViewById(R.id.textView13);
		tv14=(TextView)findViewById(R.id.textView14);
		tv15=(TextView)findViewById(R.id.textView15);
		tv16=(TextView)findViewById(R.id.textView16);
		tv17=(TextView)findViewById(R.id.textView17);
		tv18=(TextView)findViewById(R.id.textView18);
		tv19=(TextView)findViewById(R.id.textView19);
		tv20=(TextView)findViewById(R.id.textView20);
		tv21=(TextView)findViewById(R.id.textView21);
		tv22=(TextView)findViewById(R.id.textView22);
		tv23=(TextView)findViewById(R.id.textView23);
		tv24=(TextView)findViewById(R.id.textView24);
		tv25=(TextView)findViewById(R.id.textView25);
		tv26=(TextView)findViewById(R.id.textView26);
		tv27=(TextView)findViewById(R.id.textView27);
		tv28=(TextView)findViewById(R.id.textView28);
		tv29=(TextView)findViewById(R.id.textView29);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b1.setOnClickListener(this);
		
		{
		Intent i=getIntent();
		String s=i.getStringExtra("p1");
		tv5.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("p2");
		tv6.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("p3");
		tv7.setText(s);
		//num1=Integer.parseInt(s);
		}
		
		{
		Intent i1=getIntent();
		String s1=i1.getStringExtra("b1");
		tv8.setText(s1);
		}
		{
		Intent i1=getIntent();
		String s1=i1.getStringExtra("b2");
		tv9.setText(s1);
		}
		{
		Intent i1=getIntent();
		String s1=i1.getStringExtra("b3");
		tv10.setText(s1);
		//num2=Integer.parseInt(s1);
		}
		
		{
		Intent i=getIntent();		
		String s=i.getStringExtra("vs1");
		tv11.setText(s);
		}
		{
	    Intent i=getIntent();
		String s=i.getStringExtra("vs2");
		tv12.setText(s);
		}
		{
		Intent i=getIntent();	
		String s=i.getStringExtra("vs3");
		tv13.setText(s);
		//num3=Integer.parseInt(s);
		}
		
		{
		Intent i=getIntent();		
		String s=i.getStringExtra("gs1");
		tv14.setText(s);
		}
		{
		Intent i=getIntent();	
		String s=i.getStringExtra("gs2");
		tv15.setText(s);
		}	
		{
		Intent i=getIntent();
		String s=i.getStringExtra("gs3");
		tv16.setText(s);
		//num4=Integer.parseInt(s);
		}
		
		{
		Intent i=getIntent();
		String s=i.getStringExtra("ch1");
		tv17.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("ch2");
		tv18.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("ch3");
		tv19.setText(s);
		//num5=Integer.parseInt(s);
		}
		
		{
		Intent i=getIntent();	
		String s=i.getStringExtra("f1");
		tv20.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("f2");
		tv21.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("f3");
		tv22.setText(s);
		//num6=Integer.parseInt(s);
		}
		
		{
       	Intent i=getIntent();	
		String s=i.getStringExtra("m1");
		tv23.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("m2");
		tv24.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("m3");
		tv25.setText(s);
		//num7=Integer.parseInt(s);
		}
		
		{
		Intent i=getIntent();	
		String s=i.getStringExtra("ff1");
		tv26.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("ff2");
		tv27.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("ff3");
		tv28.setText(s);
		//num8=Integer.parseInt(s);
		}
		//int sum=num1+num2+num3+num4+num5+num6+num7+num8;
		//tv29.setText(sum);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_selected_items, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.button2){
			Intent i=new Intent(SelectedItems.this,FoodCornerDemo.class);
			startActivity(i);
			Toast.makeText(SelectedItems.this, "Select again",111).show();
		}
		else{
			Intent i=new Intent(SelectedItems.this,FoodCornerDemo.class);
			startActivity(i);
			//Toast.makeText(SelectedItems.this,""+String.valueOf(tv17),Toast.LENGTH_LONG).show();
		}
	}	
	}