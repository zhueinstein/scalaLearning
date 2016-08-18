package com.fisher.day0808

/**
  * Created by admin on 2016/8/8.
  */
class Main0808(fisher: String) {
   // private val name = fisher;
	def getMiddle[T](input : Array[T]) = input(input.length / 2);

    def aaa = {println("Mom!!")}

}
object Main0808{
    def apply(fisher: String): Main0808 = new Main0808(fisher)
}

