package com.example.checkdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	Button bt;
	CheckBox c1,c2,c3;
	EditText t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt=(Button)findViewById(R.id.button1);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);
		t=(EditText)findViewById(R.id.editText1);
		bt.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(c1.isChecked()==true)
		{
			Toast.makeText(MainActivity.this, "C1 is Checked", 001).show();
		}
		if(c2.isChecked()==true)
		{
			Toast.makeText(MainActivity.this, "C2 is Checked", 001).show();
		}
		if(c3.isChecked()==true)
		{
			Toast.makeText(MainActivity.this, "C3 is Checked", 001).show();
		}		
	}

}
