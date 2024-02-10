package com.example.gridviewbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class GridvVew_BaseAdapter extends BaseAdapter {
    Context context;
    int[] images;
    LayoutInflater inflater;

    public GridvVew_BaseAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
        inflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.show_images,null);
        ImageView imageView = convertView.findViewById(R.id.myimages);
        imageView.setImageResource(images[position]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "image no "+(position+1), Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
