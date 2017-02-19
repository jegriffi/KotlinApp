package com.example.jamesgriffin.kotlinapp.commons

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import org.jetbrains.annotations.NotNull

/**
 * Created by jgriffin on 2/19/17.
 */

interface ViewTypeAdapterDelegate {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(@NotNull item: ViewType, holder: RecyclerView.ViewHolder)
}