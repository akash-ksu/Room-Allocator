package com.mycompany.roomallocator;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;


public class RoomSelectionActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_selection);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_room_selection);
        int numOfRooms = getIntent().getExtras().getInt("numOfRooms");
        final EditText[] roomMateTextArray = new EditText[numOfRooms];
        for(int i=0; i<numOfRooms;i++){
            roomMateTextArray[i] = new EditText(this);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            roomMateTextArray[i].setId(i);
            roomMateTextArray[i].setLayoutParams(layoutParams);
            linearLayout.addView(roomMateTextArray[i]);
        }
        Button generateButton = new Button(this);
        generateButton.setText("Generate");
        linearLayout.addView(generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random num = new Random();
                
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_room_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
