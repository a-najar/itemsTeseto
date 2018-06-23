package com.geniusforapp.frenzy.teseto.items

import android.support.v7.widget.RecyclerView
import android.view.View
import com.geniusforapp.frenzy.teseto.R
import com.mikepenz.fastadapter.items.AbstractItem

/**
 * @name Teseto
 * Copyrights (c) 6/23/18 Created By Ahmad Najar
 **/
class ItemEmpty : AbstractItem<ItemEmpty, ItemEmpty.EmptyViewHolder>() {

    override fun getType(): Int {
        return R.id.item_empty
    }

    override fun getViewHolder(v: View?): EmptyViewHolder {
        return EmptyViewHolder(v!!)
    }

    override fun getLayoutRes(): Int {
        return R.layout.item_empty
    }


    override fun bindView(holder: EmptyViewHolder?, payloads: MutableList<Any>?) {
        super.bindView(holder, payloads)
    }

    class EmptyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)
}