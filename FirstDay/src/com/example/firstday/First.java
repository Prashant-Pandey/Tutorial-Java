package com.example.firstday;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class First extends Activity {
	Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design);
       bt= (Button)findViewById(R.id.ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.design, menu);
        return true;
    }
    
}
