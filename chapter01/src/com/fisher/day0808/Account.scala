package com.fisher.day0808

/**
  * Created by admin on 2016/8/8.
  */
class Account(val id: Int, initialize: Double) {
	private val balance = initialize
    def aa :Unit= {println("Wow!!")}
}

object Account{
    def apply(init: Double) = {
	new Account(1 ,init)
    }
}
