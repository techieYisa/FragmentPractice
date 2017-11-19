package fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import nyc.c4q.fragmentsinclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    private View rootView;

    private TextView textView;

    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_buttons, container, false);
        textView = rootView.findViewById(R.id.button_textview);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        String stringFromBundle = bundle.getString("string");
        textView.setText(stringFromBundle);

    }
}
