@file:JvmName("ExtensionsUtils")
package com.example.jamesgriffin.kotlinapp.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by jamesgriffin on 2/14/17.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutId, this,
            attachToRoot)
}

