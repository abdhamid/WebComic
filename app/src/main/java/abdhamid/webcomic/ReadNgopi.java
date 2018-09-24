package abdhamid.webcomic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import Adapter.ListAdapter;
import Model.ListImage;

public class ReadNgopi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        ArrayList<ListImage> listImages = new ArrayList<ListImage>();
        listImages.add(new ListImage(R.drawable.ny_1_1));
        listImages.add(new ListImage(R.drawable.ny_1_2));
        listImages.add(new ListImage(R.drawable.ny_1_3));
        listImages.add(new ListImage(R.drawable.ny_1_4));
        listImages.add(new ListImage(R.drawable.ny_1_5));
        listImages.add(new ListImage(R.drawable.ny_1_6));
        listImages.add(new ListImage(R.drawable.ny_1_7));
        listImages.add(new ListImage(R.drawable.ny_1_8));
        listImages.add(new ListImage(R.drawable.ny_1_9));
        listImages.add(new ListImage(R.drawable.ny_1_10));
        listImages.add(new ListImage(R.drawable.ny_1_11));
        listImages.add(new ListImage(R.drawable.ny_1_12));
        listImages.add(new ListImage(R.drawable.ny_1_13));
        listImages.add(new ListImage(R.drawable.ny_1_14));

        ListAdapter adapter = new ListAdapter(this, listImages);
        ListView listView = (ListView) findViewById(R.id.list_image);
        listView.setAdapter(adapter);
    }
}
