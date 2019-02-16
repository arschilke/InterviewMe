package hophacksproject.interviewme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Tip extends AppCompatActivity {
    LinearLayout linearLayout = findViewById(R.id.ll);
    ArrayList<String> array = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        for( int i = 0; i < array.size(); i++){

        }



    }
}
