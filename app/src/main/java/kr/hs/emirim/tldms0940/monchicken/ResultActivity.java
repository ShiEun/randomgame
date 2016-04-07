package kr.hs.emirim.tldms0940.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

import java.util.Random;

/**
 * Created by appcreator32 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {


    static String TAG = "오늘의치킨:ResultActivity";
    TextView mResult;
    ImageView mImageView;

    //int[] images = new int[] {R.drawable.fried01, R.drawable.fried02, R.drawable.fried03, R.drawable.fried04, R.drawable.fried05,R.drawable.fried06};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult = (TextView) findViewById(R.id.result);
        Log.d(TAG, "텍스트뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(6);
        Log.d(TAG, "랜덤값 생성! : "+result);
        mImageView = (ImageView)findViewById(R.id.image);
        //mImageView.setBackgroundResource(images[result]);

        mImageView.setImageResource(R.drawable.fried01+result);

        /*switch(result)
        {
            case 0:
                mImageView.setImageResource(R.drawable.fried01);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.fried02);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.fried03);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.fried04);
                break;
            case 4:
                mImageView.setImageResource(R.drawable.fried05);
                break;
            case 5:
                mImageView.setImageResource(R.drawable.fried06);
                break;
        }*/



        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG, "인텐트값 읽기<name>! : "+name);
        int age = intent.getIntExtra("age",-1);
        Log.d(TAG, "인텐트값 읽기<name>! : "+name);

        mResult.setText(name+"님, 오늘 이 치킨은 어떠신가요?");
    }
}
