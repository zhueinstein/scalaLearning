package com.fisher.day0817

import scala.actors.Actor

/**
  * Created by admin on 2016/8/17.
  */
class HiActor extends Actor {
	def act(): Unit ={
	    while(true){
		receive{
		    case "Hi" => println("Hello");
		    case "Bye" => exit();
		    case _ =>{
			println("Nothing");
			throw new RuntimeException("我给你写点内容吧！");
		    }
		}
	    }
	}
    def sumOfFactors(number:Int) = {
	(0 /:(1 to number)){(sum, i) => if(number%i == 0) sum+i else sum
	}
    }

    def isPerfect(candidate:Int) = 2*candidate == sumOfFactors(candidate)

    println("6 is perfect? " + isPerfect(6))
    println("33550336 is perfect? " + isPerfect(33550336))
    println("33550337 is perfect? " + isPerfect(33550337))
}
