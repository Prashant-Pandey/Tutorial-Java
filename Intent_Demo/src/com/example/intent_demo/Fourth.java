package com.example.intent_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Fourth extends Activity implements OnClickListener {
	Button back,next;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		
		back=(Button)findViewById(R.id.button1);
		back.setOnClickListener(this);
		next=(Button)findViewById(R.id.button2);
		next.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fourth, menu);
		return true;
	}
		public void onClick(View p) {
			// TODO Auto-generated method stub
			
			if(p.getId()==R.id.button1)
			{Intent i=new Intent(Fourth.this ,Third.class);
			startActivity(i);
			Toast.makeText(Fourth.this, "Successfully",111).show();
			
		}
			else
			{Intent i=new Intent(Fourth.this ,Fifth.class);
			startActivity(i);
			Toast.makeText(Fourth.this, "Successfully",111).show();
	}
	}

}
