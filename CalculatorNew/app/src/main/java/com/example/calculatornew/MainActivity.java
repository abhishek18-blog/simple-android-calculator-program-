package com.example.calculatornew;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText display ;
    private TextView result;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnCross,btnMinus,btnPlus,btnMultiply,btnDiv,btnEqual,btnC;
    private double num1,num2;
    private boolean isAddition,isSubtraction,isMultiply,isDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        result = findViewById(R.id.results);
        btnC = findViewById(R.id.btnC);


        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().length()>0){
                    num1 = Double.parseDouble(display.getText().toString());
                    isAddition = true;
                            //clear the display for next number
                    display.setText("");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().length()>0){
                    num1 = Double.parseDouble(display.getText().toString());
                    isSubtraction =  true;
                    // clear text for next no.
                    display.setText("");
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().length()>0);
                num1 = Double.parseDouble(display.getText().toString());
                isMultiply =  true;
                display.setText("");

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().length()>0);
                num1 = Double.parseDouble(display.getText().toString());
                isSubtraction =  true;
                display.setText("");

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
                result.setText("0");
                isSubtraction = false;
                isAddition = false;
                isDivision =  false;
                isMultiply = false;
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().length()>0){
                    num2 = Double.parseDouble(display.getText().toString());

                    if(isAddition){
                        result.setText(String.valueOf(num1 + num2));
                    }
                    else if(isSubtraction){
                        result.setText(String.valueOf(num1 - num2));
                    } else if (isMultiply) {
                        result.setText(String.valueOf(num1 * num2));

                    }
                    else if (isDivision){
                        if(num2!=0){
                            result.setText(String.valueOf(num1/num2));
                        }
                        else{
                            result.setText("error");
                        }

                    }
                    //reset all flags
                    isDivision =  false;
                    isMultiply = false;
                    isSubtraction =  false;
                    isAddition = false;
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText().toString()+"0");
            }
        });








    }
}