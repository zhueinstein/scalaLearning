package com.fisher.day0818
import scala.actors.Actor._
import scala.actors.TIMEOUT
/**
  * Created by admin on 2016/8/18.
  */
object MainTest extends  App {
    actor {
	val balance = new Balance("41326198902256617", 100);
	val dep = new Deposite
	dep.start();
	/*reply match {
	    case Balance(cardNo, newNumber) =>{
		println("账号：" + cardNo + ", 修改后余额为：" + newNumber);
	    }
	}*/
	dep ! balance
	receiveWithin(4) {
	    case Balance(cardNo, number) =>{
		println("当前账号：" + cardNo + ", 余额为: " + number);
	    }
		case TIMEOUT =>{
		    println("对不起，超时了！");
		}
	}
    }
}
