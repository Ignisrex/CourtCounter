package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_A =0;
    int score_B =0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //Functions for calculating the points for Team A
    public void point_3_A(View view){
        score_A = score_A + 3;
        displayForTeamA(score_A);

    }
    public void point_2_A(View view){
        score_A = score_A + 2;
        displayForTeamA(score_A);

    }
    public void point_1_A(View view){
        score_A = score_A + 1;
        displayForTeamA(score_A);

    }
    //Functions for calculating the points for Team B
    public void point_3_B(View view){
        score_B = score_B + 3;
        displayForTeamB(score_B);

    }
    public void point_2_B(View view){
        score_B = score_B + 2;
        displayForTeamB(score_B);

    }
    public void point_1_B(View view){
        score_B = score_B + 1;
        displayForTeamB(score_B);

    }
    //Reset Function
    public void reset(View view){
        score_A =0;
        score_B = 0;
        displayForTeamA(score_A);
        displayForTeamB(score_B);
    }
    /*court image was downloaded from 123trf.com
        Wasn't sure if it was ok for me to 'make it pretty' my own way.
        I made sure I followed the project rubric so hopefully that wasn't an issue.
     */


}
