package la.nuol.fe.ceit.samsung.sample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import la.nuol.fe.ceit.samsung.sample.fragment.FragmentOne;
import la.nuol.fe.ceit.samsung.sample.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {
    Fragment fragment = null;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                fragment = new FragmentOne();
                loadFragment(fragment);
                break;
            case R.id.button2:
                fragment = new FragmentTwo();
                loadFragment(fragment);
                break;
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment, fragment);
        transaction.commit();
    }
}
