package rafael.multiecrasnav.intro.travel4all;


        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentTransaction;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.List;


public class ResultFragment extends Fragment {


    public ResultFragment() {
        // Required empty public constructor
    }

    private ImageButton btnSearch;
    private ListView listView;
    public EditText textOrigin;


    int[] IMAGES = {R.drawable.ic_plane, R.drawable.ic_train, R.drawable.ic_directions_bus_black_24dp,
            R.drawable.ic_destiny, R.drawable.ic_history, R.drawable.ic_keyboard_arrow_right,
            R.drawable.ic_start};

    String[] PRICE = {"700€ - 1500€", "900€ - 1850€" , "1000€ - 1950€" , "1200€ - 2850€" ,
            "250€ - 350€" , "400€ - 850€", "1223€ - 1950€" , "1330€ - 2850€"};

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

        listView = (ListView) view.findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

        return view;

    }

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.listobjects, null);
            ImageView imageView1 = (ImageView) view.findViewById(R.id.imageViewPlane);

            TextView textPrice = (TextView) view.findViewById(R.id.txtPrice);

            imageView1.setImageResource(IMAGES[i]);
            textPrice.setText(PRICE[i]);
            return view;
        }
    }

}
