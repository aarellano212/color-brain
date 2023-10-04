package com.youtube.colorbraintraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView txtScore = null;

    private Button btnStartAgain = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        txtScore = findViewById(R.id.txt_score);

        btnStartAgain = findViewById(R.id.btn_start_again);

        Intent intent = getIntent();
        String score = intent.getStringExtra("score");

        txtScore.setText(score);

        btnStartAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), GameActivity.class);
                view.getContext().startActivity(i);
            }
        });

    }
}