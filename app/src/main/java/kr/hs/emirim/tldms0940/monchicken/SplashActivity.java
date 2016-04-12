package kr.hs.emirim.tldms0940.monchicken;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    //ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,R.anim.zoom_exit);
                finish();//현재 액티비티의 생애를 마감......ㄸㄹㄹㄹ
            }
        },3000);//밀리세컨드 단위(1초 : 1000)

        //mImageView=(ImageView)findViewById(R.id.image);
        //mImageView.setImageResource(R.drawable.app01);
    }
}
