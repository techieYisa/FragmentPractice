package fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.fragmentsinclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener{

    private View rootView;
    private Button button1, button2, button3, button4, button5;
    private EditText editText;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         rootView = inflater.inflate(R.layout.fragment_main, container, false);
        button1 = rootView.findViewById(R.id.button1);
        button2 = rootView.findViewById(R.id.button2);
        button3 = rootView.findViewById(R.id.button3);
        button4 = rootView.findViewById(R.id.button4);
        button5 = rootView.findViewById(R.id.button5);

        editText = rootView.findViewById(R.id.fragment_edittext);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
         return rootView;




    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                String buttonId = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("string", buttonId);
                inflateButtonFragment(bundle);
                break;

            case R.id.button2:
                String buttonId2 = editText.getText().toString();
                Bundle bundle2 = new Bundle();
                bundle2.putString("string", buttonId2);
                inflateButtonFragment(bundle2);
                break;

            case R.id.button3:
                String buttonId3 = editText.getText().toString();
                Bundle bundle3 = new Bundle();
                bundle3.putString("string", buttonId3);
                inflateButtonFragment(bundle3);
                break;

            case R.id.button4:
                String buttonId4 = editText.getText().toString();
                Bundle bundle4 = new Bundle();
                bundle4.putString("string", buttonId4);
                inflateButtonFragment(bundle4);
                break;

            case R.id.button5:
                String buttonId5 = editText.getText().toString();
                Bundle bundle5 = new Bundle();
                bundle5.putString("string", buttonId5);
                inflateButtonFragment(bundle5);
                break;
        }

    }

    private void inflateButtonFragment(Bundle bundle) {
        ButtonFragment buttonFragment = new ButtonFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        buttonFragment.setArguments(bundle);
        fragmentTransaction.addToBackStack(null).replace(R.id.main_container, buttonFragment);
        fragmentTransaction.commit();
    }
}
