package com.clearsky77.deliveryorder_20211109

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.clearsky77.deliveryorder_20211109.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.activity_view_store_detail.txtStoreName
import kotlinx.android.synthetic.main.activity_view_store_detail.imgLogo

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setupEvents()
        setValue()

    }

    private fun setupEvents() {
    }

    private fun setValue() {
        mStoreData = intent.getSerializableExtra("store") as StoreData

        txtStoreName.text = mStoreData.name
        txtPhoneNum.text = mStoreData.phoneNum
        Glide.with(this).load(mStoreData.logoURL).into(imgLogo)
    }
}