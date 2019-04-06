package com.example.foodcorner;

import com.example.foodcorner.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SelectedMenu extends Activity implements OnClickListener {
     TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,
     tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv21,tv22;
     Button b1,b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selected_menu);
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
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		b2=(Button)findViewById(R.id.button2);
		b2.setOnClickListener(this);
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("k");
		tv5.setText(s);
		}
		{
		Intent i=getIntent();
		String s=i.getStringExtra("l");
		tv11.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("m");
		tv17.setText(s);
		}
		
		{
			Intent i1=getIntent();
		
		String s1=i1.getStringExtra("ka");
		tv6.setText(s1);
		}
		
		{
			Intent i1=getIntent();
		
		String s1=i1.getStringExtra("la");
		tv12.setText(s1);
		}
		
		{
			Intent i1=getIntent();
		
		String s1=i1.getStringExtra("ma");
		tv18.setText(s1);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("kaa");
		tv7.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("laa");
		tv13.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("maa");
		tv19.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("kas");
		tv8.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("las");
		tv14.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("mas");
		tv20.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("kal");
		tv9.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("lal");
		tv15.setText(s);
		}
		
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("mal");
		tv21.setText(s);
		}
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("kak");
		tv10.setText(s);
		}
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("lak");
		tv16.setText(s);
		}
		{
			Intent i=getIntent();
		
		String s=i.getStringExtra("mak");
		tv22.setText(s);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_selected_menu, menu);
		return true;
	}
	public void onClick(View v){
		if(v.getId()==R.id.button2){
			Intent i=new Intent(SelectedMenu.this,FoodMenu.class);
			startActivity(i);
			Toast.makeText(SelectedMenu.this, "Select again",111).show();
		}
		else
		{
			Intent i=new Intent(SelectedMenu.this,FoodMenu.class);
			startActivity(i);
			Toast.makeText(SelectedMenu.this,""+String.valueOf(tv17),Toast.LENGTH_LONG).show();
		}
	}
}
