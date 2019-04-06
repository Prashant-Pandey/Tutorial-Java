package com.example.jaipurmetro;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPanel extends Activity {
	
	Button bu1,bu2;
	EditText eu1,eu2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_panel);
        
        bu1=(Button)findViewById(R.id.b1);
        bu2=(Button)findViewById(R.id.b2);
        
        eu1=(EditText)findViewById(R.id.ed1);
        eu2=(EditText)findViewById(R.id.p1);
        
        bu1.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		 if(eu1.getText().toString().equals("1302041124") && eu2.getText().toString().equals("shivam"))
            	 {
            		 Intent i=new Intent(LoginPanel.this,JaipurMetro.class);
            		 startActivity(i);
            		 finish();
            	 }
            	 else 
            	 { Toast.makeText(LoginPanel.this,"Please Enter Correct Credentials",111).show();}
            		 
            	  }});
        bu2.setOnClickListener(new OnClickListener()
        
        {
        	public void onClick(View v)
        	{
        		finish();
        		System.exit(0);
        		
        	}
        	
        }
        		
        		);
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_login_panel, menu);
        return true;
    }
    
}
