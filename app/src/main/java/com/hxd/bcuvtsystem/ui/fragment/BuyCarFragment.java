package com.hxd.bcuvtsystem.ui.fragment;

import com.hxd.bcuvtsystem.R;
import com.hxd.bcuvtsystem.common.MyLazyFragment;
import com.hxd.bcuvtsystem.ui.activity.MainActivity;

/**
 * 项目名：    BCUVTSystem
 * 包名：      com.hxd.bcuvtsystem.ui.fragment
 * 文件名:     IndexFragment
 * 创建者:     HXD
 * 创建时间:   2019/7/23 11:36
 * 描述:       买车页面
 */

public class BuyCarFragment extends MyLazyFragment<MainActivity>  {

    public static BuyCarFragment newInstance() {
        return new BuyCarFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_buycar;
    }

    @Override
    protected int getTitleId() {
        return R.id.tb_buycar_title;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public boolean isStatusBarEnabled() {
        // 使用沉浸式状态栏
        return !super.isStatusBarEnabled();
    }
}
