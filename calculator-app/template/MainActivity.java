// Boilerplate code from https://www.geeksforgeeks.org/how-to-build-a-simple-calculator-app-using-android-studio/
// Modified for GWC October 2021
package com.example.[YOURAPPNAME];  // TODO: Replace with the name of the folder that you found this file.
// For example, I found this file in `com.example.calculatorapp` so the above line would be
// package com.example.calculatorapp;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // TODO: read this
    // Declare some global variables.
    // These are variables that we're going to be using in all of our functions,
    // so we declare them upfront.
    EditText et_firstNumber, et_secondNumber;
    TextView resultBox;
    int firstNumber, secondNumber;


    // This function is a listener - it runs when your app gets created!
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set your UI!
        setContentView(R.layout.activity_main);
    }


    // a public function to get the input numbers from our EditTexts
    // No error handling! This will only work if both text fields have integers!
    public void getNumbers() {

        // defining the edit texts to et_firstNumber and et_secondNumber.
        // We're taking the buttons we created that we created earlier and
        // we're making them variables in Java, so we can access all the
        // information they have and use it for our calculations!

        et_firstNumber = (EditText) findViewById(R.id.[FIRST NUMBER EDITTEXT ID]); //TODO
        et_secondNumber = (EditText) findViewById(R.id.[SECOND NUMBER EDITTEXT ID]); // TODO
		/* example: if my textview's ID was "firstNumber", I would write:
		et_firstNumber = (EditText) findViewById(R.id.firstNumber);*/

        // Do the same for the result box
        resultBox = (TextView) findViewById(R.id.[RESULT BOX TEXTVIEW ID]); //TODO

        // Now, we're going to get the text from our EditTexts and convert it into a string!
        String s_firstNumber = et_firstNumber.getText().toString();
        String s_secondNumber = et_secondNumber.getText().toString();

        // converting string to int.
        firstNumber = Integer.parseInt(s_firstNumber);
        secondNumber = Integer.parseInt(s_secondNumber);
    }

    // The onClick listener to do addition.
    // TODO: set onClick listener. See instructions for photos and more detailed explanation.
    public void doAdd(View v) {
        // getNumbers() will read the numbers from the EditTexts and store them in
        // integer variables firstNumber and secondNumber.
        getNumbers();

        int sum = // TODO: add the two numbers (don't forget the semicolon at the end of the line!)

        /* This next pair of lines is pretty much the System.out.println statement:
        it sets the text of the result box to a string.
         */
        // First, make the sum into a string:
        String sumString = Integer.toString(sum);
        resultBox.setText(sumString);

        // TODO: check your code with a facilitator before making more button listeners.
    }

    // TODO: Add more listeners for each of the buttons.
}
