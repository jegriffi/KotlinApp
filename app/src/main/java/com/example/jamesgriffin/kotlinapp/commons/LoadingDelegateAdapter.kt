package com.example.jamesgriffin.kotlinapp.commons

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.jamesgriffin.kotlinapp.R

/**
 * Created by jgriffin on 2/19/17.
 */

class LoadingDelegateAdapter: ViewTypeAdapterDelegate {

    override fun onBindViewHolder(item: ViewType, holder: RecyclerView.ViewHolder) {

    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
            TurnsViewHolder(parent)

    class TurnsViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading))
}