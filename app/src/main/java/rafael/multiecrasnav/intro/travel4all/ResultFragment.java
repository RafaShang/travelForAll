package rafael.multiecrasnav.intro.travel4all;


        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentTransaction;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.ImageButton;


public class ResultFragment extends Fragment {


    public ResultFragment() {
        // Required empty public constructor
    }

    private ImageButton btnSearch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_result, container, false);

        btnSearch = (ImageButton) view.findViewById(R.id.buttonAlterSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment noStationFragment = new NoStationFragment();
                FragmentTransaction transactionAlterSearch = getFragmentManager().beginTransaction();
                transactionAlterSearch.replace(R.id.fragment_container,noStationFragment);
                transactionAlterSearch.commit();
            }
        });

        return view;

    }

}
