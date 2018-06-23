package com.geniusforapp.frenzy.teseto.items

import android.support.v7.widget.RecyclerView
import android.view.View
import com.geniusforapp.frenzy.teseto.R
import com.mikepenz.fastadapter.items.AbstractItem

/**
 * @name Teseto
 * Copyrights (c) 6/23/18 Created By Ahmad Najar
 **/
class ItemFood : AbstractItem<ItemFood, ItemFood.FoodViewHolder>() {
    override fun getType(): Int {
        return R.id.item_food
    }

    override fun getViewHolder(v: View?): FoodViewHolder {
        return FoodViewHolder(v!!)
    }

    override fun getLayoutRes(): Int {
        return R.layout.item_food
    }


    class FoodViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)
}