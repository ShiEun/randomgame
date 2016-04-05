package kr.hs.emirim.tldms0940.monchicken;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

/**
 * Created by appcreator32 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    TextView mResult;

    int[] images = new int[] {R.drawable.fried01, R.drawable.fried02, R.drawable.fried03, R.drawable.fried04, R.drawable.fried05,R.drawable.fried06};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult = (TextView) findViewById(R.id.result);
        mResult.setText("결과");

        ImageView mImageView = (ImageView)findViewById(R.id.image);
        int imageId = (int) (Math.random() * images.length);
        mImageView.setBackgroundResource(images[imageId]);
    }

}
