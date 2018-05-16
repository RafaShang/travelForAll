package rafael.multiecrasnav.intro.travel4all;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    private Button btnClickYes;
    private Button btnClickNo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view=inflater.inflate(R.layout.fragment_first, container, false);

        btnClickYes = (Button) view.findViewById(R.id.buttonYes);
        btnClickYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment stationFragment = new StationFragment();
                FragmentTransaction transaction1=getFragmentManager().beginTransaction();
                transaction1.replace(R.id.fragment_container,stationFragment);
                transaction1.commit();
            }
        });

        btnClickNo = (Button) view.findViewById(R.id.buttonNo);
        btnClickNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment noStationFragment = new NoStationFragment();
                FragmentTransaction transaction2=getFragmentManager().beginTransaction();
                transaction2.replace(R.id.fragment_container,noStationFragment);
                transaction2.commit();
            }
        });

        return view;
    }



}

