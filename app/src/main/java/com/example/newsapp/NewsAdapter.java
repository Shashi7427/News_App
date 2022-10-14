package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context, List<News> list) {
        super(context, 0,list);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_item,parent,false);
        }
        TextView title = listItemView.findViewById(R.id.title);
        TextView section = listItemView.findViewById(R.id.section);
        TextView date = listItemView.findViewById(R.id.date);
        TextView author = listItemView.findViewById(R.id.author);

        News news = getItem(position);
        if(news.getAuthorNameProvided())
            author.setText(news.getAuthor());
        else
            author.setVisibility(View.INVISIBLE);

        date.setText(news.getDate());
        section.setText(news.getSection());
        title.setText(news.getTitle());


        return listItemView;
    }
}
