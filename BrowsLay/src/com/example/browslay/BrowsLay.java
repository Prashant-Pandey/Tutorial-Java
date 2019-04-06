package com.example.browslay;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class BrowsLay extends Activity{
	WebView vb;
	Button s,b,n; 
	EditText u;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_brows_lay);
		s=(Button)findViewById(R.id.button1);
	    b=(Button)findViewById(R.id.button2);
	    n=(Button)findViewById(R.id.button3);
	    u=(EditText)findViewById(R.id.editText1);
	    vb=(WebView)findViewById(R.id.webView1);
	    s.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s=u.getText().toString();
				vb.loadUrl("s");
				Intent i= new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("s"));
				startActivity(i);
			}
		});
	    b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				u.setText(null);
			}
		});
	    n.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_brows_lay, menu);
		return true;
	}
}