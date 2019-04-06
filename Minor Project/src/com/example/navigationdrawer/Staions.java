package com.example.navigationdrawer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Staions extends Activity {
	
	ListView lv;
	static int y;
	String [] data={"Mansarover","New Atish Market","Vivek Vihar","Shayam Nagar",
			"Ram Nagar","Civil Lines","Metro Railway St.","Sindhi Camp","Chand Pole"};
	static String s;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_staions);
		
		lv=(ListView)findViewById(R.id.lv1);
		ArrayAdapter<String> ar=new ArrayAdapter<String>(Staions.this,android.R.layout.simple_list_item_1,data);
		lv.setAdapter(ar);
		lv.setOnItemClickListener(new OnItemClickListener()
		{
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
         			long arg3)
			{
				s=(String)arg0.getItemAtPosition(arg2);
				Toast.makeText(Staions.this,s,111).show();
			    Intent h=new Intent(Staions.this,FragmentOne.class);
				
				y=arg2+1;
				Bundle b = new Bundle();
				b.putString("e", s);
				FragmentOne f1 = new FragmentOne();
				
				f1.setArguments(b);
				
				startActivity(h);
				finish();
				}});
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_staions, menu);
		return true;
	}

}
