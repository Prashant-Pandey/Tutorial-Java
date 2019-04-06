package com.example.intent_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Sixth extends Activity implements OnClickListener {
Button exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sixth);
		exit=(Button)findViewById(R.id.button1);
		exit.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sixth, menu);
		return true;
	}
	public void onClick(View p) {
		// TODO Auto-generated method stub
		
		if(p.getId()==R.id.button1)
		{Intent i=new Intent(Sixth.this ,exit(0));
		startActivity(i);
		Toast.makeText(Sixth.this, "Successfully",111).show();
		
	}
}

	private Class<?> exit(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}