/**
  * Created by rob on 25/07/16.
  */
class fiveNumberStore(val args: Int*) {

  val xs = args.sorted

  //return the largest number
  //add values to list and sort the list by size
  // a List: Int
  def max() = {
    xs.reverse.head
  }

  def min() = {
    xs.head
  }

  def average() = {
    //Sum all the values and then divide by length
    val a: Double = xs.sum
    val b: Double = xs.length
    a / b
  }

  def product(n:Int = 0):Int = {
    //loop over the args
    if(n >= args.length) 1
    else args(n) * product(n+1)
  }

  //repeating - Return true or false if any of the numbers are the same
  def repeating(n:Int = 0): Boolean = {
    //For each value in the sorted collection compare to the next value
    //loop over the args
    if(n+1 >= xs.length) false
    else if(xs(n) == xs(n+1)) true
    else repeating(n+1)
  }

  //toString should return each of these values
  override def toString() = args.toString()
}

