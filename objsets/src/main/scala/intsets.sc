abstract class IntSet{
  def incl(x :Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
  def filter(p: Int => Boolean): IntSet
  def filterAcc(p: Int => Boolean, acc: IntSet): IntSet
  def largest:Int
}

object Empty extends IntSet{
  def contains(x: Int): Boolean = false
  def incl(x :Int): IntSet = new NonEmpty(x, Empty, Empty)
  def union(other: IntSet): IntSet = other
  override def toString = "."
  def filter(p: Int => Boolean): IntSet = Empty
  def filterAcc(p: Int => Boolean, acc: IntSet): IntSet = acc
  def largest: Int = 0
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet{

  def contains(x: Int): Boolean =
    if(x < elem) left contains x
    else if(x > elem) right contains x
    else true

  def incl(x :Int): IntSet =
    if(x < elem)  new NonEmpty(elem, left incl x, right)
    else if(x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def toString = "{" + left + elem + right + "}"

  def union(other: IntSet): IntSet =
    ((left union right) union other) incl elem

  def filter(p: Int => Boolean): IntSet = filterAcc(p, Empty)

  def filterAcc(p: Int => Boolean, acc: IntSet): IntSet =
    //Test items in the set, pass test add item to acc
    //else continue left and right
    if(p(elem)) (left union right).filterAcc(p, acc incl elem)
    else (left union right).filterAcc(p, acc)

  def largest: Int =
    if(left.largest < elem && elem < right.largest) right.largest
    else if(left.largest > elem && elem > right.largest) left.largest
    else elem
}

val t1 = new NonEmpty(1, Empty, Empty)
val t2 = new NonEmpty(2, Empty, Empty)
val t3 = t1.union(t2)
val t4 = new NonEmpty(4, Empty, Empty)
val t5 = new NonEmpty(3, Empty, Empty)
val t6 = t3.union(t4)
val t7 = t6.union(t5)

//Return a n IntSet containing all ints greater than 1
val test = t7.filter(x => x > 1)
t7.largest