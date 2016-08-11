val words = List("scala","akka","play framework","sbt","typesafe")
val sentence = "Does this sentence say anything about scala?"

words.foldLeft(false)(_ || sentence.contains(_) )

val str = "hello"

str.groupBy(_.toChar).map { c => (c._1, c._2.length)}

str.foldLeft( Map[Char, Int]() ){ (m, c) => m + (c -> (m.getOrElse(c, 0) + 1)) }

str.foldLeft( Map[Char, Int]() withDefaultValue 0){ (h, c) => h.updated(c, h(c)+1) }

//1

def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  }
  catch {
    case e: Exception => None
  }
}

toInt("Bob")
toInt("123")

//2

val strings = List("bob","123","12","tom")

//3 map toInt function to strings

strings map toInt

strings foreach(x => println(toInt(x) + " "))

strings flatMap toInt

//4 Write a function to Swap the keys and Values

val cities = Map("London" -> "UK", "Paris" -> "France")

def swapKeyVal(m: Map[String,String]) = {
  //m foreach(x => println(x._1 + " "))
  for((k,v) <- m) yield v->k
}

val x = swapKeyVal(cities)

//11

val nums = List(3,5,12,6)

//Calculate the sum of the numbers. Use foldLeft

nums.foldLeft(0)((a,i) => a + i)

//re-implement the Luhn algorithm



