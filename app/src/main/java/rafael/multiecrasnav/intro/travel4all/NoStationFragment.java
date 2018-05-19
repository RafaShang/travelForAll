package rafael.multiecrasnav.intro.travel4all;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoStationFragment extends Fragment {


    public NoStationFragment() {
        // Required empty public constructor
    }

    private EditText txtOrigin;
    private EditText txtDestiny;

    public String messageOrigin;
    public String messageDestiny;

    private ImageButton imSwap;

    private Button btnSearch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_no_station, container, false);
        final View view2 = inflater.inflate(R.layout.activity_main, container, false);
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
                messageOrigin = txtOrigin.getText().toString();
                messageDestiny = txtOrigin.getText().toString();
                if(messageOrigin.isEmpty() || messageDestiny.isEmpty()){

                    Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "Preencha os campos Origem e Destino",
                            Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });

                    snackbar.show();

                } else{
                    Fragment resultFragment = new ResultFragment();
                    FragmentTransaction transaction3=getFragmentManager().beginTransaction();
                    transaction3.replace(R.id.fragment_container,resultFragment);
                    transaction3.commit();

                }



            }
        });



        return view;
    }

}
