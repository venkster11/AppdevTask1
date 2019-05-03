package com.venkat.appdevtask1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String finalstring="";
    int i=0;
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
           //     Toast.makeText(getBaseContext(), "This is my Toast message!",
             //           Toast.LENGTH_LONG).show();
                finalstring=finalstring+" Life ";
                i=i+1;
              //  Toast toast = Toast.makeText(getBaseContext(), finalstring , Toast.LENGTH_SHORT);
               // toast.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Politics ";
                i=i+1;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Love ";
                i=i+1;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Technology ";
                i=i+1;
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Money ";
                i=i+1;
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Career ";
                i=i+1;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Sports ";
                i=i+1;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Travel ";
                i=i+1;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Health ";
                i=i+1;
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Adult ";
                i=i+1;
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Sports ";
                i=i+1;
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Movies/TV ";
                i=i+1;
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Books ";
                i=i+1;
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Shopping ";
                i=i+1;
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Gadgets ";
                i=i+1;
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundDrawable(getResources().getDrawable(R.drawable.colorchange));
                finalstring=finalstring+" Web series ";
                i=i+1;
            }
        });

        btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

            }
        });

    }
}
