package com.example.intent_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class First extends Activity implements OnClickListener {
	
	Button sent,next;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		sent=(Button)findViewById(R.id.button1);
		sent.setOnClickListener(this);
		next=(Button)findViewById(R.id.button2);
		next.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first, menu);
		return true;
	}

	@Override
	public void onClick(View p) {
		// TODO Auto-generated method stub
		
		if(p.getId()==R.id.button2)
		{Intent i=new Intent(First.this ,Second.class);
		startActivity(i);
		Toast.makeText(First.this, "Successfully",111).show();
		
	}
		else
		{Intent i=new Intent(First.this ,Fourth.class);
		startActivity(i);
		Toast.makeText(First.this, "Successfully",111).show();
}
}}