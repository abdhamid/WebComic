package abdhamid.webcomic;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Adapter.RecyclerAdapter;
import Model.ListComic;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListComic> listComics;

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public static class HomeFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_home,container,false);

            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerComic);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new GridLayoutManager( getActivity(),3));

            List<ListComic> listComics = new ArrayList<>();

            listComics.add(new ListComic("Tahilalats", R.drawable.tl_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("The Gamer", R.drawable.tg_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Pak Guru Inyong", R.drawable.pi_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Komik Faktap", R.drawable.kf_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Ghosty's Comic", R.drawable.gc_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Ngopi, yuk!", R.drawable.ny_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Gloomy Sunday", R.drawable.gs_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Star Wars", R.drawable.sw_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Tales of Unusual", R.drawable.tu_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Pasutri Gaje", R.drawable.pg_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Eggnoid", R.drawable.en_thumb, ListComic.ListType.ONE_ITEM));
            listComics.add(new ListComic("Noblesse", R.drawable.nb_thumb, ListComic.ListType.ONE_ITEM));

            RecyclerView.Adapter adapter = new RecyclerAdapter(getActivity(), listComics);
            recyclerView.setAdapter(adapter);

            return view;
        }
    }

    public static class FavoritesFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_favorites,container,false);

            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.favorite_comic);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));

            List<ListComic> listComics = new ArrayList<>();

            listComics.add(new ListComic("Tahilalats", R.drawable.tl_thumb, ListComic.ListType.TWO_ITEM));
            listComics.add(new ListComic("The Gamer", R.drawable.tg_thumb, ListComic.ListType.TWO_ITEM));
            listComics.add(new ListComic("Pak Guru Inyong", R.drawable.pi_thumb, ListComic.ListType.TWO_ITEM));
            listComics.add(new ListComic("Komik Faktap", R.drawable.kf_thumb, ListComic.ListType.TWO_ITEM));

            RecyclerView.Adapter adapter = new RecyclerAdapter(getActivity(), listComics);
            recyclerView.setAdapter(adapter);

            return view;
        }
    }

    public static class AboutFragment extends Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_about,container,false);
            return view;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.about:
                fragment = new AboutFragment();
                break;
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.favorites:
                fragment = new FavoritesFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
