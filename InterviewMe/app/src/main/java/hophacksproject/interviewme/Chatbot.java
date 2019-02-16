package hophacksproject.interviewme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
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



        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();

                tv1.setText(tv1.getText()+ "\n"+ text);


                //start interview with 3 general questions, then questions tailored to a specific
                // type of interview
                if(countClicks == 0)
                {
                    String name = editText.getText().toString();
                    chRes = new ChatResponse(name, t);
                    tv2.setText(tv2.getText() + "\n\n" + fiftyChar(chRes.beginInterview()));
                    tv1.setText("\n\n\n\n");
                }
                else if(countClicks < 3)
                {
                    tv2.setText(tv2.getText().toString() + "\n\n" + fiftyChar(chRes.analyzeResponse(text)));
                    tv2.setText(tv2.getText().toString() + "\n\n" + fiftyChar(chRes.askGenQuestion()));
                    tv1.setText("\n\n\n\n");
                }
                else
                    {
                    tv2.setText(tv2.getText().toString() + "\n\n" + fiftyChar(chRes.analyzeResponse(text)));
                    tv2.setText(tv2.getText().toString() + "\n\n" + fiftyChar(chRes.askTypeQuestion()));
                        tv1.setText("\n\n\n\n");
                }

                //editText.setText("");
                countClicks++;

            }
        });

    }

    public String fiftyChar(String str){
        boolean breakMe = false;
        String strResult = "";
        for (int i = 0; i<str.length();i++){
            if(i%50 == 0 && i>0){
                breakMe = true;
            }
            char c = str.charAt(i);

            if (breakMe && c == ' '){
                strResult += "\n";
                breakMe = false;
            }
            strResult += c;

        }
        return strResult;

    }
}
