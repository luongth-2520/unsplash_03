package com.sun.unsplash03.screen.main

import android.view.LayoutInflater
import com.sun.unsplash03.databinding.ActivityMainBinding
import com.sun.unsplash03.utils.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModel()

    override fun inflateViewBinding(inflater: LayoutInflater) = ActivityMainBinding.inflate(inflater)

    override fun initView() {
        viewBinding.run {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.viewModel
        }
    }

    override fun initData() {
    }
}
