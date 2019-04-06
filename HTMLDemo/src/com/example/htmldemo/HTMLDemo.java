package com.example.htmldemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.view.Menu;
import android.webkit.WebView;

public class HTMLDemo extends Activity {

	WebView w;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_htmldemo);
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/Welcome.html");
		Alert();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_htmldemo, menu);
		return true;
	}

	public void Alert() {
		Builder b=new Builder(HTMLDemo.this);
		b.setTitle("Login");
		b.setMessage("Enter User Name");
		b.setCancelable(false);
		b.show();
		
	}
}
