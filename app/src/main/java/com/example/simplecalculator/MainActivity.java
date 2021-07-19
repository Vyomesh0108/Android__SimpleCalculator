package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    EditText etn1,etn2;
    Button btplus,btmin,btmul,btdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Used to connect current java file with respective xml file.

        etn1 = findViewById(R.id.etn1);
        etn2 = findViewById(R.id.etn2);
        btplus = findViewById(R.id.btplus);
        btmin = findViewById(R.id.btmin);
        btmul = findViewById(R.id.btmul);
        btdiv = findViewById(R.id.btdiv);

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(etn1.getText().toString());
                int n2 = Integer.parseInt(etn2.getText().toString());

                int add = n1+n2;

                Toast.makeText(MainActivity.this, "Addition of "+n1+" + "+n2+" is "+add, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);   //Used to call another activity/Screen.
                intent.putExtra("ans",""+add);  //Used to pass data.
                startActivity(intent);  //Used to call activity.
            }
        });

        btmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(etn1.getText().toString());
                int n2 = Integer.parseInt(etn2.getText().toString());

                int sub = n1-n2;

                Toast.makeText(MainActivity.this, "Subtraction of "+n1+" - "+n2+" is "+sub, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);   //Used to call another activity/Screen.
                intent.putExtra("ans",""+sub);  //Used to pass data.
                startActivity(intent);  //Used to call activity.
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(etn1.getText().toString());
                int n2 = Integer.parseInt(etn2.getText().toString());

                int mul = n1*n2;

                Toast.makeText(MainActivity.this, "Multiplication of "+n1+" * "+n2+" is "+mul, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);   //Used to call another activity/Screen.
                intent.putExtra("ans",""+mul);  //Used to pass data.
                startActivity(intent);  //Used to call activity.
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float n1 = Integer.parseInt(etn1.getText().toString());
                float n2 = Integer.parseInt(etn2.getText().toString());

                float div = n1/n2;

                Toast.makeText(MainActivity.this, "Division of "+n1+" / "+n2+" is "+div, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);   //Used to call another activity/Screen.
                intent.putExtra("ans",""+div);  //Used to pass data.
                startActivity(intent);  //Used to call activity.
            }
        });
    }
}