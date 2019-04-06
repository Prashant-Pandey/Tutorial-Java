package com.example.tictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;

public class TicTacToe extends Activity implements OnClickListener {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tic_tac_toe);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
		b7=(Button)findViewById(R.id.button7);
		b8=(Button)findViewById(R.id.button8);
		b9=(Button)findViewById(R.id.button9);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		for (int j = 1; j < 10; j++) {
		  for (int i = 0; i < 2; i++) {
		//For Changing color of single button
			
			
		}
		}
		for (int j = 1; j < 10; j++) {
		for (int i = 0; i < 2; i++) {
			//for checking color
			if (){
				
			}
			
		}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tic_tac_toe, menu);
		return true;
	}
}
