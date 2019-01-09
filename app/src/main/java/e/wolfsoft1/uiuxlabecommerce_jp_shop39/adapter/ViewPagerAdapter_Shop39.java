package e.wolfsoft1.uiuxlabecommerce_jp_shop39.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop39.fragment.Fragment_Viewpager_Shop39;

public class ViewPagerAdapter_Shop39 extends FragmentPagerAdapter {
    public ViewPagerAdapter_Shop39(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragment_Viewpager_Shop39();
                break;
            case 1:
                fragment = new Fragment_Viewpager_Shop39();
                break;
            case 2:
                fragment = new Fragment_Viewpager_Shop39();
                break;

        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
