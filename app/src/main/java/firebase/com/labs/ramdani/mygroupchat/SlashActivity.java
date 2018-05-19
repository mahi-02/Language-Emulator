package firebase.com.labs.ramdani.mygroupchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SlashActivity extends AppCompatActivity {

    private Intent myintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slash);


                myintent = new Intent(this, RegisterActivity.class);
                splashScreen(3000); }

            public void splashScreen (final int x)
            {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        finally{ startActivity(myintent);
                            finish();}
                    }
                }).start();
            }

        }



