package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnMult, btnDiv, btnEqual, btnDot;
    Button btnClear;
    EditText et;
    float res1, res2;
    boolean Add = false, Sub = false, Mult = false, Div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnClear = (Button) findViewById(R.id.btnClear);

        et = (EditText) findViewById(R.id.et);
//        et.setText("null");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText() + ".");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().trim().length() > 0)
                {
                    res1 = Float.parseFloat(et.getText() + "");
                    Add = true;
                    et.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().trim().length() > 0) {
                    res1 = Float.parseFloat(et.getText() + "");
                    Sub = true;
                    et.setText(null);
                }
            }
        });


        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().trim().length() > 0) {
                    res1 = Float.parseFloat(et.getText() + "");
                    Mult = true;
                    et.setText(null);
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().trim().length() > 0) {
                    res1 = Float.parseFloat(et.getText() + "");
                    Div = true;
                    et.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et.getText().toString().trim().length() > 0) {

                    res2 = Float.parseFloat(et.getText() + "");

                    if (Add == true) {
//                        for just a whole number result
//                        int res = Math.round(res1 + res2);
                        et.setText(res1 + res2 + "");
                        Add = false;
                    } else if (Sub == true) {
                        et.setText(res1 - res2 + "");
                        Sub = false;
                    } else if (Mult == true) {
                        et.setText(res1 * res2 + "");
                        Mult = false;
                    } else if (Div == true) {
                        et.setText(res1 / res2 + "");
                        Div = false;
                    }
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });


    }
}