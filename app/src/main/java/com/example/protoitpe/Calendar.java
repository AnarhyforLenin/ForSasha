package com.example.protoitpe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidListener;

import java.util.Date;
import java.util.HashMap;

public class Calendar extends AppCompatActivity implements View.OnClickListener{

    DatePicker datePicker;
    int imageChoice = 1;
    ImageButton btn1, btn2, btn3, btn4, btn5;
    Button buttin;
    CaldroidFragment caldroidFragment = new CaldroidFragment();
    Bundle args = new Bundle();

    public void setBackgroundDrawableForDates(HashMap<Date, Drawable> backgroundForDateMap) {
        /*findViewById(R.id.button3).setOnClickListener(v->{
            ColorDrawable green = new ColorDrawable(Color.GREEN);
            caldroidFragment.setBackgroundDrawableForDate(green, greenDate);


        });*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        CaldroidFragment caldroidFragment = new CaldroidFragment();
        Bundle args = new Bundle();
        java.util.Calendar cal = java.util.Calendar.getInstance();
        args.putInt(CaldroidFragment.MONTH, cal.get(java.util.Calendar.MONTH) + 1);
        args.putInt(CaldroidFragment.YEAR, cal.get(java.util.Calendar.YEAR));
        caldroidFragment.setArguments(args);

        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(R.id.ConstraintLayout, caldroidFragment);
        t.commit();

        //открыли фрагмент

        btn1 = findViewById(R.id.happy);
        btn2 = findViewById(R.id.sad);
        btn3 = findViewById(R.id.ney);
        btn4 = findViewById(R.id.angry);
        btn5 = findViewById(R.id.scary);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        final CaldroidListener listener = new CaldroidListener() {

            @Override
            public void onSelectDate(Date date, View view) {
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch(imageChoice) {
                            case 1:
                                caldroidFragment.setBackgroundDrawableForDate(getResources().getDrawable(R.drawable.one), date);
                                break;
                            case 2:
                                caldroidFragment.setBackgroundDrawableForDate(getResources().getDrawable(R.drawable.sad), date);
                                break;
                            case 3:
                                caldroidFragment.setBackgroundDrawableForDate(getResources().getDrawable(R.drawable.ney), date);
                                break;
                            case 4:
                                caldroidFragment.setBackgroundDrawableForDate(getResources().getDrawable(R.drawable.angry), date);
                                break;
                            case 5:
                                caldroidFragment.setBackgroundDrawableForDate(getResources().getDrawable(R.drawable.five), date);
                                break;
                        }

                        caldroidFragment.refreshView();
                    }
                });
            }

            @Override
            public void onCaldroidViewCreated() {
                // Supply your own adapter to weekdayGridView (SUN, MON, etc)

                Button leftButton = caldroidFragment.getLeftArrowButton();
                Button rightButton = caldroidFragment.getRightArrowButton();
                TextView textView = caldroidFragment.getMonthTitleTextView();


                // Do customization here
            }

        };

        caldroidFragment.setCaldroidListener(listener);
        //buttin = (Button) findViewById(R.id.button3);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.happy:
                imageChoice = 1;
                break;
            case R.id.sad:
                imageChoice=2;
                break;
            case R.id.ney:
                imageChoice=3;
                break;
            case R.id.angry:
                imageChoice=4;
                break;
            case R.id.scary:
                imageChoice=5;
                break;
        }
    }
}