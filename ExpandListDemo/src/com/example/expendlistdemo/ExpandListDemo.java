package com.example.expendlistdemo;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class ExpandListDemo extends Activity {

	ArrayList<String>name,mob;
	ListView lt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expand_list_demo);
		lt=(ListView)findViewById(R.id.listView1);
	    name=new ArrayList<String>();
	    mob=new ArrayList<String>();
	    name.add("JU");
	   name.add("UDMl");
	   name.add("JECRC");
	   name.add("App");
	   name.add("Android");
	   mob.add("982436158");
	   mob.add("982432656");
	   mob.add("98242626595");
	   mob.add("9824526562");
	   mob.add("98243615548");
	   
	   name.add("JU");
	   name.add("UDMl");
	   name.add("JECRC");
	   name.add("App");
	   name.add("Android");
	   mob.add("982436158");
	   mob.add("982432656");
	   mob.add("98242626595");
	   mob.add("9824526562");
	   mob.add("98243615548");
	   
	   name.add("JU");
	   name.add("UDMl");
	   name.add("JECRC");
	   name.add("App");
	   name.add("Android");
	   mob.add("982436158");
	   mob.add("982432656");
	   mob.add("98242626595");
	   mob.add("9824526562");
	   mob.add("98243615548");
	  
	   Info i=new Info(getApplicationContext(),name,mob);
	   lt.setAdapter(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_expand_list_demo, menu);
		return true;
	}

}
