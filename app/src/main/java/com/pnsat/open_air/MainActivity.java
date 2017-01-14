package com.pnsat.open_air;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //ประกาศตัวแปร
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btncom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //blind widget
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btncom = (Button) findViewById(R.id.btncom);


        //botton controler
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();
                //show web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://192.168.1.99/1234/6/?18&"));
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://192.168.1.99/1234/6/?17&"));
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("http://192.168.1.99/1234/6/?17&"));
                startActivity(intent);
                startActivity(intent1);
                startActivity(intent2);
                finish();
            }//onclick

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effict
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();
                //show web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://192.168.1.99/1234/6/?08&"));
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://192.168.1.99/1234/6/?07&"));
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("http://192.168.1.99/1234/6/?07&"));
                startActivity(intent);
                startActivity(intent1);
                startActivity(intent2);
                finish();
            }//onclick

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effict
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();
                //show web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://192.168.1.99/1234/6/?17&"));
                startActivity(intent);
                
            }


        });
        btncom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effict
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();
                //show web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://192.168.1.99/1234/6/?07&"));
                startActivity(intent);
                       }


        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //sound effict
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();
                //show web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ubc1533.dyndns.info:99/1234/6/?18&"));
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ubc1533.dyndns.info:99/1234/6/?17&"));
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://ubc1533.dyndns.info:99/1234/6/?17&"));
                startActivity(intent);
                startActivity(intent1);
                startActivity(intent2);
            }
         });

                btn5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        //sound effect
                        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                        mediaPlayer.start();
                        //show web view
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://ubc1533.dyndns.info:99/1234/6/?08&"));
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://ubc1533.dyndns.info:99/1234/6/?07&"));
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://ubc1533.dyndns.info:99/1234/6/?07&"));
                        startActivity(intent);
                        startActivity(intent1);
                        startActivity(intent2);
                    }

                });


    }
}

