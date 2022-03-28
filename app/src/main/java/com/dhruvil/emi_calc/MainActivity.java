package com.dhruvil.emi_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText principal,intrest,time;
    TextView result;
    Button reset,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principal = findViewById(R.id.principal);
        intrest = findViewById(R.id.intrest);
        time = findViewById(R.id.time);
        reset = findViewById(R.id.reset);
        ans = findViewById(R.id.ans);
        result = findViewById(R.id.result);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float i1 = Float.valueOf(principal.getText().toString());
                Float i2 = Float.valueOf(intrest.getText().toString());
                Float i3 = Float.valueOf(time.getText().toString());

                Float f_ans = (i1*i2*(1+i2)*i3/((1+i2)*(i3-1)));

                result.setText("Your Payable Amount With Intrest : "+(f_ans+i1)+"\n\n"+"Your Intrest is : "+f_ans);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                principal.setText("");
                intrest.setText("");
                time.setText("");
                result.setText("");

            }
        });

    }
}