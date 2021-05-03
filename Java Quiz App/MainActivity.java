package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Was java created in 1996?","Garbage Collection is manual process","Constructor overloading is not possible in Java","Assignment operator is evaluated Left to Right","Variable name can begin with a letter, \"$\", or \"_\"","Interfaces can be instantiated","A .class file contains bytecodes?","James Gosling is father of Java?","Variables declared inside a for loop are limited in scope to the loop","Objects of a subclass can be assigned to a super class reference"};
    private boolean[] answers = {true, false,false,false,true,false,true,false,false,true};
    private int score =0;
    Button yes;
    Button no;
    TextView question;
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if array is not going out of bounds
                if(index<=questions.length-1){
                    if(answers[index]==true){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: "+ score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the quiz to play again :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if array is not going out of bounds
                if(index<=questions.length-1){
                    if(answers[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: "+ score + "/"+ questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the quiz to play again :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
