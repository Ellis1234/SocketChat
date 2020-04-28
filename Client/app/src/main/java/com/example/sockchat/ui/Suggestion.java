package com.example.sockchat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sockchat.R;

public class Suggestion extends AppCompatActivity {
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sockchat.R.layout.suggestion);
        submit = (Button) findViewById(com.example.sockchat.R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Suggestion.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(Suggestion.this, "反馈成功！",Toast.LENGTH_SHORT).show();
            }
        });
    }
}