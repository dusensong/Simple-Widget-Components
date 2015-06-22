package com.soup.widget.samples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.Toast;

import com.soup.widget.CheckedImageView;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        CheckedImageView checkedImageView = (CheckedImageView)findViewById(R.id.check);
        checkedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v instanceof Checkable) {
                    ((Checkable)v).toggle();
                }
            }
        });
        checkedImageView.setOnCheckedChangeListener(new CheckedImageView.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CheckedImageView buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), "Checked changed " + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
