package hophacksproject.interviewme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Chatbot extends AppCompatActivity {
    Button sendBtn;
    EditText editText;
    TextView tv1, tv2;

    int countClicks;
    ChatResponse chRes;
    char t;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbox);


        countClicks = 0;

        tv1 = findViewById(R.id.transcript);
        tv1.setText("");

        editText = findViewById(R.id.editText);
        sendBtn = findViewById(R.id.sendBtn);

        tv2 = findViewById(R.id.response);
        tv2.setText("");

        Intent mIntent = getIntent();
        Bundle extras = mIntent.getExtras();
        String type = extras.getString("type");

        switch (type) {
            case "Technology":
                t = 't';
                break;
            case "Business":
                t = 'b';
                break;
            case "College Application":
                t = 'c';
                break;
            default:
                t = 'a';
                break;
        }
        tv2.setText("Hello, what is your name?");


        linearLayout = (LinearLayout) findViewById(R.id.ConvoLayout);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();
                TextView textView = new TextView(getApplicationContext());

                textView.setText(text);
                textView.setTextSize(18);
                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                linearLayout.addView(textView);


                TextView textView2 = new TextView(getApplicationContext());

                textView2.setTextColor(getResources().getColor(R.color.colorPrimary));
                textView2.setGravity(Gravity.RIGHT);
                textView2.setTextSize(18);

                String text2 = "";
                //start interview with 3 general questions, then questions tailored to a specific
                // type of interview
                if (countClicks == 0) {
                    String name = editText.getText().toString();
                    chRes = new ChatResponse(name, t);
                    text2 += "\n\n" + chRes.beginInterview();

                } else if (countClicks < 3) {
                    text2 += "\n\n" + chRes.analyzeResponse(text);
                    text2 += "\n\n" + chRes.askGenQuestion();

                } else {
                    text2 += "\n\n" + chRes.analyzeResponse(text);
                    text2 += "\n\n" + chRes.askTypeQuestion();

                }
                textView2.setText(text2);
                linearLayout.addView(textView2);
                editText.setText("");
                countClicks++;

            }
        });
    }
}
