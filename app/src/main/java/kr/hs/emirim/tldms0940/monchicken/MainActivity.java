package kr.hs.emirim.tldms0940.monchicken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);
    }
    protected void onResume(){
        super.onResume();
        mName.setText("");
    }
    mName.setTest("")
}
