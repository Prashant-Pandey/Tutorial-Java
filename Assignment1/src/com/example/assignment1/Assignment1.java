package com.example.assignment1;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Assignment1 extends Activity {

	Button b;
	EditText ed;
	EditText ed2;
	TextView tv;
	TextView tv2;
	TextView tv3;
	TextView tv4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.design);
		b= (Button)findViewById(R.id.button1);
		ed=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView1);
		ed2=(EditText)findViewById(R.id.editText2);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		tv4=(TextView)findViewById(R.id.textView4);
		
	b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String s= ed.getText().toString();
			tv3.setText(s);
			ed.setText(null);
			
			String s1= ed2.getText().toString();
			tv4.setText(s1);
			ed2.setText(null);
			
		}
	});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.design, menu);
		return true;
	}

}
