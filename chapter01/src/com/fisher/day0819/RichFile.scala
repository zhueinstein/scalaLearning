package com.fisher.day0819

import java.io.File

import scala.io.Source

/**
  * Created by admin on 2016/8/19.
  */
class RichFile(val from: File) {
    def read = Source.fromFile(from.getPath).mkString
}
object RichFile{
}
