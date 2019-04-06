package com.example.navigationdrawer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class FragmentFive extends Fragment {
	 WebView wv;
    public static Fragment newInstance(Context context) {
    	FragmentThree f = new FragmentThree();
 return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_fragment_five, null);
         wv=(WebView)root.findViewById(R.id.webView1);
        wv.loadUrl("file:///android_asset/metro.html");
        return root;
    }
 
}