package com.example.jaipurmetro;

import android.os.Bundle;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JaipurMetro extends Activity {
	
	Button bu1,bu2,bu3,bu4,bu5;
	EditText eu1,eu2,eu3;
	static String e,q;
	int z;
	static int p,fare;static int h,g;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jaipur_metro);
		
		bu1=(Button)findViewById(R.id.b1);
		bu2=(Button)findViewById(R.id.b2);
		bu3=(Button)findViewById(R.id.b3);
		bu4=(Button)findViewById(R.id.b4);
		bu5=(Button)findViewById(R.id.b5);
		
		eu1=(EditText)findViewById(R.id.ed1);
		eu2=(EditText)findViewById(R.id.ed2);
		eu3=(EditText)findViewById(R.id.ed3);
		

		Stations w=new Stations();
		Stations1 r=new Stations1();
		e=w.s; 
		q=r.b; 
		h=w.y;
		g=r.z;
		
		//for calculating ticket fare
		
		eu1.setText(e);
		eu2.setText(q);
		
		bu5.setOnClickListener(new OnClickListener()
		
		{
			public void onClick(View v)
			{
				try {
	           		 Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
	                    String url = "jaipur metro route map";
	                    intent.putExtra(SearchManager.QUERY, url);
	                    startActivity(intent);
	                    finish();
	       		} catch (Exception e) {
	       			Toast.makeText(JaipurMetro.this,"Technical Error!",Toast.LENGTH_LONG).show();
	       		}
				
			}});
		
		
		bu1.setOnClickListener(new OnClickListener()
		
		{
			public void onClick(View v)
			{
				Intent s=new Intent(JaipurMetro.this,Stations.class);
				startActivity(s);
				finish();
				
			}});
		
	
	bu2.setOnClickListener(new OnClickListener()
	
	{
		public void onClick(View v)
		{
			Intent s=new Intent (JaipurMetro.this,Stations1.class);
			startActivity(s);
			finish();
			
		}});
	
	bu3.setOnClickListener(new OnClickListener()
	
	{
		public void onClick(View v)
		{
			try{z=Integer.parseInt(eu3.getText().toString());
			p=Math.abs(g-h);
			
			if(p==1){
			fare=(z*5);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			else if(p==2)
			{fare=(z*10);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			else if(p==3)
			{fare=(z*15);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			else if(p==4)
			{fare=(z*20);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			else if(p==5)
			{fare=(z*25);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			else if(p==6)
			{fare=(z*30);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();}
			else if(p==7)
			{fare=(z*35);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			else if(p==8)
			{fare=(z*40);
			Toast.makeText(JaipurMetro.this,"Your Ticket Fare for "+z+" people is : "+fare,Toast.LENGTH_LONG).show();
			}
			Intent p=new Intent(JaipurMetro.this,Send_Ticket.class);
			startActivity(p);
			finish();
			}
			catch(Exception e)
			{
				Toast.makeText(JaipurMetro.this,"Please Enter the Details Properly!",Toast.LENGTH_LONG).show();
				
			}
			}});
	
	
	bu4.setOnClickListener(new OnClickListener()
	
	{
		public void onClick(View v)
		{
			Intent o=new Intent(JaipurMetro.this,LoginPanel.class);
			startActivity(o);
			finish();
		}});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_jaipur_metro, menu);
		return true;
	}

}
