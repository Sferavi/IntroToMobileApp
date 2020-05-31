package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PostListViewAdapter extends BaseAdapter {
    private Context context;
    private List<Post> postList;

    public PostListViewAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }


    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public Object getItem(int position) {
        return postList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return postList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.post_list_view_item,parent, false);
        Post post = postList.get(position);
        TextView itemTitle = convertView.findViewById(R.id.item_title);
        TextView itemBody = convertView.findViewById(R.id.item_body);
        ImageView imageOfChoice = convertView.findViewById(R.id.image_of_choice);

        Picasso.get().load(post.getUrl()).resize(200, 200).into(imageOfChoice);

        itemTitle.setText(post.getTitle());
        itemBody.setText(post.getBody());
        return convertView;
    }
}
