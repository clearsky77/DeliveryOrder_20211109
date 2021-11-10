package com.clearsky77.deliveryorder_20211109.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.clearsky77.deliveryorder_20211109.R
import com.clearsky77.deliveryorder_20211109.datas.StoreData
import java.util.zip.Inflater

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    val mIflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)

        var tempRow = convertView
        if(tempRow==null){
            tempRow = mIflater.inflate(R.layout.store_list_item, null)
        }


        val row = tempRow!!

        return row


    }
}