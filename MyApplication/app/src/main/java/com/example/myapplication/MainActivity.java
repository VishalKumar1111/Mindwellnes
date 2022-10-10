package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(EditText) findViewById(R.id.textview);
        button=(Button) findViewById(R.id.button);

        final SharedPreferences sharedPref= getPreferences(Context.MODE_PRIVATE);
        String oldItem = sharedPref.getString("oldItems", "Nothing Created yet");

        textView.setText(oldItem);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPref.edit();
                editor.putString("oldItem", textView.getText().toString());
                editor.commit();
            }
        });
    }
}
