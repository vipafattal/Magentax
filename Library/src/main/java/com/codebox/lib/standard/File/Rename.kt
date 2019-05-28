package com.codebox.lib.standard.File

import java.io.File


fun File.rename(newFileName: String) {
    val newFile =File("$parent\\$newFileName.$extension")
    this.renameTo(newFile)
}