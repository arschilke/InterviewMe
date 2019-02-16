package hophacksproject.interviewme;

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
    Spinner typeInterview;
    int countClicks;
    ChatResponse chRes;
    char t;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);


        countClicks = 0;

        tv1 = findViewById(R.id.transcript);

        editText = findViewById(R.id.editText);
        sendBtn = findViewById(R.id.sendBtn);

        typeInterview = findViewById(R.id.TypeInterviewSpinner);
        tv2 = findViewById(R.id.response);
        tv2.setText("");

        String type = typeInterview.getSelectedItem().toString();

        switch(type)
        {
            case "Technology": t = 't';
                break;
            case "Business": t = 'b';
                break;
            case "College Application": t = 'c';
                break;
            default: t = 'a';
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
                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                linearLayout.addView(textView);


                TextView textView2 = new TextView(getApplicationContext());

                textView2.setTextColor(getResources().getColor(R.color.colorPrimary));
                textView2.setGravity(Gravity.RIGHT);
                //start interview with 3 general questions, then questions tailored to a specific
                // type of interview
                if(countClicks == 0)
                {
                    String name = editText.getText().toString();
                    chRes = new ChatResponse(name, t);
                    textView2.setText(textView2.getText() + "\n\n" + chRes.beginInterview());

                }
                else if(countClicks < 3)
                {
                    textView2.setText(textView2.getText().toString() + "\n\n" + chRes.analyzeResponse(text));
                    textView2.setText(textView2.getText().toString() + "\n\n" + chRes.askGenQuestion());

                }
                else
                    {
                    textView2.setText(textView2.getText().toString() + "\n\n" + chRes.analyzeResponse(text));
                    textView2.setText(textView2.getText().toString() + "\n\n" + chRes.askTypeQuestion());

                }
                linearLayout.addView(textView2);
                //editText.setText("");
                countClicks++;

            }
        });

    }

}
