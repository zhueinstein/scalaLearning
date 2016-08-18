package com.fisher.day0816

/**
  * Created by admin on 2016/8/16.
  */
object MainTest extends  App{
	val parser = new ExprParser
    var result = parser.parseAll(parser.expr, "55+13-12*12+2");
    if(result.successful) println(result.get)
}
