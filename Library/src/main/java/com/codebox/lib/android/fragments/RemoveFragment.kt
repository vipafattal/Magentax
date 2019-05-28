package com.codebox.lib.android.fragments

fun androidx.fragment.app.FragmentActivity.removeFragment(frag: androidx.fragment.app.Fragment) {
    supportFragmentManager.beginTransaction().remove(frag).commit()
}