package cn.edu.swufe.homework3_1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Homework3_1 extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3_1);

        Button  button1_1 = findViewById(R.id.button1_1);
        button1_1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText1);
                String str = editText.getText().toString();
                int F;
                F= Integer.valueOf(str)+3;
                editText.setText(F+"");
            }
        })
        ;
        Button  button1_2 = findViewById(R.id.button1_2);
        button1_2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText1_2 = findViewById(R.id.editText1_2);
                String str = editText1_2.getText().toString();
                int F;
                F= Integer.valueOf(str)+3;
                editText1_2.setText(F+"");
            }
        })
        ;
        Button  button2_1 = findViewById(R.id.button2_1);
        button2_1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText1 = findViewById(R.id.editText1);
                String str = editText1.getText().toString();
                int F;
                F= Integer.valueOf(str)+2;
                editText1.setText(F+"");
            }
        })
        ;
        Button  button2_2 = findViewById(R.id.button2_2);
        button2_2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText2 = findViewById(R.id.editText1_2);
                String str = editText2.getText().toString();
                int F;
                F= Integer.valueOf(str)+2;
                editText2.setText(F+"");
            }
        })
        ;
        Button  button3_1 = findViewById(R.id.button3_1);
        button3_1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText1);
                String str = editText.getText().toString();
                int F;
                F= Integer.valueOf(str)+1;
                editText.setText(F+"");
            }
        })
        ;
        Button  button3_2 = findViewById(R.id.button3_2);
        button3_2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText1_2);
                String str = editText.getText().toString();
                int F;
                F= Integer.valueOf(str)+1;
                editText.setText(F+"");
            }
        })
        ;
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText1 = findViewById(R.id.editText1);
                editText1.setText("0");
                EditText editText2 = findViewById(R.id.editText1_2);
                editText2.setText("0");
            }
        })
        ;

    }
    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String scorea = ((TextView)findViewById(R.id.editText1)).getText().toString();
        String scoreb = ((TextView)findViewById(R.id.editText1_2)).getText().toString();

        Log.i("gulu","onSaveInstanceState");
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");
        Log.i("gulu","onRestoreInstanceState");
        ((TextView)findViewById(R.id.editText1)).setText(scorea);
        ((TextView)findViewById(R.id.editText1_2)).setText(scoreb);
    }
}

