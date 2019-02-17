package hophacksproject.interviewme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AlexaConnect extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexa_connect);

        web = findViewById(R.id.wV);

        web.loadUrl("https://www.amazon.com/alexa-skills/b?ie=UTF8&node=13727921011");

    }
}
