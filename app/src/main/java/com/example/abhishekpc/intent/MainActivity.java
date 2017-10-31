package com.example.abhishekpc.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txt1=(EditText) findViewById(R.id.urltxt);
        final EditText txt2=(EditText) findViewById(R.id.maptxt);
        Button btn1=(Button) findViewById(R.id.openweb);
        Button btn2=(Button) findViewById(R.id.openmap);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=txt1.getText().toString();
                Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc=txt2.getText().toString();
                Intent i2=new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("geo:0,0?q="+loc));
                startActivity(i2);
            }
        });
    }
}
