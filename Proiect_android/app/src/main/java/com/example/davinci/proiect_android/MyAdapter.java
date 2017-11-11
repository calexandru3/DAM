package com.example.davinci.proiect_android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by davinci on 11/11/17.
 */

public class MyAdapter extends ArrayAdapter<String> {

    ArrayList<Domain> list;
    Context mContext;

    public MyAdapter(@NonNull Context context, ArrayList<Domain> _list) {
        super(context, R.layout.macheta);

        this.list = _list;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater mInfalter = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInfalter.inflate(R.layout.macheta, parent, false);
            mViewHolder.image = (ImageView) convertView.findViewById(R.id.image);
            mViewHolder.title = (TextView) convertView.findViewById(R.id.m_title);
            mViewHolder.description = (TextView) convertView.findViewById(R.id.m_description);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
            mViewHolder.image.setImageResource(list.get(position).getImage());
            mViewHolder.title.setText(list.get(position).getTitle());
            mViewHolder.description.setText(list.get(position).getDescription());

        return convertView;
    }

    static class ViewHolder{
        ImageView image;
        TextView title;
        TextView description;

    }
}
