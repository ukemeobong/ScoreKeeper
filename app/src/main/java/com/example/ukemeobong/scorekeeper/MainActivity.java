package com.example.ukemeobong.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
//Initializes all the scores to zero and 50 for ball possession
public class MainActivity extends AppCompatActivity {
    int scoreNigeria = 0;
    int scoreArgentina = 0;
    int possessionNigeria = 50;
    int possessionArgentina = 50;
    int offsideNigeria = 0;
    int offsideArgentina = 0;
    int yellowcardNigeria = 0;
    int yellowcardArgentina = 0;
    int redcardNigeria = 0;
    int redcardArgentina = 0;

//Displays the initialized scores
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForNigeria(0);
        displayForArgentina(0);
        displayPossessionForNigeria(50);
        displayPossessionForArgentina(50);
        displayOffsideForNigeria(0);
        displayOffsideForArgentina(0);
        displayYellowcardForNigeria(0);
        displayYellowcardForArgentina(0);
        displayRedcardForNigeria(0);
        displayRedcardForArgentina(0);
    }

//Increases and displays the Nigerian score
    public void addGoalForNigeria(View v) {
        scoreNigeria = scoreNigeria + 1;
        displayForNigeria(scoreNigeria);
    }

//Increases and displays the Argentine score
    public void addGoalForArgentina(View v) {
        scoreArgentina = scoreArgentina + 1;
        displayForArgentina(scoreArgentina);
    }
//Increases and displays the ball possession for Nigeria
    public void addPossessionForNigeria(View v) {
        if (possessionNigeria == 100) {
            return;
        }

            possessionNigeria = possessionNigeria + 1;
            possessionArgentina = possessionArgentina - 1;
            displayPossessionForArgentina(possessionArgentina);
            displayPossessionForNigeria(possessionNigeria);

    }
//Increases and displays the ball possession for Argentina
    public void addPossessionForArgentina(View v) {
        if (possessionArgentina == 100) {
            return;
        }

            possessionArgentina = possessionArgentina + 1;
            possessionNigeria = possessionNigeria - 1;
            displayPossessionForArgentina(possessionArgentina);
            displayPossessionForNigeria(possessionNigeria);

    }

//Adds one each time an Offside offense for Nigeria is committed
    public void addOffsideForNigeria(View v) {
        offsideNigeria = offsideNigeria + 1;
        displayOffsideForNigeria(offsideNigeria);
    }
//Adds one each time an Offside offense for Argentina is committed
    public void addOffsideForArgentina(View v) {
        offsideArgentina = offsideArgentina + 1;
        displayOffsideForArgentina(offsideArgentina);
    }
//Adds one each time a Yellow Card offense for Nigeria is committed
    public void addYellowcardForNigeria(View v) {
        yellowcardNigeria = yellowcardNigeria + 1;
        displayYellowcardForNigeria(yellowcardNigeria);
    }
//Adds one each time a Yellow Card offense for Argentina is committed
    public void addYellowcardForArgentina(View v) {
        yellowcardArgentina = yellowcardArgentina + 1;
        displayYellowcardForArgentina(yellowcardArgentina);
    }
//Adds one each time a Red Card offense for Nigeria is committed
    public void addRedcardForNigeria(View v) {
        redcardNigeria = redcardNigeria + 1;
        displayRedcardForNigeria(redcardNigeria);
    }
//Adds one each time a Red Card offense for Argentina is committed
    public void addRedcardForArgentina(View v) {
        redcardArgentina = redcardArgentina + 1;
        displayRedcardForArgentina(redcardArgentina);
    }
//Resets all the scores to zero
    public void resetScore (View v) {
        scoreNigeria = 0;
        scoreArgentina = 0;
        possessionNigeria = 50;
        possessionArgentina = 50;
        offsideNigeria = 0;
        offsideArgentina = 0;
        yellowcardNigeria = 0;
        yellowcardArgentina = 0;
        redcardNigeria = 0;
        redcardArgentina = 0;
        displayForNigeria(scoreNigeria);
        displayForArgentina(scoreArgentina);
        displayPossessionForNigeria(possessionNigeria);
        displayPossessionForArgentina(possessionArgentina);
        displayOffsideForNigeria(offsideNigeria);
        displayOffsideForArgentina(offsideArgentina);
        displayYellowcardForNigeria(yellowcardNigeria);
        displayYellowcardForArgentina(yellowcardArgentina);
        displayRedcardForNigeria(redcardNigeria);
        displayRedcardForArgentina(redcardArgentina);

    }

//Displays the goals scored by Nigeria
    public void displayForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_score);
        scoreView.setText(String.valueOf(score));
    }


//Displays the goals scored by Argentina
    public void displayForArgentina(int score) {
        TextView scoreView = (TextView) findViewById(R.id.argentina_score);
        scoreView.setText(String.valueOf(score));
    }
//Displays the Possession for Nigeria
    public void displayPossessionForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_possession);
        scoreView.setText(String.valueOf(score)+ "%");
    }

// Displays the Possession for Argentina
    public void displayPossessionForArgentina(int score) {
        TextView scoreView = (TextView) findViewById(R.id.argentina_possession);
        scoreView.setText(String.valueOf(score)+ "%");
    }
// Displays the Offside for Nigeria
    public void displayOffsideForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_offside);
        scoreView.setText(String.valueOf(score));
    }
// Displays the Offside for Argentina
    public void displayOffsideForArgentina(int score) {
        TextView scoreView = (TextView) findViewById(R.id.argentina_offside);
        scoreView.setText(String.valueOf(score));
    }
// Displays the Yellow Card for Nigeria
    public void displayYellowcardForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_yellow_card);
        scoreView.setText(String.valueOf(score));
    }
// Displays the Yellow Card for Argentina
    public void displayYellowcardForArgentina(int score) {
        TextView scoreView = (TextView) findViewById(R.id.argentina_yellow_card);
        scoreView.setText(String.valueOf(score));
    }
// Displays the Red Card for Nigeria
    public void displayRedcardForNigeria(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nigeria_red_card);
        scoreView.setText(String.valueOf(score));
    }
// Displays the Red Card for Argentina
    public void displayRedcardForArgentina(int score) {
        TextView scoreView = (TextView) findViewById(R.id.argentina_red_card);
        scoreView.setText(String.valueOf(score));
    }


}


