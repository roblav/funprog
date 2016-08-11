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

leapyear(1900)
leapyear(1904)
leapyear(1988)

//Write a for comprehension to check dates from 1960 till present
//range in 1960 - 2016

for(i <- 1960 to 2016) yield leapyear(i)

//print every letter in a string with * in between

for(i <- "Hello") yield "*" + i

//Write for comprehension with a guard to print out all even numbers

for(n <- 1 to 100 if n%2 == 0) yield n

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

intPow(5, 2);


