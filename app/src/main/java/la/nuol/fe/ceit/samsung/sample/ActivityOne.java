package la.nuol.fe.ceit.samsung.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityOne extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "la.nuol.fe.ceit.samsung.sample.extra.MESSAGE";
    private EditText editText;
    Button button;
//    private static final String LOG_TAG = ActivityOne.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editTextOne);

    }
    public void launchSecondActivity(View view){
        String message = editText.getText().toString();
//        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, ActivityTwo.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
