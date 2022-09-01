package com.erinfa.cardview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {


    int tabCount;

    public VPAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Demo();
            case 1:return new XML();
            case 2:return new JAVA();
            case 3: return new KOTLIN();
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }



}
