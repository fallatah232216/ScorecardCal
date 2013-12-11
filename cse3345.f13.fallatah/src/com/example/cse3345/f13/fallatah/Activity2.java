package com.example.cse3345.f13.fallatah;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Activity2 extends Activity {
	//declaring the variable static variable
			public static String winner;
			String roundno=String.valueOf(Main.rounds.getSelectedItem());
			int firsttotal,secondtotal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

}
