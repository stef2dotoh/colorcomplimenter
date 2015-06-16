package com.girlswritecode.colorcomplimenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private ColorDrawable mButtonColor;
    private RelativeLayout mRelativeLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mTextView = (TextView) findViewById(R.id.hexTextView);
    }

    public void changeColor(View view) {
        // Get ID of button clicked
        int mButtonId = view.getId();

        // Create instance of button
        mButton = (Button) findViewById(mButtonId);

        // Get button color and assign to variable
        mButtonColor = (ColorDrawable) mButton.getBackground();

        // Convert color to integer
        int mColorId = mButtonColor.getColor();

        // Convert color int to 6-character hex code
        String mHexColor = getString(R.string.hex_code_label) + String.format("#%06X", 0xFFFFFF & mColorId);

        // Change background color and display hex code
        mRelativeLayout.setBackgroundColor(mColorId);
        mTextView.setText(mHexColor);
    }
}
