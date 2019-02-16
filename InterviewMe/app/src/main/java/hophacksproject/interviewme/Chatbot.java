package hophacksproject.interviewme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Chatbot extends AppCompatActivity {
    Button sendBtn;
    EditText editText;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        tv1 = findViewById(R.id.transcript);
        tv1.setText("");
        editText = findViewById(R.id.editText);
        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                //set to algorithm
                tv1.setText(tv1.getText()+ "\n"+ text);
                //retreve algo results and add to tv
            }
        });

    }
}
