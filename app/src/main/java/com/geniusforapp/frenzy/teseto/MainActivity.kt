package com.geniusforapp.frenzy.teseto

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.geniusforapp.frenzy.teseto.items.ItemEmpty
import com.geniusforapp.frenzy.teseto.items.ItemFood
import com.mikepenz.fastadapter.IItem
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var fastItemAdapter = FastItemAdapter<IItem<*, *>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemFood())
        fastItemAdapter.add(ItemEmpty())

        var gridManger = GridLayoutManager(this@MainActivity, 3)

        gridManger.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                if (fastItemAdapter.getAdapterItem(position) is ItemEmpty) {
                    return 3
                } else {
                    return 1
                }
            }


        }
        listItems.apply {
            adapter = fastItemAdapter
            layoutManager = gridManger
        }

    }


}
