package com.example.vspmemberweb;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FindADoctorActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.findadoctormenulayout);
		
		//Find A Doctor Button
		Button previousDoctorButton = (Button) findViewById(R.id.search_by_name);
		previousDoctorButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(FindADoctorActivity.this , FindDoctorActivity.class );
				startActivity(page);
			}
		});
		//Previous Doctor Appointment Information Button--NOT DONE
		Button searchForDoctorButton = (Button) findViewById(R.id.previous_doctor);
		searchForDoctorButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(FindADoctorActivity.this , MyBenefitsActivity.class );
				startActivity(page);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.findadoctormenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
