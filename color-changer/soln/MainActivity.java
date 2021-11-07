package com.example.color_changer;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Set your UI!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Red, Green, and Blue SeekBars.
        redSeekBar = findViewById(R.id.redSeekBar); // TODO
        greenSeekBar = findViewById(R.id.greenSeekBar); // TODO
        blueSeekBar = findViewById(R.id.blueSeekBar); // TODO

        final RelativeLayout rl = findViewById(R.id.bkgd); // TODO

        // We add a Listener to each of the SeekBars. This will allow us to know when
        // someone has slid the button from one side to another, and set the background color.
        // This first Listener is for the red SeekBar.
        redSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                int redProgress = redSeekBar.getProgress(); // This will get the position of the red seekBar.
                // Since the seekBar's max is 255, this well be an int between
                // 0 and 255.
                int greenProgress = greenSeekBar.getProgress(); // TODO
                int blueProgress = blueSeekBar.getProgress();  // TODO

                // Create the color that the background should be.
                // Color.rgb returns an int.
                int backgroundColor = Color.rgb(redProgress, greenProgress, blueProgress);

                rl.setBackgroundColor(backgroundColor);
            }

            // These are important, but leave them blank for now. You can play with them as a stretch goal.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // TODO: Add listeners for the green and red seekBars.
        //  They will be almost identical to the red seekbar - there is one change you need to make.
        //  Make sure you have the correct number of brackets, parentheses, and semicolons copy/pasted!
        greenSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                int redProgress = redSeekBar.getProgress(); // This will get the position of the red seekBar.
                // Since the seekBar's max is 255, this well be an int between
                // 0 and 255.
                int greenProgress = greenSeekBar.getProgress(); // TODO
                int blueProgress = blueSeekBar.getProgress();  // TODO

                // Create the color that the background should be.
                // Color.rgb returns an int.
                int backgroundColor = Color.rgb(redProgress, greenProgress, blueProgress);

                rl.setBackgroundColor(backgroundColor);
            }

            // These are important, but leave them blank for now. You can play with them as a stretch goal.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        blueSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                int redProgress = redSeekBar.getProgress(); // This will get the position of the red seekBar.
                // Since the seekBar's max is 255, this well be an int between
                // 0 and 255.
                int greenProgress = greenSeekBar.getProgress(); // TODO
                int blueProgress = blueSeekBar.getProgress();  // TODO

                // Create the color that the background should be.
                // Color.rgb returns an int.
                int backgroundColor = Color.rgb(redProgress, greenProgress, blueProgress);

                rl.setBackgroundColor(backgroundColor);
            }

            // These are important, but leave them blank for now. You can play with them as a stretch goal.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}