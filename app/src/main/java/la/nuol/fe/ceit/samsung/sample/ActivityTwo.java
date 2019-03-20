package la.nuol.fe.ceit.samsung.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button = (Button) findViewById(R.id.button);
        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivityOne.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void goToActivityOne(View view){
        Intent intent = new Intent(ActivityTwo.this, ActivityOne.class);
        startActivity(intent);
    }
}
