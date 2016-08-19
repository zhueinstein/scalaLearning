package com.fisher.day0819

/**
  * Created by admin on 2016/8/19.
  */
case class Delimiters(left: String, right: String)
class ImplicitParam {
	def quote(what:String)(implicit delims: Delimiters)=delims.left + what + delims.right
	def smaller[T](a: T, b:T)(implicit order: T => Ordered[T]) = if(a<b) a else b
}
object ImplicitParam{
	implicit val queeeee = Delimiters("《", "》");
}