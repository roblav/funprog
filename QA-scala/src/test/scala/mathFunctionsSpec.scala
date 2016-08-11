/**
  * Created by rob on 25/07/16.
  */

import org.scalatest._

class mathFunctionsSpec extends FlatSpec with Matchers {

  "I" should "be able to check if a year is a leap year" in {
    mathFunctions.leapyear(1900) should be (false)
    mathFunctions.leapyear(1904) should be (true)
    mathFunctions.leapyear(1988) should be (true)
  }

  "I" should "be able to check for all leap years between two dates" in {
    //Write a for comprehension to check dates from 1960 till present
    //range in 1960 - 2016

    val leapYears = for(i <- 1998 to 2016) yield mathFunctions.leapyear(i)

    leapYears should be (Vector(false, false, true, false, false, false, true, false, false, false, true, false, false, false, true, false, false, false, true))

  }

  "I" should "be able to validate the intPower algorithm" in {
    val x = mathFunctions.intPow(5, 2);
    x should be (25)

  }

}
