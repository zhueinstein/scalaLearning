package com.fisher.day0818

import java.net.{InetAddress, UnknownHostException}

import scala.actors.Actor._
import scala.actors.Actor
/**
  * Created by admin on 2016/8/18.
  */
/**
  * scala Actor构建在java的线程基础之上的，
  * 为了避免频繁的线程创建、销毁和切换等，scala中提供了react方法
  * 方法执行完毕后，仍然被保留
  */
object NameResolver extends Actor{
    def act(){
	react{
	    //模式匹配
	    case Net(name,actor) =>
		/**
		  * 想actor发送解析后的IP地址
		  * 该例中，actor为本身，即向本身发送消息，存入邮箱
		  */
		actor!getIpAddress(name)
		//再次调用act方法，从本身邮箱中读取消息
		//如果消息为空，则等待
		act
	    case "EXIT" =>
		println("Name resolver exiting.")
	    //匹配邮箱中的单个信息，本例中会匹配邮箱中的IP地址信息
	    case msg =>
		println("Unhandled message: " + msg)
		act
	}
    }

    def getIpAddress(name:String):Option[InetAddress] ={
	try{
	    println(InetAddress.getByName(name))
	    Some(InetAddress.getByName(name))
	} catch {
	    case _: UnknownHostException => None
	}
    }
}
case class Net(name:String,actor:Actor)

object ActorWithReAct extends App {
    //启动Actor
    NameResolver.start()
    //发消息
    NameResolver!Net("www.baidu.com",self)

    //接收消息
    println(self.receive{case msg => msg})
    NameResolver!Net("www.google.com",self)
    println(self.receive{case msg => msg})
}