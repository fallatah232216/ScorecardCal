package com.example.cse3345.f13.fallatah;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Main extends Activity {
//declare the variables
	EditText fighter1,fighter2;
	RadioButton amature,professional;
	ToggleButton fight;
	
	public static Spinner rounds,belts;
	Button next;
	public static String level,fighttype,firstname,secondname;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        //get all the layout in the variable
        final TextView t3=(TextView) findViewById(R.id.textView3);
        t3.setText("Ranked Fight");
        fighter1=(EditText) findViewById(R.id.editText1);
        fighter2=(EditText) findViewById(R.id.editText2);
        amature=(RadioButton) findViewById(R.id.radioButton1);
        fight=(ToggleButton) findViewById(R.id.toggleButton1);
        rounds=(Spinner) findViewById(R.id.spinner1);
        log.v("hi", "hi");
        //for round spinner
        ArrayList<String> roundlist = new ArrayList<String>();
        roundlist.add("NO OF Rounds");
        roundlist.add("3");
        roundlist.add("4");
        roundlist.add("6");
        roundlist.add("8");
        roundlist.add("10");
        roundlist.add("12");
        ArrayAdapter<String> roundAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, roundlist);
        roundAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        rounds.setAdapter(roundAdapter);
        
        belts=(Spinner) findViewById(R.id.spinner3);
        belts.setVisibility(View.INVISIBLE);
        //for spinner belts
        
        next=(Button) findViewById(R.id.button1);
        
        //the listeners for the radio boxes
        amature.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
					level="Amature";
					amature.isChecked();
					professional.setChecked(false);	
			}
        	});
        professional.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
						level="professional";
						professional.isChecked();
					amature.setChecked(false);
					
			}
        	});
        
        //action listener on toggle button
        fight.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
             // TODO Auto-generated method stub
            if(fight.isChecked())
            {
            	 t3.setText("Championship Fight");
				 fighttype="Championship Fight";
				 belts.setVisibility(View.VISIBLE);
            	
             }
              else
              {
            	  t3.setText("Ranked Fight");
            	  fighttype="Ranked Fight";
				  belts.setVisibility(View.INVISIBLE);  
               }
               }
               });
        //listener on next button
        next.setOnClickListener(new View.OnClickListener() {    
			public void onClick(View arg0) {		 
				 // get selected radio button from radioGroup
				if(amature.isChecked()) 
				{
					level="Amature";
					professional.setChecked(false);
				} 
				else 
				if(professional.isChecked()) 
				{
					level="professional";
					amature.setChecked(false);
				}
				
				
				
				
				
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
