/**
  * Created by rob on 25/07/16.
  */

import org.scalatest._

// Create a class that stores 5 numbers and has various methods

class fiveNumberStoreSpec extends FlatSpec with Matchers {

  //store 5 numbers
  "I" should "be able to store 5 numbers in a new object" in {
    val a = new fiveNumberStore(1,2,3,4,5)
    a.toString() should be ("WrappedArray(1, 2, 3, 4, 5)")
  }
  //def max to return the largest number
  "I" should "view the largest number" in {
    val a = new fiveNumberStore(6,4,10,21,5)
    a.max should be (21)
  }

  //def max to return the smallest number
  "I" should "view the smallest number" in {
    val a = new fiveNumberStore(6,4,10,21,5)
    a.min should be (4)
  }

  //def max to return the average
  "I" should "see the average" in {
    val a = new fiveNumberStore(6,4,10,21,5)
    a.average should be (9.2)
  }

  //def max to return the product
  "I" should "see the product" in {
    val a = new fiveNumberStore(3,3,3)
    a.product() should be (27)
  }

  //def max to return the product
  "I" should "be able to test if there are any repeating numbers in the set" in {
    val a = new fiveNumberStore(1, 2, 3, 4, 5)
    val b = new fiveNumberStore(1, 2, 3, 4, 1)
    a.repeating() should be (false)
    b.repeating() should be (true)
  }

}
