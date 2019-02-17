package hophacksproject.interviewme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class InterviewSet extends AppCompatActivity {
    Spinner typeInterview;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_set);



        typeInterview = findViewById(R.id.typeInterviewSpinner);




        btn = findViewById(R.id.btnToChat);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = typeInterview.getSelectedItem().toString();

                Intent mIntent = new Intent(getApplicationContext(), Chatbot.class);
                Bundle mBundle = new Bundle();
                mBundle.putString("type", type);
                mIntent.putExtras(mBundle);

                startActivity(mIntent);
            }
        });


    }
}
