package com.example.addnum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText n1,n2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        EditText n1,n2;

        Button button;
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = Integer.parseInt(n1.getText().toString())+ Integer.parseInt(n2.getText().toString());
                textView.setText("Answer :" +sum);
            }
        });


    }

}
