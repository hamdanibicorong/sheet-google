package ga.danytux.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();

                }finally {
                    Intent intent = new Intent(SplasActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
