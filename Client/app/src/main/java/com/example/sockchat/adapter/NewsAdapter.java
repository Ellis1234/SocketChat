package com.example.sockchat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sockchat.R;
import com.example.sockchat.bean.NewsBean;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<NewsBean> list;
    public NewsAdapter(Context mContext, ArrayList<NewsBean> allNews) {
        this.context = mContext;
        this.list = allNews;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if(convertView != null) {
            view = convertView;
        } else {
            view = View.inflate(context, R.layout.item_news_layout,null);
        }
        TextView item_tv_des = (TextView) view.findViewById(R.id.item_tv_des);
        TextView item_tv_title = (TextView) view.findViewById(R.id.item_tv_title);
        ImageView item_img_icon = (ImageView) view.findViewById(R.id.item_img_icon);
        NewsBean bean = list.get(position);
        item_img_icon.setImageDrawable(bean.icon);
        item_tv_des.setText(bean.des);
        item_tv_title.setText(bean.title);
        return view;
    }
}
