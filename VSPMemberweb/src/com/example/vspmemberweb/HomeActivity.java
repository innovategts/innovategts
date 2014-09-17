package com.example.vspmemberweb;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homelayout);
		
		//My Benefits Button
				Button myBenefitsButton = (Button) findViewById(R.id.my_benefits);
				myBenefitsButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent page = new Intent(HomeActivity.this , MyBenefitsActivity.class );
						startActivity(page);
					}
				});
		//Make A Claim Button--NOT DONE
				Button makeAClaimButton = (Button) findViewById(R.id.make_a_claim);
				makeAClaimButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent page = new Intent(HomeActivity.this , MyBenefitsActivity.class );
						startActivity(page);
					}
				});
		//Find A Doctor Button
				Button findADoctorButton = (Button) findViewById(R.id.find_a_doctor);
				findADoctorButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent page = new Intent(HomeActivity.this , FindADoctorActivity.class );
						startActivity(page);
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
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
