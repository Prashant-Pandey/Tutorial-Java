package com.example.foodcornerdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class FoodCornerDemo extends Activity {
	CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
	Spinner s1,s2,s3,s4,s5,s6,s7,s8;
	Button g;
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
	String[] s={"select_no","1","2","3","4","5","6","7","8","9"};
	int sum,sum2,sum3,sum4,sum5,sum6,sum7,sum8;
	int d1,d2,d3,d4,d5,d6,d7,d8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food_corner_demo);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);
		c4=(CheckBox)findViewById(R.id.checkBox4);
		c5=(CheckBox)findViewById(R.id.checkBox5);
		c6=(CheckBox)findViewById(R.id.checkBox6);
		c7=(CheckBox)findViewById(R.id.checkBox7);
		c8=(CheckBox)findViewById(R.id.checkBox8);
		s1=(Spinner)findViewById(R.id.spinner1);
		s2=(Spinner)findViewById(R.id.spinner2);
		s3=(Spinner)findViewById(R.id.spinner3);
		s4=(Spinner)findViewById(R.id.spinner4);
		s5=(Spinner)findViewById(R.id.spinner5);
		s6=(Spinner)findViewById(R.id.spinner6);
		s7=(Spinner)findViewById(R.id.spinner7);
		s8=(Spinner)findViewById(R.id.spinner8);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		t4=(TextView)findViewById(R.id.textView4);
		t5=(TextView)findViewById(R.id.textView5);
		t6=(TextView)findViewById(R.id.textView6);
		t7=(TextView)findViewById(R.id.textView7);
		t8=(TextView)findViewById(R.id.textView8);
		t9=(TextView)findViewById(R.id.textView9);
		g=(Button)findViewById(R.id.button1);
		ArrayAdapter<String>ar=new ArrayAdapter<String>(FoodCornerDemo.this,android.R.layout.simple_dropdown_item_1line,s);
		s1.setAdapter(ar);
		s2.setAdapter(ar);
		s3.setAdapter(ar);
		s4.setAdapter(ar);
		s5.setAdapter(ar);
		s6.setAdapter(ar);
		s7.setAdapter(ar);
		s8.setAdapter(ar);
		s1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d1=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d2=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s3.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d3=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s4.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d4=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s5.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d5=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s6.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d6=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s7.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d7=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		s8.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(FoodCornerDemo.this,""+arg2,11).show();
				d8=arg2;
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		g.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(FoodCornerDemo.this,SelectedItems.class);
					if(c1.isChecked()==true)
					{
					sum=d1*120;
			        i.putExtra("p1",String.valueOf(c1.getText()));
			        i.putExtra("p2",String.valueOf(d1));
			        i.putExtra("p3",String.valueOf((sum)));
					startActivity(i);
				}
				if(c2.isChecked()==true)
				{
					sum2=d2*60;
					i.putExtra("b1",String.valueOf(c2.getText()));
			        i.putExtra("b2",String.valueOf(d2));
			        i.putExtra("b3",String.valueOf((sum2)));
					startActivity(i);
				}
				if(c3.isChecked()==true)
				{
					sum3=d3*60;
					i.putExtra("vs1",String.valueOf(c3.getText()));
			        i.putExtra("vs2",String.valueOf(d3));
			        i.putExtra("vs3",String.valueOf((sum3)));
					startActivity(i);
				}
				if(c4.isChecked()==true)
				{
					sum4=d4*50;
					i.putExtra("gs1",String.valueOf(c4.getText()));
			        i.putExtra("gs2",String.valueOf(d4));
			        i.putExtra("gs3",String.valueOf((sum4)));
					startActivity(i);
				}
				if(c5.isChecked()==true)
				{
					sum5=d5*40;
					i.putExtra("ch1",String.valueOf(c5.getText()));
			        i.putExtra("ch2",String.valueOf(d5));
			        i.putExtra("ch3",String.valueOf((sum5)));
					startActivity(i);
				}
				if(c6.isChecked()==true)
				{
					sum6=d6*50;
					i.putExtra("f1",String.valueOf(c6.getText()));
			        i.putExtra("f2",String.valueOf(d6));
			        i.putExtra("f3",String.valueOf((sum6)));
					startActivity(i);
				}
				if(c7.isChecked()==true)
				{
					sum7=d7*50;
					i.putExtra("m1",String.valueOf(c7.getText()));
			        i.putExtra("m2",String.valueOf(d7));
			        i.putExtra("m3",String.valueOf((sum7)));
					startActivity(i);
				}
				if(c8.isChecked()==true)
				{
					sum8=d8*50;
					i.putExtra("ff1",String.valueOf(c8.getText()));
			        i.putExtra("ff2",String.valueOf(d8));
			        i.putExtra("ff3",String.valueOf((sum8)));
					startActivity(i);
				}
			 if(c1.isChecked()==false&&c2.isChecked()==false&&c3.isChecked()==false&&c4.isChecked()==false&&c5.isChecked()==false&&c6.isChecked()==false&&c7.isChecked()==false&&c8.isChecked()==false)
				{
					Toast.makeText(FoodCornerDemo.this,"plz select some item",001).show();
				}
			}
		
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_food_corner_demo, menu);
		return true;
	}

}
