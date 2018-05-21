package rafael.multiecrasnav.intro.travel4all;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;


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

        listView = (ExpandableListView)findViewById(R.id.expendableList);





        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        setTitle("Fragment Search");
        FirstFragment firstFragment = new FirstFragment();
        android.support.v4.app.FragmentManager manager1 = getSupportFragmentManager();
        manager1.beginTransaction().replace(R.id.fragment_container, firstFragment, firstFragment.getTag()).commit();

        BottomNavigationViewHelper.removeShiftMode(navigation);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}
