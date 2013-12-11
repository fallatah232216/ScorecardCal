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
				
				//action listners on the spinners
				round2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				    	 int points=Integer.parseInt(round2.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);       
				    }
					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub	
					}				
				});
				
				//action listners on the spinners
				
				round3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				        
				        int points=Integer.parseInt(round3.getSelectedItem().toString());
				        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
				        firstfighter.setText(""+firsttotal);
				    }
					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub	
					}			
				});
				
				//action listners on the spinners
				
				round4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				        
				        int points=Integer.parseInt(round4.getSelectedItem().toString());
				        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
				        secondfighter.setText(""+secondtotal);
				        
				    }
					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}

								
				});
				//action listners on the spinners
				round5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				        
				        int points=Integer.parseInt(round5.getSelectedItem().toString());
				        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
				        secondfighter.setText(""+secondtotal);
				        
				    }
					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}

								
				});
				//action listners on the spinners
				round6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
				        
				        int points=Integer.parseInt(round6.getSelectedItem().toString());
				        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
				        secondfighter.setText(""+secondtotal);
				        
				    }
					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}					
				});
				}
				
				//if round 4 is selected in the spinner than 
				
				
				else 
				if(roundno.equals("4"))
				{
					setContentView(R.layout.round4);
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
					final Spinner round7=(Spinner) findViewById(R.id.spinner7);
					final Spinner round8=(Spinner) findViewById(R.id.spinner8);
					Button next=(Button) findViewById(R.id.button1);
					//actionlistner on the button
					next.setOnClickListener(new View.OnClickListener() {    
						public void onClick(View arg0) {
							//check the winning team name of tie
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
					//make the lable in the center
					t1.setGravity(Gravity.CENTER);
					t1.setText(Main.fighttype);
					t2.setText(Main.level);
					if(Main.fighttype.equals("Championship Fight"))
					t3.setText("Boxing for the "+String.valueOf(Main.belts.getSelectedItem())+" belt");
					else
					t3.setText("");
					fname.setText(Main.firstname);
					sname.setText(Main.secondname);
					firstfighter.setText("0");
					secondfighter.setText("0");
					//make the scrore not editabe
					firstfighter.setEnabled(false);
					secondfighter.setEnabled(false);
					
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
					//action listners on the spinners
					round2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round2.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round3.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round4.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round5.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round6.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					round7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round7.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					round8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round8.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					
					
				}
				
				
				//If round 6 is selected in the spinner than			
				
				else 
				if(roundno.equals("6"))
				{
					setContentView(R.layout.round6);
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
					final Spinner round41=(Spinner) findViewById(R.id.spinner41);
					final Spinner round42=(Spinner) findViewById(R.id.spinner42);
					final Spinner round5=(Spinner) findViewById(R.id.spinner5);
					final Spinner round6=(Spinner) findViewById(R.id.spinner6);
					final Spinner round7=(Spinner) findViewById(R.id.spinner7);
					final Spinner round8=(Spinner) findViewById(R.id.spinner8);
					final Spinner round9=(Spinner) findViewById(R.id.spinner9);
					final Spinner round10=(Spinner) findViewById(R.id.spinner10);
					Button next=(Button) findViewById(R.id.button1);
					//action lisner on the next button
					next.setOnClickListener(new View.OnClickListener() {    
						public void onClick(View arg0) {
							//checking the winning team or either the match is tie
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
					t1.setGravity(Gravity.CENTER);
					t1.setText(Main.fighttype);
					t2.setText(Main.level);
					if(Main.fighttype.equals("Championship Fight"))
					t3.setText("Boxing for the "+String.valueOf(Main.belts.getSelectedItem())+" belt");
					else
					t3.setText("");
					fname.setText(Main.firstname);
					sname.setText(Main.secondname);
					firstfighter.setText("0");
					secondfighter.setText("0");
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
					//action listners on the spinners
					round2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round2.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					round3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round3.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round4.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round41.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round41.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					//action listners on the spinners
					round42.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round42.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					//action listners on the spinners
					round5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round5.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					round6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round6.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					round7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round7.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					round8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round8.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal); 
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub		
						}					
					});
					//action listners on the spinners
					round9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round9.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					round10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round10.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
				}
				
				
				
					//if round 8 is selected in the spinner than		
				
				else 
				if(roundno.equals("8"))
				{
					setContentView(R.layout.round8);
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
					final Spinner round41=(Spinner) findViewById(R.id.spinner41);
					final Spinner round42=(Spinner) findViewById(R.id.spinner42);
					final Spinner round43=(Spinner) findViewById(R.id.spinner43);
					final Spinner round44=(Spinner) findViewById(R.id.spinner44);
					final Spinner round5=(Spinner) findViewById(R.id.spinner5);
					final Spinner round6=(Spinner) findViewById(R.id.spinner6);
					final Spinner round7=(Spinner) findViewById(R.id.spinner7);
					final Spinner round8=(Spinner) findViewById(R.id.spinner8);
					final Spinner round9=(Spinner) findViewById(R.id.spinner9);
					final Spinner round10=(Spinner) findViewById(R.id.spinner10);
					final Spinner round11=(Spinner) findViewById(R.id.spinner11);
					final Spinner round12=(Spinner) findViewById(R.id.spinner12);
					Button next=(Button) findViewById(R.id.button1);
					
					//action lisner on the next button
					next.setOnClickListener(new View.OnClickListener() {    
						public void onClick(View arg0) {
							//checking the winnind team or either the match is tie
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
					t1.setGravity(Gravity.CENTER);
					t1.setText(Main.fighttype);
					t2.setText(Main.level);
					if(Main.fighttype.equals("Championship Fight"))
					t3.setText("Boxing for the "+String.valueOf(Main.belts.getSelectedItem())+" belt");
					else
					t3.setText("");
					fname.setText(Main.firstname);
					sname.setText(Main.secondname);
					firstfighter.setText("0");
					secondfighter.setText("0");
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
					//action listners on the spinners
					
					round2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round2.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					
					round3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round3.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round4.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					
					round41.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round41.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					//action listners on the spinners
					
					round42.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round42.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					//action listners on the spinners
					
					round43.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round43.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					//action listners on the spinners
					
					round44.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round44.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					//action listners on the spinners
					
					round5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round5.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					//action listners on the spinners
					
					round6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round6.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					
					round7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round7.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round8.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal); 
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub		
						}					
					});
					
					//action listners on the spinners
					
					round9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round9.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round10.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					//action listners on the spinners
					
					round11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round11.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});	
					//action listners on the spinners
					
					round12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round12.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
				}
				
				
				
				//if round no 10 is selected in the spinenr than	
				
				else 
				if(roundno.equals("10"))
				{
					setContentView(R.layout.round10);
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
					final Spinner round7=(Spinner) findViewById(R.id.spinner7);
					final Spinner round8=(Spinner) findViewById(R.id.spinner8);
					final Spinner round9=(Spinner) findViewById(R.id.spinner9);
					final Spinner round10=(Spinner) findViewById(R.id.spinner10);
					final Spinner round13=(Spinner) findViewById(R.id.spinner13);
					final Spinner round14=(Spinner) findViewById(R.id.spinner14);
					final Spinner round15=(Spinner) findViewById(R.id.spinner15);
					final Spinner round16=(Spinner) findViewById(R.id.spinner16);
					final Spinner round17=(Spinner) findViewById(R.id.spinner17);
					final Spinner round18=(Spinner) findViewById(R.id.spinner18);
					final Spinner round19=(Spinner) findViewById(R.id.spinner19);
					final Spinner round20=(Spinner) findViewById(R.id.spinner20);
					final Spinner round21=(Spinner) findViewById(R.id.spinner21);
					final Spinner round22=(Spinner) findViewById(R.id.spinner22);
					Button next=(Button) findViewById(R.id.button1);
					
					//action lisner on the next button
					
					next.setOnClickListener(new View.OnClickListener() {    
						public void onClick(View arg0) {
							//checking the winning team or either the match is tie
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
					t1.setGravity(Gravity.CENTER);
					t1.setText(Main.fighttype);
					t2.setText(Main.level);
					if(Main.fighttype.equals("Championship Fight"))
					t3.setText("Boxing for the "+String.valueOf(Main.belts.getSelectedItem())+" belt");
					else
					t3.setText("");
					fname.setText(Main.firstname);
					sname.setText(Main.secondname);
					firstfighter.setText("0");
					secondfighter.setText("0");
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
					//action listners on the spinners
					
					round2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round2.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round3.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round4.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round5.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					
					//action listners on the spinners
					
					round6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round6.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round7.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round8.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					
					//action listners on the spinners
					
					round9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round9.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round10.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round13.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round14.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					//action listners on the spinners
					
					round15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round15.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round16.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal); 
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub		
						}					
					});
					
					//action listners on the spinners
					
					round17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round17.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round18.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					//action listners on the spinners
					
					round19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round19.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});	
					//action listners on the spinners
					
					round20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round20.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					//action listners on the spinners
					
					round21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round21.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					//action listners on the spinners
					
					round22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round22.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
				}
				
				
				
				
				
				//if round 12 is selected in the spinner than
				
				else 
				if(roundno.equals("12"))
				{
					setContentView(R.layout.activity2);
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
					final Spinner round7=(Spinner) findViewById(R.id.spinner7);
					final Spinner round8=(Spinner) findViewById(R.id.spinner8);
					final Spinner round9=(Spinner) findViewById(R.id.spinner9);
					final Spinner round10=(Spinner) findViewById(R.id.spinner10);
					final Spinner round11=(Spinner) findViewById(R.id.spinner11);
					final Spinner round12=(Spinner) findViewById(R.id.spinner12);
					final Spinner round13=(Spinner) findViewById(R.id.spinner13);
					final Spinner round14=(Spinner) findViewById(R.id.spinner14);
					final Spinner round15=(Spinner) findViewById(R.id.spinner15);
					final Spinner round16=(Spinner) findViewById(R.id.spinner16);
					final Spinner round17=(Spinner) findViewById(R.id.spinner17);
					final Spinner round18=(Spinner) findViewById(R.id.spinner18);
					final Spinner round19=(Spinner) findViewById(R.id.spinner19);
					final Spinner round20=(Spinner) findViewById(R.id.spinner20);
					final Spinner round21=(Spinner) findViewById(R.id.spinner21);
					final Spinner round22=(Spinner) findViewById(R.id.spinner22);
					final Spinner round23=(Spinner) findViewById(R.id.spinner23);
					final Spinner round24=(Spinner) findViewById(R.id.spinner24);
					Button next=(Button) findViewById(R.id.button1);
					//action listner on the next button 
					next.setOnClickListener(new View.OnClickListener() {    
						public void onClick(View arg0) {
							//checking the winning team or either the match is tie
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
					t1.setGravity(Gravity.CENTER);
					t1.setText(Main.fighttype);
					t2.setText(Main.level);
					if(Main.fighttype.equals("Championship Fight"))
					t3.setText("Boxing for the "+String.valueOf(Main.belts.getSelectedItem())+" belt");
					else
					t3.setText("");
					fname.setText(Main.firstname);
					sname.setText(Main.secondname);
					firstfighter.setText("0");
					secondfighter.setText("0");
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
					
					//action listners on the spinners
					
					round2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round2.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round3.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round4.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round5.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round6.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round7.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round8.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round9.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round10.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					
					//action listners on the spinners
					
					round11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round11.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round12.getSelectedItem().toString());
					        firsttotal=Integer.parseInt(firstfighter.getText().toString()) + points;
					        firstfighter.setText(""+firsttotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}			
					});
					
					//action listners on the spinners
					
					round13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round13.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

									
					});
					
					//action listners on the spinners
					
					round14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round14.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round15.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round16.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal); 
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub		
						}					
					});
					
					//action listners on the spinners
					
					round17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
					        
					        int points=Integer.parseInt(round17.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					        
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}					
					});
					
					//action listners on the spinners
					
					round18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round18.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					//action listners on the spinners
					
					round19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round19.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});	
					
					//action listners on the spinners
					
					round20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round20.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});	
					
					//action listners on the spinners
					
					round21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round21.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					
					//action listners on the spinners
					
					round22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round22.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					
					//action listners on the spinners
					
					round23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round23.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});		
					
					//action listners on the spinners
					
					round24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {  
					        int points=Integer.parseInt(round24.getSelectedItem().toString());
					        secondtotal=Integer.parseInt(secondfighter.getText().toString()) + points;
					        secondfighter.setText(""+secondtotal);
					    }
						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub	
						}					
					});			
				}
			}		
	}


	