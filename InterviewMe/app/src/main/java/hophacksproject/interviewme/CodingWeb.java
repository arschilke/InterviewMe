package hophacksproject.interviewme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CodingWeb extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_web);
        webView = findViewById(R.id.webview);

        Intent thisIntent = getIntent();
        Bundle extras = thisIntent.getExtras();
        String url = extras.getString("url");
        webView.loadUrl(url);
    }
}
