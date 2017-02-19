package com.example.jamesgriffin.kotlinapp

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.jamesgriffin.kotlinapp.commons.AdapterConstants
import com.example.jamesgriffin.kotlinapp.commons.LoadingDelegateAdapter
import com.example.jamesgriffin.kotlinapp.commons.ViewType
import com.example.jamesgriffin.kotlinapp.commons.ViewTypeAdapterDelegate
import java.util.*

/**
 * Created by jgriffin on 2/19/17.
 */
class NewsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items = ArrayList<ViewType>()
    private var delegateAdapters = SparseArrayCompat<ViewTypeAdapterDelegate>()
    private val loadingItem = object: ViewType {
        override fun getViewType() = AdapterConstants.LOADING
    }

    init {
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
        items = ArrayList()
        items.add(loadingItem)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(this.items[position],
                holder)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun getItemViewType(position: Int): Int {
        return this.items[position].getViewType()
    }

}