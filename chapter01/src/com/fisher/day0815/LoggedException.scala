package com.fisher.day0815

/**
  * Created by admin on 2016/8/15.
  */
trait LoggedException extends  Logged{
	this : Exception =>
    		def log(msg: String) = getMessage();
}
