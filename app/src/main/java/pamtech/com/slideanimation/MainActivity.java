package pamtech.com.slideanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button btnOpen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpen2 = findViewById(R.id.btn_open_activity_2);

        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(goto2);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
