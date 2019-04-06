package com.example.intent_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Second extends Activity implements OnClickListener {
	
	Button back,Next;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		back=(Button)findViewById(R.id.button1);
		back.setOnClickListener(this);
		Next=(Button)findViewById(R.id.button2);
		Next.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

	@Override
	public void onClick(View v) {

        if(v.getId()==R.id.button1)
		{Intent i=new Intent(Second.this ,First.class);
		startActivity(i);
		Toast.makeText(Second.this,"Successfully",111).show();
		}
else
		{Intent i=new Intent(Second.this ,Third.class);
		startActivity(i);
		Toast.makeText(Second.this,"Successfully",111).show();
		
	}
	}
}
