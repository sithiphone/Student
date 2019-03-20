package la.nuol.fe.ceit.samsung.sample.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import la.nuol.fe.ceit.samsung.sample.R;

public class FragmentTwo extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenttwo, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("Fragment Two");
        return view;
    }
}
