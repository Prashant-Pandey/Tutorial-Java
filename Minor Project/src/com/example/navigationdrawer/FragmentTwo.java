package com.example.navigationdrawer;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
 
public class FragmentTwo extends Fragment 

{
    public static Fragment newInstance(Context context) {
    	FragmentTwo f = new FragmentTwo();
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_two, null);
       

    	AutoCompleteTextView t;
    	String d;
    	 final String s[]={"Andhra Pradesh",
    		"Arunachal Pradesh",
    		"Assam",
    		"Bihar",
    		"Chhattisgarh",
    		"Goa",
    		"Gujarat",
    		"Haryana",
    		"Himachal Pradesh",
    		"Jammu & Kashmir",
    		"Jharkhand",
    		"Karnataka",
    		"Kerala",
    		"Madhya Pradesh",
    		"Maharashtra",
    		"Manipur",
    		"Meghalaya",
    		"Mizoram",
    		"Nagaland",
    		"Odisha",
    		"Punjab",
    		"Rajasthan",
    		"Sikkim",
    		"Tamil Nadu",
    		"Telangana",
    		"Tripura",
    		"Uttar Pradesh",
    		"Uttarakhand",
    		"West Bengal",
    		};
    	Button b=(Button)root.findViewById(R.id.button1);
		final EditText e1=(EditText)root.findViewById(R.id.editText1);
		TextView tv1=(TextView)root.findViewById(R.id.textView1);
		t=(AutoCompleteTextView)root.findViewById(R.id.autoCompleteTextView1);
		
		t.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String d=(String)arg0.getItemAtPosition(arg2);
				//Toast.makeText(FragmentTwo.this,"Name of state:  "+d,1000).show();
			}
		});
		//ArrayAdapter<String>ar=new ArrayAdapter<String>(FragmentTwo.this, android.R.layout.select_dialog_item ,s);
		t.setThreshold(1);
		//t.setAdapter(ar);
        
    		
        return root;
    }
    
}