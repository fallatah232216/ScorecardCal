package com.example.cse3345.f13.fallatah;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity2 extends Activity {
	//declaring the variable static variable
			public static String winner;
			String roundno=String.valueOf(Main.rounds.getSelectedItem());
			int firsttotal,secondtotal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//if round 3 is selected than 
		if(roundno.equals("3"))
		{
		//show the layout and then get all the view in the variables
		setContentView(R.layout.round3);
		TextView t1=(TextView) findViewById(R.id.textView1);
		TextView t2=(TextView) findViewById(R.id.textView2);
		TextView t3=(TextView) findViewById(R.id.textView3);
		TextView fname=(TextView) findViewById(R.id.textView4);
		TextView sname=(TextView) findViewById(R.id.textView5);
		final EditText firstfighter=(EditText) findViewById(R.id.editText1);
		final EditText secondfighter=(EditText) findViewById(R.id.editText2);
		final Spinner round1=(Spinner) findViewById(R.id.spinner1);
		final Spinner round2=(Spinner) findViewById(R.id.spinner2);
		final Spinner round3=(Spinner) findViewById(R.id.spinner3);
		final Spinner round4=(Spinner) findViewById(R.id.spinner4);
		final Spinner round5=(Spinner) findViewById(R.id.spinner5);
		final Spinner round6=(Spinner) findViewById(R.id.spinner6);
		//actionlistner on the button
		Button next=(Button) findViewById(R.id.button1);
		next.setOnClickListener(new View.OnClickListener() {    
			public void onClick(View arg0) {
				// check the winning player name or march tie
				 int first=Integer.parseInt(firstfighter.getText().toString());
				 int second=Integer.parseInt(secondfighter.getText().toString());
				 if(first>second)
					 winner="The Winner Is "+Main.firstname;
				 else
				if(second>first)
					winner="The Winner Is "+Main.secondname;
				 if(first==second)
					 winner="TIE";
				 Intent intent = new Intent (Activity2.this, Activity3.class);
		         startActivity(intent);
			}
		});
		//make the textview in the center
		t1.setGravity(Gravity.CENTER);
		t1.setText(Main.fighttype);
		t2.setText(Main.level);
		//check the fighttype 
		if(Main.fighttype.equals("Championship Fight"))
		t3.setText("Boxing for the "+String.valueOf(Main.belts.getSelectedItem())+" belt");
		else
		t3.setText("");
		fname.setText(Main.firstname);
		sname.setText(Main.secondname);
		firstfighter.setText("0");
		secondfighter.setText("0");
		//make the scrore not editable
		firstfighter.setEnabled(false);
		secondfighter.setEnabled(false);
		
		//action listners on the spinners
		
		round1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
		    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		        
		        int points=Integer.parseInt(round1.getSelectedItem().toString());
		        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
		        firstfighter.setText(""+firsttotal);
		        
	}
		   


	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

});
