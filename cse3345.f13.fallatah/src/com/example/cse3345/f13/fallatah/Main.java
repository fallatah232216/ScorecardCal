package com.example.cse3345.f13.fallatah;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

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
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
