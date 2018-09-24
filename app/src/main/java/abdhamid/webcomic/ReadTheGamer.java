package abdhamid.webcomic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import Adapter.ListAdapter;
import Model.ListImage;

public class ReadTheGamer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        ArrayList<ListImage> listImages = new ArrayList<ListImage>();
        listImages.add(new ListImage(R.drawable.tg_1_1));
        listImages.add(new ListImage(R.drawable.tg_1_2));
        listImages.add(new ListImage(R.drawable.tg_1_3));
        listImages.add(new ListImage(R.drawable.tg_1_4));
        listImages.add(new ListImage(R.drawable.tg_1_5));
        listImages.add(new ListImage(R.drawable.tg_1_6));
        listImages.add(new ListImage(R.drawable.tg_1_7));
        listImages.add(new ListImage(R.drawable.tg_1_8));
        listImages.add(new ListImage(R.drawable.tg_1_9));
        listImages.add(new ListImage(R.drawable.tg_1_10));
        listImages.add(new ListImage(R.drawable.tg_1_11));
        listImages.add(new ListImage(R.drawable.tg_1_12));
        listImages.add(new ListImage(R.drawable.tg_1_13));
        listImages.add(new ListImage(R.drawable.tg_1_14));
        listImages.add(new ListImage(R.drawable.tg_1_15));
        listImages.add(new ListImage(R.drawable.tg_1_16));
        listImages.add(new ListImage(R.drawable.tg_1_17));
        listImages.add(new ListImage(R.drawable.tg_1_18));
        listImages.add(new ListImage(R.drawable.tg_1_19));
        listImages.add(new ListImage(R.drawable.tg_1_20));
        listImages.add(new ListImage(R.drawable.tg_1_21));
        listImages.add(new ListImage(R.drawable.tg_1_22));
        listImages.add(new ListImage(R.drawable.tg_1_23));


        ListAdapter adapter = new ListAdapter(this, listImages);
        ListView listView = (ListView) findViewById(R.id.list_image);
        listView.setAdapter(adapter);
    }
}
