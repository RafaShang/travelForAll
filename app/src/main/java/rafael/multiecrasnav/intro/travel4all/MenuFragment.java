package rafael.multiecrasnav.intro.travel4all;


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
public class MenuFragment extends Fragment {


    public MenuFragment() {
        // Required empty public constructor
    }

    private Button btnFavorites;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_menu, container, false);

        btnFavorites = (Button) view.findViewById(R.id.buttonFavorites);
        btnFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment favoritesFragment = new FavoritesFragment();
                FragmentTransaction transaction1=getFragmentManager().beginTransaction();
                transaction1.replace(R.id.fragment_container,favoritesFragment);
                transaction1.commit();
            }
        });

        return view;


    }

}
