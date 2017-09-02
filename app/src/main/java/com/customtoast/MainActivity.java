package com.customtoast;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textId=(TextView)findViewById(R.id.textId);
        textId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  MaterialToast materialToast=new MaterialToast(MainActivity.this);
                materialToast.show("Custom Toast", ContextCompat.getDrawable(MainActivity.this,R.drawable.toast_drawable),
                        ContextCompat.getColor(MainActivity.this,R.color.colorAccent),
                        Gravity.CENTER_HORIZONTAL);*/

            }
        });
    }
}
