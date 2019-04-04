package com.apps.kunalfarmah.tisdashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DoubtsActivity extends AppCompatActivity {

    TextView head,body;
    RecyclerView replies;
    EditText reply;
    Button breply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubts);

        head=findViewById(R.id.doubt_header);
        body = findViewById(R.id.doubt_body);

        replies = findViewById(R.id.replies);
        reply = findViewById(R.id.reply_field);

        breply = findViewById(R.id.reply_but);
    }
}
