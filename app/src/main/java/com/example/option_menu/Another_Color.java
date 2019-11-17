package com.example.option_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Hadar Ohana
 * @since 17/11/2019
 */

public class Another_Color extends AppCompatActivity {

    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another__color);
        ll = findViewById(R.id.ll);
    }

    /**
     * @since 17/11/2019
     *  The method brings you back to the last activity
     */
    public void Back(View view) {
        finish();
    }

    /**
     * @since 17/11/2019
     * @return the method create an global option menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add("Gray");
        return true;
    }

    /**
     * @since 17/11/2019
     * @return The method checking which color the user picked and put it in the background
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.Red){
            ll.setBackgroundColor(Color.RED);
        }
        else if(id==R.id.Blue){
            ll.setBackgroundColor(Color.BLUE);
        }
        else if (id==R.id.Green){
            ll.setBackgroundColor(Color.GREEN);
        }
        else{
            ll.setBackgroundColor(Color.GRAY);

        }

        return true;
    }
}
