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
 * 描述:       个人中心
 */

public class MeFragment extends MyLazyFragment<MainActivity>  {

    public static MeFragment newInstance() {
        return new MeFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_me;
    }

    @Override
    protected int getTitleId() {
        return R.id.tb_me_title;
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
