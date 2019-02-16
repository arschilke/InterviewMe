package hophacksproject.interviewme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        tv1 = findViewById(R.id.transcript);
        tv1.setText("");
        editText = findViewById(R.id.editText);
        sendBtn = findViewById(R.id.sendBtn);

        typeInterview.findViewById(R.id.TypeInterviewSpinner);
        tv2 = findViewById(R.id.response);
        tv2.setText("");

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                tv1.setText(tv1.getText()+ "\n"+ text);
                countClicks++;


                //send to algorithm
                //String input (text) and spinner (typeInterview.getSelectedItem())
                String result = "";
                // retreve algo results and add to tv2
                tv2.setText(result);

            }
        });

    }
}
