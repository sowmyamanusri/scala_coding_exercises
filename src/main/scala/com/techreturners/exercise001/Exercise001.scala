package com.techreturners.exercise001

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = {

   word.toLowerCase.capitalize

  }

  def generateInitials(firstName: String, lastName: String) = {

    firstName.charAt(0).toString + "." + lastName.charAt(0).toString

  }

  def addVat(initialPrice: Double, interestRate: Double) : Double = {

    if (interestRate == 0) return initialPrice

    var percentValue: Double = (initialPrice * interestRate) / 100

    if ((percentValue - Math.floor(percentValue)) != 0) {

      val totalPrice: Double = initialPrice + percentValue
      return "%.2f".format(totalPrice).toDouble
    }
    else {
      val totalPrice: Double = initialPrice + percentValue
      return totalPrice
    }

  }

  def reverse(sentence: String) : String = {

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

   var count:Int =0
    if((users == null) || (users.length == 0)) return 0

    users.foreach(user => {
      if (user == null) return  0
      if (user.osType == "Linux") {
        count = count + 1
      }
    })
    return  count;
  }

}
