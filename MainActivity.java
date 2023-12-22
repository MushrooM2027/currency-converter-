package com.example.unitconverter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
//    private Button button2;
    private TextView textView2;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        textView2=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextText);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "Hi click listener worked", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();

                if(s.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else{
                    int rupees=Integer.parseInt(s);
                    double euro=0.011*rupees;
                DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
                String roundedValue = decimalFormat.format(euro);
                textView2.setText("The value in Euros is  " + roundedValue);
            }}
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String st=editText.getText().toString();
                if(st.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter a Value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int euroinput=Integer.parseInt(st);
                    double rupeesoutput=90.84*euroinput;
                    DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
                    String roundedValue2 = decimalFormat.format(rupeesoutput);
                    textView2.setText("The value in Rupees is  " + roundedValue2);
                }
            }
        });
    }
}
