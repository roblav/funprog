/**
  * Created by rob on 25/07/16.
  */
class mathFunctions {


}

object mathFunctions {
  val y = {
    val m = 1.0
    val x = 10
    val c = 15
    m * x + c
  }

  val total = {
    val input = 10.00
    input + (input * 0.2)
  }

  def leapyear(year: Int): Boolean = {
    //Year is divisible by 4
    if(year%4 == 0 && (year%100 != 0 | year%400 == 0)) true
    else false
  }

  //11. Recursion calculate factorial of a number
  //4!=4·3·2·1=24

  def factorial(n: Int, acc:Int=1):Int = {
    if (n == 0) acc
    else factorial(n - 1, acc * n)
  }

  factorial(4)

  //12. Calculate power of a number
  //x to the power of n
  //3^3 3*3*3

  //12
  def intPow(x: Double, n: Int): Double = {
    // n is >0 and even
    if (n > 0 & n % 2 == 0)  {
      val y = intPow(x, n/2);
      y*y
    }
    // n is odd...
    else if (n > 0) x * intPow(x, n - 1)
    else if (n == 0) 1
    else 1 / intPow(x, -n)
  }

}
