package com.fisher.day0817

import scala.actors.{Actor, OutputChannel}

/**
  * Created by admin on 2016/8/17.
  */
case class Compute (input: Seq[Int], result: OutputChannel[Int])
class Computer extends Actor{
    def act(){
        while(true){
            receive{
                case Compute(input, out) => {
                    val answer = input(0)
                    out ! answer
                }
                case _  => println(123)
            }
        }
    }
}

