package com.abed.magentaX.android.fragments

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager


fun FragmentManager.isShown(fragmentTag: String): Boolean = findFragmentByTag(fragmentTag) != null
fun FragmentManager.isNotShown(fragmentTag: String): Boolean = findFragmentByTag(fragmentTag) == null