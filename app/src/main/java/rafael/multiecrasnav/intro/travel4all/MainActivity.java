package rafael.multiecrasnav.intro.travel4all;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            switch (item.getItemId()) {
                case R.id.navigation_search:

                    setTitle("Fragment Search");
                    FirstFragment firstFragment = new FirstFragment();
                    android.support.v4.app.FragmentManager manager1 = getSupportFragmentManager();
                    manager1.beginTransaction().replace(R.id.fragment_container, firstFragment, firstFragment.getTag()).commit();

                    return true;
                case R.id.navigation_history:


                    setTitle("Fragment History");
                    HistoryFragment historyFragment = new HistoryFragment();
                    android.support.v4.app.FragmentManager manager2 = getSupportFragmentManager();
                    manager2.beginTransaction().replace(R.id.fragment_container, historyFragment, historyFragment.getTag()).commit();
                    return true;
                case R.id.navigation_map:
                    //mTextMessage.setText(R.string.title_map);
                    setTitle("Fragment Map");
                    MapFragment mapFragment = new MapFragment();
                    android.support.v4.app.FragmentManager manager3 = getSupportFragmentManager();
                    manager3.beginTransaction().replace(R.id.fragment_container, mapFragment, mapFragment.getTag()).commit();
                    return true;
                case R.id.navigation_menu:
                    //mTextMessage.setText(R.string.title_menu);

                    setTitle("Fragment Menu");
                    MenuFragment menuFragment = new MenuFragment();
                    android.support.v4.app.FragmentManager manager4 = getSupportFragmentManager();
                    manager4.beginTransaction().replace(R.id.fragment_container, menuFragment, menuFragment.getTag()).commit();

                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        setTitle("Fragment Search");
        FirstFragment firstFragment = new FirstFragment();
        android.support.v4.app.FragmentManager manager1 = getSupportFragmentManager();
        manager1.beginTransaction().replace(R.id.fragment_container, firstFragment, firstFragment.getTag()).commit();

    }


}
