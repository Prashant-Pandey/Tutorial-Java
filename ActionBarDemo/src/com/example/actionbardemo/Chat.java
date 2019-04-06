package com.example.actionbardemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Chat extends Fragment{
	
    Button Ok;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		container=(ViewGroup)inflater.inflate(R.layout.activity_chat, null);
		Ok=(Button)container.findViewById(R.id.button1);
		Ok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i= new Intent(getActivity(),EventDemo.class);
				Toast.makeText(getActivity(), "Successfully", 111).show();
				startActivity(i);
			}
		});
		return container;
	}
	
	
}