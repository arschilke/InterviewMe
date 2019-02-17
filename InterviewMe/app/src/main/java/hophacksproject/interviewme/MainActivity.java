package hophacksproject.interviewme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button interviewChat;
    Button tipButton;
    Button alexaButton, codingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipButton = findViewById(R.id.tipBtn);

        tipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tipIntent = new Intent(getApplicationContext(), Tip.class);
                startActivity(tipIntent);
            }
        });

        interviewChat = findViewById(R.id.chatBtn);

        interviewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatBot = new Intent(getApplicationContext(), InterviewSet.class);
                startActivity(chatBot);
            }
        });
        alexaButton = findViewById(R.id.alexaBtn);

        alexaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alexa = new Intent(getApplicationContext(), AlexaConnect.class);
                startActivity(alexa);
            }
        });

        codingButton = findViewById(R.id.codingBtn);

        codingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coding = new Intent(getApplicationContext(), CodingQnAActivity.class);
                startActivity(coding);
            }
        });


    }

}
