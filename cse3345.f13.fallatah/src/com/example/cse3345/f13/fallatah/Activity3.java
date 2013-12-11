package com.example.cse3345.f13.fallatah;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//showing the layout
		setContentView(R.layout.activity3);
		Button home=(Button) findViewById(R.id.button1);
		TextView winner=(TextView) findViewById(R.id.textView1);
		//show the winner name in the textview
		winner.setText(Activity2.winner);
		//action listner on the home button
		home.setOnClickListener(new View.OnClickListener() {    
			public void onClick(View arg0) {
				//use intent to move the Main Activity
				 Intent intent = new Intent (Activity3.this, Main.class);
		         startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.menu, menu);
        return true;
	}

}
