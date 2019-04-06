package com.example.caller;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListofNum extends Activity {
	ListView lt;
	String s[]={"9828134900","8829079040","9828069901","9414015547","7877940589","01482224906"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listof_num);
		lt=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String>ar=new ArrayAdapter<String>(ListofNum.this, android.R.layout.select_dialog_item ,s);
		lt.setAdapter(ar);
		lt.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
				// TODO Auto-generated method stub
				Intent i=new Intent(ListofNum.this,Caller.class);
				String s=(String)arg0.getItemAtPosition(arg2);
				Toast.makeText(ListofNum.this, ""+s, 111).show();				
				i.putExtra("p1",s);
				startActivity(i);
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_listof_num, menu);
		return true;
	}

}
