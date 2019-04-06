package com.example.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
 
public class FragmentOne extends Fragment {
 
    public static Fragment newInstance(Context context) {
    	FragmentOne f = new FragmentOne();
 
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_one, null);
           Button ok=(Button)root.findViewById(R.id.button1);
        
        ok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getActivity(),Eventt.class));
				
			}
		});
//        
        return root;
        
    }
 
}