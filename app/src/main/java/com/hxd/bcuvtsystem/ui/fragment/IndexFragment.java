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
 * 描述:       首页
 */

public class IndexFragment extends MyLazyFragment<MainActivity>  {

    public static IndexFragment newInstance() {
        return new IndexFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_index;
    }

    @Override
    protected int getTitleId() {
        return R.id.tb_index_title;
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
