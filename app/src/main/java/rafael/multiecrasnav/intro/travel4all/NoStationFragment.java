package rafael.multiecrasnav.intro.travel4all;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoStationFragment extends Fragment {


    public NoStationFragment() {
        // Required empty public constructor
    }

    private EditText txtOrigin;
    private EditText txtDestiny;

    private ImageButton imSwap;

    private Button btnSearch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_no_station, container, false);

        txtOrigin = (EditText) view.findViewById(R.id.editTextOrigin);
        txtDestiny = (EditText) view.findViewById(R.id.editTextDestiny);




        imSwap = (ImageButton) view.findViewById(R.id.btnSwap);

        imSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = txtOrigin.getText().toString();
                txtOrigin.setText(txtDestiny.getText().toString());
                txtDestiny.setText(temp);
            }
        });

        btnSearch = (Button) view.findViewById(R.id.buttonSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment resultFragment = new ResultFragment();
                FragmentTransaction transaction3=getFragmentManager().beginTransaction();
                transaction3.replace(R.id.fragment_container,resultFragment);
                transaction3.commit();
            }
        });


        return view;
    }

}
