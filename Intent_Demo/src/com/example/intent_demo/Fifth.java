package com.example.intent_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Fifth extends Activity implements OnClickListener {
Button next,back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fifth);
		next=(Button)findViewById(R.id.button1);
		next.setOnClickListener(this);
		back=(Button)findViewById(R.id.button2);
		back.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fifth, menu);
		return true;
	}
	public void onClick(View p) {
		// TODO Auto-generated method stub
		
		if(p.getId()==R.id.button1)
		{Intent i=new Intent(Fifth.this ,Sixth.class);
		startActivity(i);
		Toast.makeText(Fifth.this, "Successfully",111).show();
		
	}
		else
		{Intent i=new Intent(Fifth.this ,Fourth.class);
		startActivity(i);
		Toast.makeText(Fifth.this, "Successfully",111).show();
}
}
}
