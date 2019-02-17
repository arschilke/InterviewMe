
package hophacksproject.interviewme;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class CodingQnAActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    final private String[][] qAndA = {{"A","B"},{"a","b"}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn_a);
        linearLayout = findViewById(R.id.ll2);


        for( int i = 0; i < qAndA[0].length; i++){

            final String text = qAndA[0][i];
            final String message = qAndA[1][i];
            Button btn = new Button(getApplicationContext());

            btn.setText(text);
            btn.setTextAppearance(getApplicationContext(), R.style.TipButton);
            btn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryLight));
            btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    methodAlert(text, message);
                }
            });
            linearLayout.addView(btn);
        }



    }
    public void methodAlert(String text, String message){
        AlertDialog alert = new AlertDialog.Builder(CodingQnAActivity.this).create();
        alert.setTitle(text);
        alert.setMessage(message);
        alert.show();
    }
}