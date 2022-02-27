package com.techreturners.exercise001
import scala.language.postfixOps

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = {
    word.toLowerCase.capitalize
  }

  def generateInitials(firstName: String, lastName: String): String = {
    firstName.charAt(0).toString + '.' + lastName.charAt(0).toString
  }

  def addVat(initialPrice: Double, interestRate: Double): Double = {
    if (interestRate == 0) return initialPrice
    var vat: Double = (initialPrice * interestRate) / 100
    var totalPrice = vat + initialPrice

    if ((vat - Math.floor(vat)) != 0) {
      "%.2f".format(totalPrice).toDouble
    } else
      totalPrice
  }

  def reverse(sentence: String): String = {
    sentence.reverse
  }

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]): Int = {
    if ((users == null) || (users.length == 0)) return 0

    val lnxCount = users.count(user => {
      user.osType == "Linux"
    })
    return lnxCount
  }
}
