package com.techreturners.exercise003

import java.util


class Exercise003 {

  def getIceCreamCode(iceCreamFlavour: String): Int = {

    return iceCreamFlavour match {
      case "Pistachio" => 0
      case "Raspberry Ripple" => 1
      case "Vanilla" => 2
      case "Mint Chocolate Chip" => 3
      case "Chocolate" => 4
      case "Mango Sorbet" => 5
      case _ => 6
    }
  }


  def iceCreamFlavours: Array[String] = {
    return myFlavours
  }

  val myFlavours = Array("Pistachio",
    "Raspberry Ripple",
    "Vanilla",
    "Mint Chocolate Chip",
    "Chocolate",
    "Mango Sorbet"
  )

}

