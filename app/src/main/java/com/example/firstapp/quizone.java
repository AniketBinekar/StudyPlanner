package com.example.firstapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class quizone extends AppCompatActivity {
    Button answer1,answer2,answer3,answer4;
    TextView score,question;
    private Questation mQuestion=new Questation();
    private String mans;
    private  int mScore=0;
    private  int mQuestionsLenght =mQuestion.mquestion.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizone);
        r=new Random();
        answer1=(Button)findViewById(R.id.ans1);
        answer2=(Button)findViewById(R.id.ans2);
        answer3=(Button)findViewById(R.id.ans3);
        answer4=(Button)findViewById(R.id.ans4);

        score=(TextView)findViewById(R.id.score);
        question=(TextView)findViewById(R.id.question);

        score.setText("Score:"+mScore);
        updateQuestion(r.nextInt(mQuestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText()==mans)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else
                {
                    gameOver();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText()==mans)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else
                {
                    gameOver();
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText()==mans)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else
                {
                    gameOver();
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText()==mans)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else
                {
                    gameOver();
                }

            }
        });
    }
    private void updateQuestion(int num)
    {

        question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getchoice1(num));
        answer2.setText(mQuestion.getchoice2(num));
        answer3.setText(mQuestion.getchoice3(num));
        answer4.setText(mQuestion.getchoice4(num));

        mans=mQuestion.getcorrect(num);
    }
    private void gameOver()
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(quizone.this);
        alert
                .setMessage("Game Over! Your Score is"+mScore+"Points")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),quizone.class));
                        finish();
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog=alert.create();
        alertDialog.show();
    }
}