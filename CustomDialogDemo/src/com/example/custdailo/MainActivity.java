package com.example.custdailo;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.app.ActionBar.LayoutParams;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		go();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void go(){
		final Dialog dialog1=  new Dialog(MainActivity.this,android.R.style.Theme_Translucent_NoTitleBar);
	    dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
	    dialog1.setContentView(R.layout.custom_dailog);
	    Window window1 = dialog1.getWindow();
	    WindowManager.LayoutParams wlp1 = window1.getAttributes();

	    wlp1.gravity = Gravity.CENTER;
	    wlp1.flags &= WindowManager.LayoutParams.FLAG_BLUR_BEHIND;
	    window1.setAttributes(wlp1);
	    dialog1.getWindow().setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
	    
	    
	    
	    TextView textView_cancel=(TextView)dialog1.findViewById(R.id.textView_ok);
	    textView_cancel.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
						dialog1.dismiss();	
				}
			});

		
		dialog1.show();
	}

}
