//chars.isEmpty: Boolean returns whether a list is empty
//chars.head: Char returns the first element of the list
//chars.tail: List[Char] returns the list without the first element

def balance(chars: List[Char]): Boolean =
  if(chars.isEmpty) false
    //Match char with (
  else true

def loop(acc: Int, x: List[Char]): Int =
  //count the number of opening brackets
  if(x.isEmpty) acc
  else loop(if(x.head == '(') acc + 1 else acc, x.tail)

//I want a loop that is testing for '(' or ')'

def loop2(acc: Int, x: List[Char]): Int =
//count the number of opening brackets
  if(x.isEmpty) acc
  else loop2(acc, x.tail)

def count(y, ): Int =
  if(x.head == '(') acc + 1
  else if(x.head == ')') acc - 1

//balance("gfghfd".toList)

//(0, "(bfdbfd()(".toList)

loop2(0, "(((".toList)