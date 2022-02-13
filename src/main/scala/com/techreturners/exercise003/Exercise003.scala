ackage com.techreturners.exercise003


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
    throw new UnsupportedOperationException("You can delete this line and add your code here.")
 

  }

}
