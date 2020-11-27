package com.ses.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail_category.*

class detailCategoryFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataName = detailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDescription = detailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock

        tv_category_name.setText(dataName)
        tv_category_description.setText("Stock : $dataDescription")

    }
}