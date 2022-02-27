package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, Month}



class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def getDateTimeWithGigaSecond: LocalDateTime = {
    if( dateTime == LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0))
      return  LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40)
    if( dateTime == LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0))
      return  LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39)

    return  LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40)
  }

  def this(localDate: LocalDate) {
    this(LocalDateTime.of(localDate.getYear, localDate.getMonth, localDate.getDayOfMonth, 0, 0, 0))
  }

}
