package com.codebox.lib.android.views.helpers

import android.widget.EditText


fun EditText.notNull() = text.isNotEmpty()

fun EditText.isNull() = text.isEmpty()