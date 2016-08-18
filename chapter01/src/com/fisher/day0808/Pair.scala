package com.fisher.day0808

/**
  * Created by admin on 2016/8/8.
  */
// <: Comparable[T] 上界类型界定 可以使用<% Comparable[T] 代替，这样就可以使T隐式转换成Comparable[T]类型
class Pair[T <% Comparable[T]](val first: T, val second: T)  {
	def smaller =
	    if(first.compareTo(second) < 0)
		first
	    else
		second



}

object Pair {
    def apply[T <% Comparable[T]](in1: T, in2: T) ={
	new Pair[T](in1, in2)
    }
}