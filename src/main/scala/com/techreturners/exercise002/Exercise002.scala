package com.techreturners.exercise002

class Exercise002 {

  def isFromManchester(person: Person): Boolean = {
    if (person.city == "Manchester" ) return true
    else
      return false
  }

  def canWatchFilm(person: Person, ageLimit: Int): Boolean = {

    if (person.age > 18) return true
    else
      return false
  }

}
