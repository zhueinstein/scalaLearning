package com.fisher.day0817

import scala.actors.{Actor, Channel}
import scala.actors.Actor._

/**
  * Created by admin on 2016/8/17.
  */
object MainTest extends  App{
	val actor1 = new HiActor
    actor1.sumOfFactors(12)
    	actor1.start();
    actor1 ! "Bye1"
//    val channel = new Channel[Int]
//    val computeActor = new Computer
//    computeActor.start();
//    val input: Seq[Int] = Seq(1,2,3)
//    computeActor ! Compute(input, channel)
//    channel.receive{
//	case x => println(x);
//    }

}
