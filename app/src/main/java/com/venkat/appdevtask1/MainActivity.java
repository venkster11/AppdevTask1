package com.venkat.appdevtask1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String finalstring="";
    int i=0,j=0;
    int j1=0,j2=0,j3=0,j4=0,j5=0,j6=0,j7=0,j8=0,j9=0,j10=0,j11=0,j12=0,j13=0,j14=0,j15=0,j16=0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btnnxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.bt1);
        btn2=(Button)findViewById(R.id.bt2);
        btn3=(Button)findViewById(R.id.bt3);
        btn4=(Button)findViewById(R.id.bt4);
        btn5=(Button)findViewById(R.id.bt5);
        btn6=(Button)findViewById(R.id.bt6);
        btn7=(Button)findViewById(R.id.bt7);
        btn8=(Button)findViewById(R.id.bt8);
        btn9=(Button)findViewById(R.id.bt9);
        btn10=(Button)findViewById(R.id.bt10);
        btn11=(Button)findViewById(R.id.bt11);
        btn12=(Button)findViewById(R.id.bt12);
        btn13=(Button)findViewById(R.id.bt13);
        btn14=(Button)findViewById(R.id.bt14);
        btn15=(Button)findViewById(R.id.bt15);
        btn16=(Button)findViewById(R.id.bt16);
        btnnxt=(Button)findViewById(R.id.btnxt);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //v.setBackgroundColor(Color.GREEN);
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j1=j1+1;
                if(j1%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j2=j2+1;
                if(j2%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j3=j3+1;
                if(j3%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j4=j4+1;
                if(j4%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j5=j5+1;
                if(j5%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j6=j6+1;
                if(j6%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j7=j7+1;
                if(j7%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j8=j8+1;
                if(j8%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j9=j9+1;
                if(j9%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j10=j10+1;
                if(j10%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j11=j11+1;
                if(j11%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));

                }
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j12=j12+1;
                if(j12%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));
                }
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j13=j13+1;
                if(j13%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));
                }
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j14=j14+1;
                if(j14%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));
                }
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j15=j15+1;
                if(j15%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));
                }
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                j16=j16+1;
                if(j16%2==0)
                {
                    v.setBackgroundDrawable(getResources().getDrawable(R.drawable.roundcornerbtn));
                }
            }
        });

        i=0;
        btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(j1%2!=0)
                {
                    finalstring=finalstring+" Life ";i++;
                }
                if(j2%2!=0)
                {
                    finalstring=finalstring+" Politics ";i++;
                }
                if(j3%2!=0)
                {
                    finalstring=finalstring+" Love ";i++;
                }
                if(j4%2!=0)
                {
                    finalstring=finalstring+" Technology ";i++;
                }
                if(j5%2!=0)
                {
                    finalstring=finalstring+" Money ";i++;
                }
                if(j6%2!=0)
                {
                    finalstring=finalstring+" Career ";i++;
                }
                if(j7%2!=0)
                {
                    finalstring=finalstring+" Sports ";i++;
                }
                if(j8%2!=0)
                {
                    finalstring=finalstring+" Travel ";i++;
                }
                if(j9%2!=0)
                {
                    finalstring=finalstring+" Health ";i++;
                }
                if(j10%2!=0)
                {
                    finalstring=finalstring+" Adult ";i++;
                }
                if(j11%2!=0)
                {
                    finalstring=finalstring+" Sports1 ";i++;
                }
                if(j12%2!=0)
                {
                    finalstring=finalstring+" Movies/TV ";i++;
                }
                if(j13%2!=0)
                {
                    finalstring=finalstring+" Books ";i++;
                }
                if(j14%2!=0)
                {
                    finalstring=finalstring+" Shopping ";i++;
                }
                if(j15%2!=0)
                {
                    finalstring=finalstring+" Gadgets ";i++;
                }
                if(j16%2!=0)
                {
                    finalstring=finalstring+" Web Series ";i++;
                }

                int j1=0,j2=0,j3=0,j4=0,j5=0,j6=0,j7=0,j8=0,j9=0,j10=0,j11=0,j12=0,j13=0,j14=0,j15=0,j16=0;
                String fstr;
                fstr="You have selected - "+finalstring;
                if(i>=4) {
                    Toast toast = Toast.makeText(getBaseContext(), fstr, Toast.LENGTH_SHORT);
                    toast.show();
                }

                else{
                    Toast toast = Toast.makeText(getBaseContext(), "Select atleast 4 items", Toast.LENGTH_SHORT);
                    toast.show();
                }
               /* Toast toast = Toast.makeText(getBaseContext(), finalstring, Toast.LENGTH_SHORT);
                toast.show();*/


                finalstring="";i=0;


            }
        });

    }
}
