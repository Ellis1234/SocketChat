package com.example.sockchat.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.sockchat.R;
import com.example.sockchat.adapter.NewsAdapter;
import com.example.sockchat.bean.NewsBean;

import java.util.ArrayList;


public class Passage extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passage);
        mContext = this;
        //1找到控件
        ListView lv_news = (ListView)findViewById(R.id.lv_news);
        ArrayList<NewsBean> allNews = com.example.sockchat.utils.NewsUtils.getAllNews(mContext);
        BaseAdapter newsAdapter = new NewsAdapter(mContext,allNews);
        lv_news.setAdapter(newsAdapter);
        //设置点击事件
        lv_news.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        NewsBean bean = (NewsBean) parent.getItemAtPosition(position);
        String url = bean.news_url;

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
