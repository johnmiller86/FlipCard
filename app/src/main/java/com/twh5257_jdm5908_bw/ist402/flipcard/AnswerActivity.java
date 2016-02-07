package com.twh5257_jdm5908_bw.ist402.flipcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Button questionBtn = (Button) findViewById(R.id.button);
        questionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showQuestion = new Intent(AnswerActivity.this, QuestionActivity.class);
                startActivity(showQuestion);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        overridePendingTransition(R.animator.answer_out, R.animator.question_in);
    }
}
