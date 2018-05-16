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


/**
 * A simple {@link Fragment} subclass.
 */
public class StationFragment extends Fragment {


    public StationFragment() {
        // Required empty public constructor
    }


    private Button btnUrl;

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

        return view;
    }

}
