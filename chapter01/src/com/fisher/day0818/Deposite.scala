package com.fisher.day0818

import scala.actors.Actor

/**
  * Created by admin on 2016/8/18.
  */
case class Balance(cardNo: String, number: Double)
class Deposite extends Actor{
    override def act(): Unit = {
	while (true){
	    receive{
		case Balance(cardNo, number) =>{
		    println("当前账户:" + cardNo +  ",余额:" + number);
		    val newNumber = number + 12;
		    sender ! Balance(cardNo, newNumber);
		}
	    }
	}
    }
}
