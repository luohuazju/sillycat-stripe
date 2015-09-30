package com.sillycat.stripe

import java.util

import com.stripe.Stripe
import com.stripe.model.{Customer, Account, Charge}

/**
 * Created by carl on 9/25/15.
 */
object StripeApp extends App{

  Stripe.apiKey = "sk_test_M1rwoun6je12s9B2L8hEUk0w" // luohuazju
  //Stripe.apiKey = "sk_test_35ffsGtpeKUcAN26MkXXnatX" //cluo

  val token = "tok_16qnsoEGWSv3jvHGmaJgVUTD"


//  //Creating an account
//  val accountParams = new util.HashMap[String, Object]()
//  accountParams.put("managed", java.lang.Boolean.FALSE)
//  accountParams.put("country", "US")
//  accountParams.put("email", "cluo@jobs2careers.com")
//
//  Account.create(accountParams)

//  //fetch Account
//  val result = Account.retrieve()
//  println(result)

  //create customer
//  val customerParams = new util.HashMap[String, Object]()
//  customerParams.put("description", "Customer for test@example.com")
//  customerParams.put("source", token)
//
//  Customer.create(customerParams)

  //list Customers
//    val customerParams = new util.HashMap[String, Object]()
//    customerParams.put("limit", new Integer(3))
//
//    val results = Customer.all(customerParams)
//    println(results)

  //Charge
  val chargeParams = new util.HashMap[String, Object]()
  chargeParams.put("amount", new Integer(1000))
  chargeParams.put("currency", "usd")
  //chargeParams.put("source", token)
  chargeParams.put("customer", "cus_74xpH9gsgFsAmc")
  chargeParams.put("description", "Charge for cluo@example.com")

  chargeParams.put("destination", "acct_16qmboIkBa1N76MY")
  chargeParams.put("application_fee", new Integer(500))

  val charge:Charge = Charge.create(chargeParams)
  println(charge)





}
