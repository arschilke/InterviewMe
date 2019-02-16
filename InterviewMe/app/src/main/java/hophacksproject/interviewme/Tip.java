package hophacksproject.interviewme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Tip extends AppCompatActivity {
    LinearLayout linearLayout;
    String text;
    String message;
    ArrayList<Button> btns;
    final private String[][] qAndA = {{"What should I do to prepare for my interview?", "What should I" +
            " wear to my interview?", "What should I do during the interview?", "What should I do" +
            " after the interview?", "What kinds of things will I be asked at a job interview?",
            "What do future employers want to hear from me?"}, {"Before the day of your " +
            "interview, you should prepare by researching the company and the position, " +
            "mentioning some of this information during your interview can emphasize your " +
            "excitement to the interviewer. It is also important to practice interviewing as much" +
            " as possible, especially if you are not very comfortable with public speaking.",
            "You should wear simple clothes that are appropriate for the position you are " +
                    "applying for to your interview. When in doubt, keep to your middle school's " +
                    "dress code; do not wear anything too revealing or too casual.", "Stay calm, " +
            "anxiety can cause you to lose focus on what you are being asked or your own train " +
            "of thought. Be confident in yourself and your abilities, incorporate what you know" +
            " about the company in your responses, listen carefully to the information being " +
            "given to you, and be honest in your responses.", "After the interviewer is finished " +
            "asking questions, make sure to ask one of your own, then thank the interviewer for" +
            " their time. You should also send the interviewer a thank you note and remind " +
            "them how interested you are in the position.", "Typically interviews will consist " +
            "of some general getting-to-know-you questions as well as some questions that are " +
            "more geared towards assessing what you know about the job you are applying for. " +
            "Try our practice interviews either with Steve or Alexa to hear some sample " +
            "interview questions!", "Future employers want to hear what makes you different from" +
            " the others who are applying for the position. You should be thorough and specific" +
            " in all information that you provide and do your best to stand out."}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        linearLayout = findViewById(R.id.ll);


        for( int i = 0; i < qAndA[0].length; i++){

            text = qAndA[0][i];
            message = qAndA[1][i];
            Button btn = new Button(getApplicationContext());
            btns.add(btn);
            btn.setText(text);
            btn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryLight));
            btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog alert = new AlertDialog.Builder(Tip.this).create();
                    alert.setTitle(text);
                    alert.setMessage(message);
                    alert.show();
                }
            });
            linearLayout.addView(btn);
        }



    }
}
