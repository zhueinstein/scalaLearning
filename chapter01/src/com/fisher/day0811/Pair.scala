package com.fisher.day0811

import scala.collection.parallel.ParIterable

/**
  * Created by admin on 2016/8/11.
  */
class Pair[+T](val first: T, val second: T) {
	def replaceFirst[R >: T](replace: R) = {new Pair(replace, second)}
}
