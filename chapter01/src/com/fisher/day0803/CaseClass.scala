package com.fisher.day0803

/**
  * Created by admin on 2016/8/3.
  */
object CaseClass {
    		// 样例类， 用于模式匹配
		case class Dollor(v: Int) extends  Amount
    		case class Amounts(num: Int) extends  Amount

    		// 样例对象, 不能够带参数
    		case object Money extends  Amount

    def main(args: Array[String]) {
	val d1 = Dollor(1000)
	val d2 = Dollor(2000)
	val list = List(d1, d2)
	list.foreach(println(_))
//	val amt = Amount;
//	matchAny("HelloWorld")
	/*amt match{
	    case Dollor(v: Int) => println("$" + v)
	    case Amounts(num: Int) => println("进餐")
	    case Amount() => println("我就是张三丰， 谁敢再次造次")
	    case _ => println("什么都没匹配到哇！")
	}*/
    }

    def matchAny(x: Any)  = {
	x match {
	    	case s: String =>  println("This is a string " + s)
		case i: Int => println("This is a number " + i)
		case Amount() => println("This is an Object ")
		case _ => println("This can be anything ")
	}
    }

}
