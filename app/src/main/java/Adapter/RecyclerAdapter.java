package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import Model.ListComic;
import abdhamid.webcomic.FaktapActivity;
import abdhamid.webcomic.GhostyActivity;
import abdhamid.webcomic.NgopiActivity;
import abdhamid.webcomic.PakInyongActivity;
import abdhamid.webcomic.R;
import abdhamid.webcomic.TahilalatsActivity;
import abdhamid.webcomic.TheGamerActivity;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_ONE = 1;
    private static final int TYPE_TWO = 2;
    private static Context context;
    private static List<ListComic> listComics;

    public RecyclerAdapter(Context context, List listComics){
        this.context = context;
        this.listComics = listComics;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ONE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_comic, parent, false);
            return new ViewHolderOne(view);
        } else if (viewType == TYPE_TWO) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_comic_2, parent, false);
            return new ViewHolderTwo(view);
        } else {
            throw new RuntimeException("The type has to be ONE or TWO");
        }
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.list_comic, parent, false);
    }

    @Override
    public int getItemViewType(int position) {
        ListComic item = listComics.get(position);
        if (item.getType() == ListComic.ListType.ONE_ITEM) {
            return TYPE_ONE;
        } else if (item.getType() == ListComic.ListType.TWO_ITEM) {
            return TYPE_TWO;
        } else {
            return -1;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()){
            case TYPE_ONE:
                initLayoutOne((ViewHolderOne)holder,position);
                break;

            case TYPE_TWO:
                initLayoutTwo((ViewHolderTwo)holder, position);

        }

//        ListComic listComic = listComics.get(position);
//        holder.title.setText(listComic.getTitle());
//        holder.thumb.setImageResource(listComic.getImageResourceId());
    }

    private void initLayoutOne(ViewHolderOne holder, int pos) {
        holder.title.setText(listComics.get(pos).getTitle());
        holder.thumb.setImageResource(listComics.get(pos).getImageResourceId());
    }

    private void initLayoutTwo(ViewHolderTwo holder, int pos) {
        holder.title.setText(listComics.get(pos).getTitle());
        holder.thumb.setImageResource(listComics.get(pos).getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return listComics.size(); //keep track of the size of the items
    }

    static class ViewHolderOne extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView thumb;
        public TextView title;

        public ViewHolderOne(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            thumb = (ImageView) itemView.findViewById(R.id.thumb_comic);
            title = (TextView) itemView.findViewById(R.id.thumb_title);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            ListComic item = listComics.get(position);
            Intent intent = null;

            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, TahilalatsActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    intent = new Intent(context, TheGamerActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    intent = new Intent(context, PakInyongActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    intent = new Intent(context, FaktapActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    intent = new Intent(context, GhostyActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    intent = new Intent(context, NgopiActivity.class);
                    context.startActivity(intent);
                    break;

                default:
                    Toast.makeText(context,"Coming Soon",Toast.LENGTH_SHORT).show();
                    break;
            }
//            context.startActivity(intent);

//            Toast.makeText(context,item.getTitle(), Toast.LENGTH_SHORT).show();
        }
    }

    static class ViewHolderTwo extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView thumb;
        public TextView title;

        public ViewHolderTwo (View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            thumb = (ImageView) itemView.findViewById(R.id.horizontal_thumb);
            title = (TextView) itemView.findViewById(R.id.horizontal_title);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            ListComic item = listComics.get(position);
            Intent intent = null;

            switch (getAdapterPosition()){
                case 0:
                    intent = new Intent(context, TahilalatsActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    intent = new Intent(context, TheGamerActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    intent = new Intent(context, PakInyongActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    intent = new Intent(context, FaktapActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    intent = new Intent(context, GhostyActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    intent = new Intent(context, NgopiActivity.class);
                    context.startActivity(intent);
                    break;

                default:
                    Toast.makeText(context,"Coming Soon",Toast.LENGTH_SHORT).show();
                    break;
            }
//            context.startActivity(intent);

//            Toast.makeText(context,item.getTitle(), Toast.LENGTH_SHORT).show();
        }
    }
}



