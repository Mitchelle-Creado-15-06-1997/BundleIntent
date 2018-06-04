package com.mitchelle.bundleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.editText);
        ed2=(EditText) findViewById(R.id.editText2);
        btn=(Button) findViewById(R.id.button);


    }
    public void btnclick(View v)
    {
        String name = ed1.getText().toString();
        String number = ed2.getText().toString();

        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        Bundle b = new Bundle();
        b.putString("Aname",name);
        b.putString("Anumber",number);

        i.putExtras(b);

        startActivity(i);
    }
}
