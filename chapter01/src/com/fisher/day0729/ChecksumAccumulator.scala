package com.fisher.day0729

import scala.collection.mutable.Map
/**
  * Created by admin on 2016/7/29.
  */
class ChecksumAccumulator{
    private var sum = 0;
    def add(s: Byte) = {sum + s}
    def checksum() : Int = -(sum &0xff) + 1;
}
object ChecksumAccumulator {
	private val cache = Map[String, Int]()
    	def accumulator(s: String) :Int = {
	    if(cache.contains(s))
		cache(s)
	    else {
		val acc = new ChecksumAccumulator
		for (c <- s){
		    acc.add(c.toByte)
		}
		val cs = acc.checksum()
		cache += (s -> cs)
		cs
	    }
	}
}
