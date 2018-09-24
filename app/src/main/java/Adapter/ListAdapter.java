package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import Model.ListImage;
import abdhamid.webcomic.R;

public class ListAdapter extends ArrayAdapter<ListImage> {

    public ListAdapter (Context context, ArrayList<ListImage> listImages) {
        super(context, 0, listImages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listImageView = convertView;
        if (listImageView == null){
            listImageView = LayoutInflater.from(getContext()).inflate(R.layout.list_images, parent, false);
        }

        ListImage currentImage = getItem(position);

        ImageView readView = (ImageView) listImageView.findViewById(R.id.read_img);
        readView.setImageResource(currentImage.getImageResourceId());

        return listImageView;
    }
}
