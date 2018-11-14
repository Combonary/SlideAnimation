package pamtech.com.slideanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private static final String TAG = "Activity2";
    Button btnOpen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnOpen3 = findViewById(R.id.btn_open_activity_3);

        btnOpen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto3 = new Intent(Activity2.this, Activity3.class);
                startActivity(goto3);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
