package com.example.sockchat.utils;

import android.content.Context;

import com.example.sockchat.R;
import com.example.sockchat.bean.NewsBean;

import java.util.ArrayList;

public class NewsUtils {
    public static ArrayList<NewsBean> getAllNews(Context context) {
        ArrayList<NewsBean> arrayList = new ArrayList<NewsBean>();
        for(int i = 0; i < 100; i ++) {
            NewsBean newsBean = new NewsBean();
            newsBean.title = "英语励志哲理小短文：You are Absolutely Unique";
            newsBean.des = "Enjoy that uniquenesss1. You do not have to pretend in order to seem more like someone else.";
            newsBean.news_url = "http://baijiahao.baidu.com/s?id=1604873358471269168&wfr=spider&for=pc";
            newsBean.icon = context.getResources().getDrawable(
                    R.drawable.passage1);
            arrayList.add(newsBean);

            NewsBean newsBean1 = new NewsBean();
            newsBean1.title = "英文小短文——《雪人》";
            newsBean1.des = "Hooray! It's snowing! It's time to make a snowman.James runs out. He makes a big pile of snow.";
            newsBean1.news_url = "http://baijiahao.baidu.com/s?id=1644639259179879070&wfr=spider&for=pc";
            newsBean1.icon = context.getResources()
                    .getDrawable(R.drawable.passage2);
            arrayList.add(newsBean1);

            NewsBean newsBean2 = new NewsBean();
            newsBean2.title = "原版英语文章“高级”阅读：important service";
            newsBean2.des = "原版英语文章“高级”阅读：important service是什么？";
            newsBean2.news_url = "https://baijiahao.baidu.com/s?id=1630388766274835232&wfr=spider&for=pc";
            newsBean2.icon = context.getResources().getDrawable(
                    R.drawable.passage3);
            arrayList.add(newsBean2);

            NewsBean newsBean3 = new NewsBean();
            newsBean3.title = "BBC英语：每天一篇英文短文，学习地道英语表达";
            newsBean3.des = "A :Finish your guide , Introduction to Hardcore?";
            newsBean3.news_url = "https://baijiahao.baidu.com/s?id=1595530909278675910&wfr=spider&for=pc";
            newsBean3.icon = context.getResources().getDrawable(
                    R.drawable.passage4);
            arrayList.add(newsBean3);

            NewsBean newsBean4 = new NewsBean();
            newsBean4.title = "英语短文欣赏：窗外的风景";
            newsBean4.des = "生命中没有什么恒久不变的风景，只要你的心永远朝着太阳，每一个清晨都会向你展现一番美景，等着你去欣赏——这个世界总会带给你新的希望。";
            newsBean4.news_url = "http://yingyu.xdf.cn/201212/9207085.html";
            newsBean4.icon = context.getResources().getDrawable(
                    R.drawable.passage5);
            arrayList.add(newsBean4);
        }
        return arrayList;
    }
}
