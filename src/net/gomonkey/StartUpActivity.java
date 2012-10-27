package net.gomonkey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartUpActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Button button_credits = (Button)findViewById(R.id.button_credits);
        button_credits.setOnClickListener(new View.OnClickListener() 
        {	
    		public void onClick(View v) {
    		Intent in = new Intent(StartUpActivity.this,CreditsActivity.class);
    		 startActivity(in);
    		}
    	});
        
        Button button_about = (Button)findViewById(R.id.button_about);
        button_about.setOnClickListener(new View.OnClickListener() 
        {	
    		public void onClick(View v) {
    		Intent in = new Intent(StartUpActivity.this,AboutActivity.class);
    		 startActivity(in);
    		}
    	});
        
    }
}