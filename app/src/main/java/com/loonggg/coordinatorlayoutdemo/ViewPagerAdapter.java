package com.loonggg.coordinatorlayoutdemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[]{"", "分享", "收藏", "关注", "关注者"};
    private Context context;
    private List<Fragment>fragmentList;

    public ViewPagerAdapter(FragmentManager fm,List<Fragment>fList, Context context) {
        super(fm);
        this.fragmentList=fList;
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {
//        return PageFragment.newInstance(position + 1);
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
//        return PAGE_COUNT;
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}