package com.erinfa.cardview.textView;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.erinfa.cardview.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    Animation rotate_open_anim, rotate_close_anim, from_bottom_anim, to_bottom_anim;
    FloatingActionButton floatingActionButton;
    ExtendedFloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4;
    boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotate_open_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_open_anim);
        rotate_close_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_close_anim);
        from_bottom_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.from_bottom_anim);
        to_bottom_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.to_bottom_anim);

        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton1 = findViewById(R.id.floatingActionButton2);
        floatingActionButton2 = findViewById(R.id.floatingActionButton3);
        floatingActionButton3 = findViewById(R.id.floatingActionButton4);
        floatingActionButton4 = findViewById(R.id.floatingActionButton5);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddButtonClicked();

            }
        });
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

            }
        });
        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void onAddButtonClicked() {
        setVisibility(clicked);
        setAnimation(clicked);
        clicked = !clicked;

    }

    private void setAnimation(boolean clicked) {
        if (!clicked) {
            floatingActionButton.setAnimation(rotate_open_anim);
            floatingActionButton1.startAnimation(from_bottom_anim);
            floatingActionButton2.startAnimation(from_bottom_anim);
            floatingActionButton3.startAnimation(from_bottom_anim);
            floatingActionButton4.startAnimation(from_bottom_anim);
        } else {
            floatingActionButton.setAnimation(rotate_close_anim);
            floatingActionButton1.startAnimation(to_bottom_anim);
            floatingActionButton2.startAnimation(to_bottom_anim);
            floatingActionButton3.startAnimation(to_bottom_anim);
            floatingActionButton4.startAnimation(to_bottom_anim);
        }

    }

    private void setVisibility(boolean clicked) {
        if (!clicked) {
            floatingActionButton1.setVisibility(View.VISIBLE);
            floatingActionButton2.setVisibility(View.VISIBLE);
            floatingActionButton3.setVisibility(View.VISIBLE);
            floatingActionButton4.setVisibility(View.VISIBLE);
        } else {
            floatingActionButton1.setVisibility(View.INVISIBLE);
            floatingActionButton2.setVisibility(View.INVISIBLE);
            floatingActionButton3.setVisibility(View.INVISIBLE);
            floatingActionButton4.setVisibility(View.INVISIBLE);
        }
    }


}