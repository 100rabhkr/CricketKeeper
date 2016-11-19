package com.example.android.cricketkeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int RunA = 0;
    int OutA = 0;
    String Msg = "All Out";
    int RunB = 0;
    int OutB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score, int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        String TotalScoreA = score + "/" + wickets;
        scoreView.setText(TotalScoreA);
    }

    public void AllOutForTeamA(int score, String Msg) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        String TotalScoreA = "Total Score: " + score + "/" + Msg;
        scoreView.setText(TotalScoreA);
        findViewById(R.id.wikA).setClickable(false);
        findViewById(R.id.pls1A).setClickable(false);
        findViewById(R.id.pls4A).setClickable(false);
        findViewById(R.id.pls6A).setClickable(false);
    }

    public void PlusOneForTeamA(View v) {
        RunA = RunA + 1;
        displayForTeamA(RunA, OutA);
    }

    public void PlusFourForTeamA(View v) {
        RunA = RunA + 4;
        displayForTeamA(RunA, OutA);
    }

    public void PlusSixForTeamA(View v) {
        RunA = RunA + 6;
        displayForTeamA(RunA, OutA);
    }

    public void WicketForTeamA(View v) {
        if (OutA == 9) {
            AllOutForTeamA(RunA, Msg);
        } else {
            OutA = OutA + 1;
            displayForTeamA(RunA, OutA);
        }

    }

    public void displayForTeamB(int score, int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        String TotalScoreB = score + "/" + wickets;
        scoreView.setText(TotalScoreB);
    }

    public void AllOutForTeamB(int score, String Msg) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        String TotalScoreB = "Total Score: " + score + "/" + Msg;
        scoreView.setText(TotalScoreB);
        findViewById(R.id.wikB).setClickable(false);
        findViewById(R.id.pls1B).setClickable(false);
        findViewById(R.id.pls4B).setClickable(false);
        findViewById(R.id.pls6B).setClickable(false);
    }

    public void PlusOneForTeamB(View v) {
        RunB = RunB + 1;
        displayForTeamB(RunB, OutB);
    }

    public void PlusFourForTeamB(View v) {
        RunB = RunB + 4;
        displayForTeamB(RunB, OutB);
    }

    public void PlusSixForTeamB(View v) {
        RunB = RunB + 6;
        displayForTeamB(RunB, OutB);
    }

    public void WicketForTeamB(View v) {
        if (OutB == 9) {
            AllOutForTeamB(RunB, Msg);
        } else {
            OutB = OutB + 1;
            displayForTeamB(RunB, OutB);
        }

    }

    public void Reset(View v) {
        RunA = 0;
        RunB = 0;
        OutA = 0;
        OutB = 0;
        displayForTeamA(RunA, OutA);
        displayForTeamB(RunB, OutB);
        findViewById(R.id.wikB).setClickable(true);
        findViewById(R.id.pls1B).setClickable(true);
        findViewById(R.id.pls4B).setClickable(true);
        findViewById(R.id.pls6B).setClickable(true);
        findViewById(R.id.wikA).setClickable(true);
        findViewById(R.id.pls1A).setClickable(true);
        findViewById(R.id.pls4A).setClickable(true);
        findViewById(R.id.pls6A).setClickable(true);
    }


}
