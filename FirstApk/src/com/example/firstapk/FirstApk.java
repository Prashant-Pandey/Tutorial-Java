package com.example.firstapk;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstApk extends Activity implements OnClickListener{
	
	Button b1,b2;
	EditText ed;
	TextView tv;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design);
	 
		b1= (Button)findViewById(R.id.button1);
		b2= (Button)findViewById(R.id.button2);
		ed=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView2);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
	/* b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String s= ed.getText().toString();
			tv.setText(s);
			ed.setText(null);
			}
	});.
	*/
	}
//	public void check(View v){
//		String s= ed.getText().toString();
//			tv.setText(s);
//			ed.setText(null);
//		 
//		}	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design, menu);
		return true;
	}
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	if(v.getId()==R.id.button1){
		String s= ed.getText().toString();
	tv.setText(s);
	}
	if(v.getId()==R.id.button2){
		ed.setText(null);
	}
	
}

}
