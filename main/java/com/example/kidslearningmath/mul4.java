package com.example.kidslearningmath;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class mul4 extends AppCompatActivity {
    Button mbutton;
    EditText m;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul4);
        mbutton=(Button)findViewById(R.id.b5);
        m=(EditText) findViewById(R.id.answer);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m.getText().toString().equals("20")){
                    Toast.makeText(getApplicationContext(), "HOORAY YOU HAVE LEARN HOW TO MULTIPLY ", Toast.LENGTH_SHORT).show();
                    intent = new Intent(getApplicationContext(), c.class);
                    startActivity(intent);
                }else if(m.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "PLEASE TYPE YOUR IN THE FIELDS ", Toast.LENGTH_SHORT).show();

                }else if(m.getText().toString() !="20"){
                    Toast.makeText(getApplicationContext(), "WRONG ANSWER ", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}