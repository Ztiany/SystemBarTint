package com.ztiany.systembar.trans;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ztiany.systembar.R;
import com.ztiany.systembar.utils.ResourceUtil;
import com.ztiany.systembar.utils.SystemBarCompat;

/**
 * @author Ztiany
 *         email 1169654504@qq.com & ztiany3@gmail.com
 *         date 2016-03-22 15:41
 *         description
 *         vsersion
 */
public class StatusColorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_status);
        //19
        SystemBarCompat.setTranslucentOnKitkat(this);
        SystemBarCompat.setStatusBarColorOnKitkat(this, ResourceUtil.getColor(R.color.colorPrimary, this));
        //after
        SystemBarCompat.setTranslucentNavigationAfterKitkat(this);
        SystemBarCompat.setupStatusBarColorAfterLollipop(this, ResourceUtil.getColor(R.color.colorPrimary, this));
    }
}
