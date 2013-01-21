package com.example.bzpoolog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	public static int NumberOfPoos = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user wants to view the log*/
    public void viewLog(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this,DisplayPooLog.class);
    	startActivity(intent);
    }
    
    /** Called when the user wants to make a new entry */
    public void newEntry(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this,AddNewEntry.class);
    	startActivity(intent);
    }
}
