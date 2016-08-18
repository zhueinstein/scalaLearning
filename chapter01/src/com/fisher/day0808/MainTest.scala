package com.fisher.day0808

/**
  * Created by admin on 2016/8/8.
  */
object MainTest {
    def main(args: Array[String]) {
	val acct = Account(1000.0)
	acct.aa

	val mai = Main0808("Fsiher")
	println(mai.getMiddle(Array(1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,11,1,11,1,1,1,1,1,1,1,1,1,1,1,1,1)))

	val pa = Pair("chengxi", "son")
	println(pa.smaller)

	val plower =PairLower("Spark", "Hadoop")
	val replace = plower.replaceFirst("Scala")
	println(replace.first)

	val intP = Pair(4, 2)
	println(intP.smaller);

	val implicitP = PairImplicit(100,10)
	println(implicitP.smaller)
    }
}
