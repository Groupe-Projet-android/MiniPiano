package com.medi.pianos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound_a,sound_b,sound_c,sound_d,sound_e,sound_f,sound_g,sound_h,sound_i,sound_j,sound_k,sound_l,sound_m,sound_n,sound_o,sound_p,sound_q;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound_a = soundPool.load(this,R.raw.a,1);
        sound_b = soundPool.load(this,R.raw.b,1);
        sound_c = soundPool.load(this,R.raw.c,1);
        sound_d = soundPool.load(this,R.raw.d,1);
        sound_e = soundPool.load(this,R.raw.e,1);
        sound_f = soundPool.load(this,R.raw.f,1);
        sound_g = soundPool.load(this,R.raw.g,1);
        sound_h = soundPool.load(this,R.raw.h,1);
        sound_i = soundPool.load(this,R.raw.i,1);
        sound_j = soundPool.load(this,R.raw.j,1);
        sound_k = soundPool.load(this,R.raw.k,1);
        sound_l = soundPool.load(this,R.raw.l,1);
        sound_n = soundPool.load(this,R.raw.n,1);
        sound_m = soundPool.load(this,R.raw.m,1);
        sound_o = soundPool.load(this,R.raw.o,1);
        sound_p = soundPool.load(this,R.raw.p,1);
        sound_q = soundPool.load(this,R.raw.q,1);

    }

    public void click(View view) {

        switch (view.getId()){

            case R.id.a:

                soundPool.play(sound_a,1,1,0,0,1);

                break;
            case R.id.b:

                soundPool.play(sound_b,1,1,0,0,1);

                break;

            case R.id.c:

                soundPool.play(sound_c,1,1,0,0,1);

                break;
            case R.id.d:

                soundPool.play(sound_d,1,1,0,0,1);

                break;

            case R.id.e:

                soundPool.play(sound_e,1,1,0,0,1);

                break;
            case R.id.f:

                soundPool.play(sound_f,1,1,0,0,1);

                break;

            case R.id.g:

                soundPool.play(sound_g,1,1,0,0,1);

                break;
            case R.id.h:

                soundPool.play(sound_h,1,1,0,0,1);

                break;

            case R.id.i:

                soundPool.play(sound_i,1,1,0,0,1);

                break;
            case R.id.j:

                soundPool.play(sound_j,1,1,0,0,1);

                break;

            case R.id.k:

                soundPool.play(sound_k,1,1,0,0,1);

                break;
            case R.id.l:

                soundPool.play(sound_l,1,1,0,0,1);

                break;

            case R.id.m:

                soundPool.play(sound_m,1,1,0,0,1);

                break;
            case R.id.n:

                soundPool.play(sound_n,1,1,0,0,1);

                break;

            case R.id.o:

                soundPool.play(sound_o,1,1,0,0,1);

                break;
            case R.id.p:

                soundPool.play(sound_p,1,1,0,0,1);

                break;
            case R.id.q:

                soundPool.play(sound_q,1,1,0,0,1);

                break;


        }

    }
}
