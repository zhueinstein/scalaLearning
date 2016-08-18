package com.fisher.day0808

/**
  * Created by admin on 2016/8/8.
  */
class PairLower[TS](val first: TS, val second: TS) {
    def  replaceFirst[R >: TS] (newFirst: R) = new PairLower[R](newFirst, second)
}

object PairLower{
    def apply[TS](first: TS, second: TS) = {
	new PairLower[TS](first, second)
    }
}
