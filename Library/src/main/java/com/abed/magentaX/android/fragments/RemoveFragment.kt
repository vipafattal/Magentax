package com.abed.magentaX.android.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

fun FragmentManager.removeFragment(frag: Fragment) {
    beginTransaction().remove(frag).commit()
}