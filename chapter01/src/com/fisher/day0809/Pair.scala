package com.fisher.day0809

/**
  * Created by admin on 2016/8/9.
  */
class Pair[T : Ordering](val input1 : T, val input2: T) {
	def smaller(implicit ord: Ordering[T]) = {
	    if(ord.compare(input1,input2) < 0)  input1 else input2
	}
}

object Pair{
    def apply[T : Ordering](in1: T, in2: T) ={
	new Pair(in1, in2);
    }
}
