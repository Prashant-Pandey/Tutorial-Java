package com.example.intent_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Third extends Activity implements OnClickListener{

	Button back,next,other;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		back=(Button)findViewById(R.id.button1);
		back.setOnClickListener(this);
		next=(Button)findViewById(R.id.button2);
		next.setOnClickListener(this);
		other=(Button)findViewById(R.id.button3);
		other.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

	@Override
	public void onClick(View q) {
		// TODO Auto-generated method stub
		if(q.getId()==R.id.button1)
		{Intent i=new Intent(Third.this ,Second.class);
		startActivity(i);
		Toast.makeText(Third.this,"Successfully",111).show();
		}
		else if(q.getId()==R.id.button2)
		{Intent i=new Intent(Third.this ,Sixth.class);
		startActivity(i);
		Toast.makeText(Third.this,"Successfully",111).show();
	}
		else if(q.getId()==R.id.button3)
		{Intent i=new Intent(Third.this ,Fourth.class);
		startActivity(i);
		Toast.makeText(Third.this,"Successfully",111).show();
	}
}
}