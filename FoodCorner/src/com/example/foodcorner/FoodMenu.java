package com.example.foodcorner;

import com.example.foodcorner.R;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.StaticLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FoodMenu extends Activity{
	Button bt;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    TextView tv1,tv2,tv3;
    int num1,num2,num3,num4,num5,num6;
	int sum,sum2,sum3,sum4,sum5,sum6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food_menu);
		bt=(Button)findViewById(R.id.button1);
		cb1=(CheckBox)findViewById(R.id.checkBox1);
		cb2=(CheckBox)findViewById(R.id.checkBox2);
		cb3=(CheckBox)findViewById(R.id.checkBox3);
		cb4=(CheckBox)findViewById(R.id.checkBox4);
		cb5=(CheckBox)findViewById(R.id.checkBox5);
		cb6=(CheckBox)findViewById(R.id.checkBox6);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		ed3=(EditText)findViewById(R.id.editText3);
		ed4=(EditText)findViewById(R.id.editText4);
		ed5=(EditText)findViewById(R.id.editText5);
		ed6=(EditText)findViewById(R.id.editText6);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
					if(cb1.isChecked()==true)
				{
					num1=Integer.parseInt(ed1.getText().toString());
					sum=num1*100;
				//	Toast.makeText(FoodMenu.this,"cb1 is selected",001).show();
					//Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
			        i.putExtra("k",String.valueOf(cb1.getText()));
			        i.putExtra("l",String.valueOf(ed1.getText()));
			        i.putExtra("m",String.valueOf((sum)));
					startActivity(i);
				}
				if(cb2.isChecked()==true)
				{
					num2=Integer.parseInt(ed2.getText().toString());
					sum2=num2*120;
				//	Toast.makeText(FoodMenu.this,"cb2 is selected",111).show();
					//Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
					i.putExtra("ka",String.valueOf(cb2.getText()));
			        i.putExtra("la",String.valueOf(ed2.getText()));
			        i.putExtra("ma",String.valueOf((sum2)));
					startActivity(i);
				}
				if(cb3.isChecked()==true)
				{
					num3=Integer.parseInt(ed3.getText().toString());
					sum3=num1*30;
					Toast.makeText(FoodMenu.this,"cb3 is selected",001).show();
					//Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
					i.putExtra("kaa",String.valueOf(cb3.getText()));
			        i.putExtra("laa",String.valueOf(ed3.getText()));
			        i.putExtra("maa",String.valueOf((sum3)));
					startActivity(i);
				}
				if(cb4.isChecked()==true)
				{
					num4=Integer.parseInt(ed4.getText().toString());
					sum4=num1*25;
					Toast.makeText(FoodMenu.this,"cb4 is selected",001).show();
					//Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
					i.putExtra("kas",String.valueOf(cb4.getText()));
			        i.putExtra("las",String.valueOf(ed4.getText()));
			        i.putExtra("mas",String.valueOf((sum4)));
					startActivity(i);
				}
				if(cb5.isChecked()==true)
				{
					num5=Integer.parseInt(ed5.getText().toString());
					sum5=num1*60;
					Toast.makeText(FoodMenu.this,"cb5 is selected",001).show();
					//Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
					i.putExtra("kal",String.valueOf(cb5.getText()));
			        i.putExtra("lal",String.valueOf(ed5.getText()));
			        i.putExtra("mal",String.valueOf((sum5)));
					startActivity(i);
				}
				if(cb6.isChecked()==true)
				{
					num6=Integer.parseInt(ed6.getText().toString());
					sum6=num1*80;
					Toast.makeText(FoodMenu.this,"cb6 is selected",001).show();
					//Intent i=new Intent(FoodMenu.this,SelectedMenu.class);
					i.putExtra("kak",String.valueOf(cb6.getText()));
			        i.putExtra("lak",String.valueOf(ed6.getText()));
			        i.putExtra("mak",String.valueOf((sum6)));
					startActivity(i);
				}
			 if(cb1.isChecked()==false&&cb2.isChecked()==false&&cb3.isChecked()==false&&cb4.isChecked()==false&&cb5.isChecked()==false&&cb6.isChecked()==false)
				{
					Toast.makeText(FoodMenu.this,"plz select some item",001).show();
				}
			}
		
		});
	}
}

