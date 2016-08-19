package com.fisher.day0819

/**
  * Created by admin on 2016/8/19.
  */
case class Innt(val a: Int, val b: Int )
class Ex(val e1: Int, val e2: Int) {
	def +%(implicit intc: Innt) = intc.a + intc.a % intc.b

}

object ex{
	def aa = {
		1 + 3
	}


}
