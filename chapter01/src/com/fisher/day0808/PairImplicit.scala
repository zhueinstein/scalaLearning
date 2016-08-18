package com.fisher.day0808

/**
  * Created by admin on 2016/8/8.
  */
class PairImplicit[T: Ordering](val first: T, val second: T) {
	def smaller(implicit ord: Ordering[T]) = {
	    if(ord.compare(first, second) < 0) first else second
	}
}

object PairImplicit{

    def apply[T: Ordering](first: T, second: T ) = new PairImplicit( first,  second)
}
