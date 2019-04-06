package com.example.autocomplete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	AutoCompleteTextView t;
	String s[]={"alwar","ajmer","Chhitorgarh","Jaipur"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String>ar=new ArrayAdapter<String>(MainActivity.this, android.R.layout.select_dialog_item ,s);
		t.setThreshold(1);
		t.setAdapter(ar);
		t.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String s=(String)arg0.getItemAtPosition(arg2);
				Toast.makeText(MainActivity.this, ""+s, 111).show();
				
			}
		
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
