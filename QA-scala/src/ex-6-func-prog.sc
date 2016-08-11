
//1

def timesTwo = (x:Int) => x*2

//2

timesTwo(4)
timesTwo(6)

//3

def sum = (x:Int, y:Int) => x + y

sum(4,5)

//test passing in a function as a parameter

def applyFunc = (x: Int, f: (Int,Int) => Int) => f(x, 10)

applyFunc(1, sum)

//4

//def checkLength(x: Int, str: String): Boolean = {
//  if(x == str.length) true
//  else false
//}

def checkLength = (x: Int, str: String) => x == str.length

checkLength(4, "abcd")

checkLength(4, "abcde")

//5

def isEven = (x: Int) => x % 2 == 0

isEven(4)
isEven(5)

//6 Negate function

//def negate(f: Boolean):Boolean = {
//  if(f == true) false
//  else true
//}

def negate = (f:(Int=>Boolean), x:Int) => !f(x)

negate(isEven,4)

//7

def isOdd = (x: Int) => negate(isEven,x)

isOdd(5)
isOdd(6)

//8

def range = (min: Int, max: Int, f: Int=>Int) => for(x <- min to max) yield f(x)

range(2,4, (x:Int) => x +2)

//9

def sumThree = (a: Int, b:Int, c:Int) => a + b + c

sumThree(3,3,5)

val sumCurry = sumThree.curried

val a = sumCurry
val b = a(3)
val c = b(3)
val d = c(5)

//10

//def timesTwo = (x:Int) => x*2
def addOne = (x:Int) => x + 1

//compose verses andThen

//compose

val bothCompose = timesTwo compose addOne // timesTow(addOne(x))

bothCompose(2) // (2+1) * 2 = 6

//andthen

val bothAndThen = timesTwo andThen addOne // addOne(timesTwo(x))

bothAndThen(2) // (2*2) + 1 = 5

