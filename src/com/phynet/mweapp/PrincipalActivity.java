package com.phynet.mweapp;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;



@SuppressLint("SetJavaScriptEnabled")

public class PrincipalActivity extends SherlockActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		Button buttonStarted = (Button) findViewById(R.id.buttonStart);
		buttonStarted.setOnClickListener(this);
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.configuracion) {
            startActivity(new Intent(this, MainActivity.class));
        } 
        return true;
    }

	@Override
	public void onClick(View v) {
		startActivity(new Intent(this, MainActivity.class));
		
	}
}

