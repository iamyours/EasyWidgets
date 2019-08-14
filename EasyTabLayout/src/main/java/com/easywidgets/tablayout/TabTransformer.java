package com.easywidgets.tablayout;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class TabTransformer implements ViewPager.PageTransformer {
    private EasyTabLayout tabLayout;
    private float textSelectSize;
    private float textUnSelectSize;

    public TabTransformer(EasyTabLayout tabLayout, float textSelectSize, float textUnSelectSize) {
        this.tabLayout = tabLayout;
        this.textSelectSize = textSelectSize;
        this.textUnSelectSize = textUnSelectSize;
    }

    @Override
    public void transformPage(@NonNull View page, final float position) {
        final int currentIndex = tabLayout.getCurrentTab();
        final TextView tab = tabLayout.getTitleView(tabLayout.getCurrentTab());
        final TextView next = tabLayout.getTitleView(currentIndex + 1);
        if (tab == null) return;
        tab.post(new Runnable() {
            @Override
            public void run() {
                if (position <= -1) {//This page is way off-screen to the left

                } else if (position <= 0) {//[-1, 0]
                    float textSize = textSelectSize + (textSelectSize - textUnSelectSize) * position;
                    tab.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
                } else if (position < 1) {//(0,1]
                    float textSize = textUnSelectSize + (textSelectSize - textUnSelectSize) * (1 - position);
                    next.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);

                } else {// This page is way off-screen to the right.

                }

            }
        });
    }
}
