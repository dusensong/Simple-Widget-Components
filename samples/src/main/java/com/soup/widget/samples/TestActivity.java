package com.soup.widget.samples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof Checkable) {
                    ((Checkable)v).toggle();
                }
            }
        });
    }
}
