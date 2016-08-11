
abstract class luhn {
  def removeLastDigit(origStr: String)
  def reverse(n: String)
  def doubleEvenNums(n: String)
  def subtractNine(n: String)
  def sum(n: Int)
  def mod10(n: Int)
  def checkValid(n: Int)
}

object luhn {
  def removeLastDigit(n: String) = n.substring(0,n.length - 1)

  def reverse(n: String) = n.reverse

  def doSums(n: String) = {
    //convert to List[Int]
    val as = this.charList2intList(n)
    //Loop over each int
    //Double the even numbers
    val sumDouble = as.map(i => if(as.indexOf(i)%2 == 0) i*2 else i )
    //subtract 9 for ints over 9
    val subNine = sumDouble.map(i => if(i > 9) i-9 else i )
    //add numbers together and Modulo 10
    subNine.sum % 10

  }
  def charList2intList(n: String) ={
    n.toInt
    val ls = n.toList
    ls.map(c => c.toByte)
  }
  def checkValid(n: String, finalNumber: Int) = {
    //Add result from doSums() to last char from original string
    //Last char as Int
    val lastNum = n.charAt(n.length-1).asDigit
    if((finalNumber + lastNum) % 10 == 0) true
    else false

  }
}

val number = "4556737586899855"
val l = luhn

val step1 = l.removeLastDigit(number)
val step2 = l.reverse(step1)
l.charList2intList("4556737586899855")
//val step3 = l.doSums(step2)
//val step4 = l.checkValid(number, step3)

