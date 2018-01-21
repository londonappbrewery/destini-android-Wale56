package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 3 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    String lastMove;
    int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 4 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 5, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex==1){
                    mStoryIndex=3;
                    storyStatus(mStoryIndex);
                } else if (mStoryIndex==2){
                    mStoryIndex=3;
                    storyStatus(mStoryIndex);
                } else if (mStoryIndex==3){
                    mStoryIndex=6;
                    storyStatus(mStoryIndex);
                }


            }
        });


        // TODO: Steps 5, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex==1){
                    mStoryIndex=2;
                    storyStatus(mStoryIndex);
                } else if (mStoryIndex==2){
                    mStoryIndex=4;
                    storyStatus(mStoryIndex);
                } else if (mStoryIndex==3){
                    mStoryIndex=5;
                    storyStatus(mStoryIndex);
                }


            }
        });
    }

    public void storyStatus(int mStoryIndex) {

        if (mStoryIndex == 1) {
            mButtonTop.setText(getString(R.string.T1_Ans1));
            mButtonBottom.setText(getString(R.string.T1_Ans2));
            mStoryTextView.setText(getString(R.string.T1_Story));

        } else if (mStoryIndex == 2) {
            mButtonTop.setText(getString(R.string.T2_Ans1));
            mButtonBottom.setText(getString(R.string.T2_Ans2));
            mStoryTextView.setText(getString(R.string.T2_Story));


        } else if (mStoryIndex == 3) {
            mButtonTop.setText(getString(R.string.T3_Ans1));
            mButtonBottom.setText(getString(R.string.T3_Ans2));
            mStoryTextView.setText(getString(R.string.T3_Story));


        } else if (mStoryIndex == 4) {
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
            mStoryTextView.setText(getString(R.string.T4_End));

        } else if (mStoryIndex == 5) {
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
            mStoryTextView.setText(getString(R.string.T5_End));

        } else if (mStoryIndex == 6) {
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
            mStoryTextView.setText(getString(R.string.T6_End));


        }

    }

}






