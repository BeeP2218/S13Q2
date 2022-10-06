package com.example.slip13q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db=new DatabaseHandler(this);

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);

        String v1= e1.getText().toString();
        String v2=e2.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Insert:", "Inserting...");
                db.addContact(new Details(v1,v2));

                Toast.makeText(MainActivity.this, "DATA INSERTED", Toast.LENGTH_LONG).show();
            }
        });
    }
}