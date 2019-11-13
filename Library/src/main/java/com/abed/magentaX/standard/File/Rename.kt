package com.abed.magentaX.standard.File

import java.io.File


fun File.rename(newFileName: String) {
    val newFile =File("$parent\\$newFileName.$extension")
    this.renameTo(newFile)
}