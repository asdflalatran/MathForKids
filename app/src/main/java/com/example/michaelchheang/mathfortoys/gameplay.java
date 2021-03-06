package com.example.michaelchheang.mathfortoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;


public class gameplay extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private ArrayList<Button> buttons = new ArrayList<>();

    private String mAnswer;
    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        mScoreView = (TextView) findViewById(R.id.scoreText);
        mQuestionView = (TextView) findViewById(R.id.problemText);
        mButtonChoice1 = (Button) findViewById(R.id.choice1_button);
        mButtonChoice2 = (Button) findViewById(R.id.choice2_button);
        mButtonChoice3 = (Button) findViewById(R.id.choice3_button);
        mButtonChoice4 = (Button) findViewById(R.id.choice4_button);

        buttons.add(mButtonChoice1);
        buttons.add(mButtonChoice2);
        buttons.add(mButtonChoice3);
        buttons.add(mButtonChoice4);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    Toast.makeText(gameplay.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(gameplay.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    Toast.makeText(gameplay.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(gameplay.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(gameplay.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(gameplay.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    Toast.makeText(gameplay.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(gameplay.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getKQuestion());
        Collections.shuffle(buttons);
        mAnswer = String.valueOf(mQuestionLibrary.getAnswer());
        buttons.get(0).setText(mAnswer);
        for (int i = 1; i < buttons.size(); i++){
            buttons.get(i).setText(String.valueOf(mQuestionLibrary.getChoice(i)));
        }
    }

    private void updateScore(int mScore) {
        mScoreView.setText("" + mScore);
    }
}

