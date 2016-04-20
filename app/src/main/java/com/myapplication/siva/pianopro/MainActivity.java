package com.myapplication.siva.pianopro;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private MediaPlayer mp;
    private GestureDetector mGestureDetector;
    int resId;
  //  int resId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button cKey  = (Button) findViewById(R.id.cKey);
        Button dKey  = (Button) findViewById(R.id.dKey);
        Button eKey  = (Button) findViewById(R.id.eKey);
        Button fKey  = (Button) findViewById(R.id.fKey);
        Button gKey  = (Button) findViewById(R.id.gKey);
        Button aKey  = (Button) findViewById(R.id.aKey);
        Button bKey  = (Button) findViewById(R.id.bKey);
        Button ccKey = (Button) findViewById(R.id.ccKey);


        cKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    resId = R.raw.c1;
                    if (mp != null) {
                        mp.release();
                    }
                    mp = MediaPlayer.create(MainActivity.this, resId);
                    mp.start();
                }

                else if (event.getAction() == MotionEvent.ACTION_UP) {

                }
            return true;
            }
          }
        );
        dKey.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                                            resId = R.raw.d1;
                                            if (mp != null) {
                                                mp.release();
                                            }
                                            mp = MediaPlayer.create(MainActivity.this, resId);
                                            mp.start();
                                        }

                                        else if (event.getAction() == MotionEvent.ACTION_UP) {

                                        }
                                        return true;
                                    }
                                }
        );

        eKey.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                                            resId = R.raw.e1;
                                            if (mp != null) {
                                                mp.release();
                                            }
                                            mp = MediaPlayer.create(MainActivity.this, resId);
                                            mp.start();
                                        }

                                        else if (event.getAction() == MotionEvent.ACTION_UP) {

                                        }
                                        return true;
                                    }
                                }
        );
        fKey.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                                            resId = R.raw.f1;
                                            if (mp != null) {
                                                mp.release();
                                            }
                                            mp = MediaPlayer.create(MainActivity.this, resId);
                                            mp.start();
                                        }

                                        else if (event.getAction() == MotionEvent.ACTION_UP) {

                                        }
                                        return true;
                                    }
                                }
        );
        gKey.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                                            resId = R.raw.g1;
                                            if (mp != null) {
                                                mp.release();
                                            }
                                            mp = MediaPlayer.create(MainActivity.this, resId);
                                            mp.start();
                                        }

                                        else if (event.getAction() == MotionEvent.ACTION_UP) {

                                        }
                                        return true;
                                    }
                                }
        );
        aKey.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                                            resId = R.raw.a1;
                                            if (mp != null) {
                                                mp.release();
                                            }
                                            mp = MediaPlayer.create(MainActivity.this, resId);
                                            mp.start();
                                        }

                                        else if (event.getAction() == MotionEvent.ACTION_UP) {

                                        }
                                        return true;
                                    }
                                }
        );
        bKey.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        if(event.getAction() == MotionEvent.ACTION_DOWN) {
                                            resId = R.raw.b1;
                                            if (mp != null) {
                                                mp.release();
                                            }
                                            mp = MediaPlayer.create(MainActivity.this, resId);
                                            mp.start();
                                        }

                                        else if (event.getAction() == MotionEvent.ACTION_UP) {

                                        }
                                        return true;
                                    }
                                }
        );
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        if(null!=mp){
            mp.release();
        }
        super.onDestroy();
    }
}
