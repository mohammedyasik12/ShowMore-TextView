package com.yasikuiux.readmoretextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.yasikuiux.showmoretextview.ShowMoreTextView;

public class MainActivity extends AppCompatActivity {
    private ShowMoreTextView txtshowmore;
    private String addtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //REMOVE STATUSBAR

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //REMOVE TOOLBAR

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}



        setContentView(R.layout.activity_main);


        //ShomoreTextView

        addtext="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

        txtshowmore=(ShowMoreTextView)findViewById(R.id.showmore_text);
        txtshowmore.setText(addtext);
        txtshowmore.setShowingLine(4);
        txtshowmore.addShowMoreText("Readmore");
        txtshowmore.addShowLessText("Less");
        txtshowmore.setShowMoreColor(Color.parseColor("#FF3700B3")); // or other color
        txtshowmore.setShowLessTextColor(Color.parseColor("#FF939393"));


    }
}