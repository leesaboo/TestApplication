package kr.co.dlghksgml.www.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("하이 에브리원");
        System.out.println("하이 에브리원2");
        System.out.println("하이 에브리원3");
    }
}
