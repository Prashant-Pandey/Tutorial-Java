package com.example.webview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;

public class MainActivity extends Activity {
	
	WebView vb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		vb=(WebView)findViewById(R.id.webView1);
		vb.loadUrl("https://www.facebook.com");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
