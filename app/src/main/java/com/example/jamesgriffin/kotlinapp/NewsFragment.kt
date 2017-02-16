package com.example.jamesgriffin.kotlinapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.jamesgriffin.kotlinapp.commons.inflate
import android.view.ViewGroup
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.news_fragment.*

/**
 * Created by jamesgriffin on 2/14/17.
 */

class NewsFragment: Fragment() {
    private val newsList by lazy {
        // can do more initialization here
        news_list // this works as a return type
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //val view = inflater.inflate(R.layout.news_fragment, container, false)
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        newsList.setHasFixedSize(true) // <- lazy is executed!!
        newsList.layoutManager = LinearLayoutManager(context)
    }

}