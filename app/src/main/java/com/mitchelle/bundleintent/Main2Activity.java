package com.mitchelle.bundleintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);

        Bundle b = getIntent().getExtras();

        String fname = b.getString("Aname");
        String fnumber = b.getString("Anumber");

        tv1.setText(fname);
        tv2.setText(fnumber);
    }
}
