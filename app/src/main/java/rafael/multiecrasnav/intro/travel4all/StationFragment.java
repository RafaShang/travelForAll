package rafael.multiecrasnav.intro.travel4all;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class StationFragment extends Fragment {


    public StationFragment() {
        // Required empty public constructor
    }


    private Button btnUrl;
    private Button btnSearch;
    private EditText txtDestiny;

    public String messageDestiny;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_station, container, false);

        btnUrl = (Button) view.findViewById(R.id.buttonUrl);
        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.cp.pt/StaticFiles/Passageiros/horarios/horarios/PDF/r_ir_uc/porto_valenca.pdf"));
                startActivity(intent);
            }
        });

        btnSearch = (Button) view.findViewById(R.id.buttonSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Fragment resultFragment = new ResultFragment();
                FragmentTransaction transaction4=getFragmentManager().beginTransaction();
                transaction4.replace(R.id.fragment_container,resultFragment);
                transaction4.commit();
            }
        });

        return view;
    }

}
