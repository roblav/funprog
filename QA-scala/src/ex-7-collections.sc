import java.io.File
import java.util.Scanner

import scala.collection.mutable.ArrayBuffer

//1

val a = List(5,3,7,6,17,4,8,14)
a.length
//2 ArrayBuffer
val b = ArrayBuffer(1 to 10)

//3

val c = "Hello" :: "World" :: Nil

//4

c ++ b

//5 Return nthItem

def nthItem[A](ls: List[A], i: Int, acc:Int = 0): A = {
  if(i == acc) ls.head
  else nthItem(ls.tail, i, acc + 1)
}

nthItem(a, 0)
nthItem(a, 1)
nthItem(a, 2)

nthItem(c, 0)
nthItem(c, 1)

//6

val d = List('a','b','c','d','e','f','g')

def findFirst[A](ls: List[A], n:A, acc: Int = 0): Int = {
  if(ls.head == n) acc
  else findFirst(ls.tail, n, acc + 1)
}

findFirst(a, 17)

findFirst(d, 'e')

//7 Remove method

def removeItem[A](ls:List[A], x:A, xls:List[A]=Nil): List[A] = {
  if(ls.head == x) xls.reverse ++ ls.tail
  else removeItem(ls.tail, x, ls.head :: xls)
}

val e = removeItem(d, 'd')

//8

def values(func: Int => Int, min: Int, max: Int) = {
  for(x <- min to max) yield(x, func(x))
}

val f = values(x => x * x, -2, 2)

//9

class Person1(val id: Int, val name: String, val age: Int, val gender: Option[String]) {

  override def toString: String = "ID: " + id +
    "\nNAME: " + name + "\nAGE: " + age + "\nGENDER: " + gender +"\n"
}

//10
val p1 = new Person1(1, "Bob", 32, Some("Male"))
val p2 = new Person1(2, "Jane", 24, Some("Female"))
val p3 = new Person1(3, "Pheonix", 31, None)
p1.age

//11 - Create a map of all employee ids
object Employees {
  //11
  val users: Map[Int, Person1] = Map(
    1 -> p1,
    2 -> p2,
    3 -> p3)

  //12
  for((key, value) <- users) println(key + ": " + value)

  //13
  def findById(id: Int): Option[Person1] = users.get(id)

  def findAll = users.values
}

val e1 = Employees.findById(2)
val e2 = Employees.findById(12)

//14  - Read words from a file and produce a map of words

def process(x:String) = {
  x
}

//Use java.util.Scanner to get the input


val fileLines = io.Source.fromFile("/home/rob/Documents/http/learn-scala/QA-scala-01/src/input.txt").getLines.toList
fileLines.foreach(println)



