package com.shenkar.fabian.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonplus,buttonmult,buttonC,buttonequal,buttondiv,buttonminus,buttondot;
    EditText editText;
    float one,two;
    boolean Add,Sub,Mult,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttondot = findViewById(R.id.buttondot);
        buttonplus = findViewById(R.id.buttonplus);
        buttonmult = findViewById(R.id.buttonmult);
        buttonC = findViewById(R.id.buttonC);
        buttonequal = findViewById(R.id.buttonequal);
        buttondiv = findViewById(R.id.buttondiv);
        buttonminus = findViewById(R.id.buttonminus);
        editText = findViewById(R.id.edt);

        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+"9");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText("");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editText.setText(editText.getText()+".");
            }
        });
        buttonplus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(editText==null){
                    editText.setText("");
                }
                else{
                    one = Float.parseFloat(editText.getText()+"");
                    Add=true;
                    editText.setText(null);
                }
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                one=Float.parseFloat(editText.getText()+"");
                Sub=true;
                editText.setText(null);
            }
        });
        buttonmult.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                one=Float.parseFloat(editText.getText()+"");
                Mult=true;
                editText.setText(null);
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                one=Float.parseFloat(editText.getText()+"");
                Div=true;
                editText.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two = Float.parseFloat(editText.getText() + "");

                if (Add == true) {
                    editText.setText(one + two + "");
                    Add = false;
                }

                if (Sub == true) {
                    editText.setText(one - two + "");
                    Sub = false;
                }

                if (Mult == true) {
                    editText.setText(one * two + "");
                    Mult = false;
                }

                if (Div == true) {
                    editText.setText(one / two + "");
                    Div = false;
                }
            }
        });
    }
}
