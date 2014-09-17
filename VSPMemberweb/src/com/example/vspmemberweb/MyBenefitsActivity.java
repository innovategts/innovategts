package com.example.vspmemberweb;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MyBenefitsActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mybenefitsmenulayout);
		
		//VSP WellVision Button--NOT DONE
		Button vspWellVisionButton = (Button) findViewById(R.id.vsp_wellvision);
		vspWellVisionButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(MyBenefitsActivity.this , MyBenefitsActivity.class );
				startActivity(page);
			}
		});
		//Additional Eyecare Button--NOT DONE
		Button additionalEyecareButton = (Button) findViewById(R.id.additional_eyecare);
		additionalEyecareButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(MyBenefitsActivity.this , MyBenefitsActivity.class );
				startActivity(page);
			}
		});
		//Contacts Button--NOT DONE
		Button contactsButton = (Button) findViewById(R.id.contacts);
		contactsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(MyBenefitsActivity.this , FindADoctorActivity.class );
				startActivity(page);
			}
		});
		//Computer Vision Button--NOT DONE
		Button computerVisionButton = (Button) findViewById(R.id.computer_vision);
		computerVisionButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(MyBenefitsActivity.this , MyBenefitsActivity.class );
				startActivity(page);
			}
		});
		//Specialty Eyecare Button--NOT DONE
		Button eyecareButton = (Button) findViewById(R.id.specialty_eyecare);
		eyecareButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(MyBenefitsActivity.this , MyBenefitsActivity.class );
				startActivity(page);
			}
		});
		//Eyeconic Button--NOT DONE
		Button eyeconicButton = (Button) findViewById(R.id.eyeconic);
		eyeconicButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent page = new Intent(MyBenefitsActivity.this , FindADoctorActivity.class );
				startActivity(page);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mybenefitsmenu, menu);
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
