package com.example.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;

public class CalcActivity extends AppCompatActivity {
    EditText etnumber1,etnumber2,etresult;
    ImageView iv;
    Switch aSwitch;
    SeekBar sbsong;
    public void playSong(View v)
    {
        sbsong.setProgress(sbsong.getProgress()+10);
    }
    public void showCar(View v)
    {
        iv.setImageResource(R.drawable.burger);
    }
    public void add(View v)
    {
        etresult.setText(etnumber1.getText().toString()+etnumber2.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        etnumber1=findViewById(R.id.etnumber1);
        etnumber2=findViewById(R.id.etnumber2);
        etresult=findViewById(R.id.etresult);
        sbsong=findViewById(R.id.seekBar);
        iv=findViewById(R.id.imageView);
        aSwitch=findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    iv.setImageResource(R.drawable.burger);
                else
                    iv.setImageResource(R.drawable.bear);
            }
        });
    }
}
