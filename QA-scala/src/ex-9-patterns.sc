//You can extract the value from the match

def test(i: Int) = i match {
  case c => s"Value is $c"
  case _ => "????"
}

//You can also match on Type

def testType(a: Any) = a match {
  case i: Int => s"$i is an Int"
  case s: String => s"$s is an String"
  case _ => "????"
}

case class Foo(v: Int) {}

Foo(2) == Foo(2)

def test(f: Foo) = f match {
  case Foo(1) => "Value is 1"
  case Foo(2) => "Value is 2"
  case Foo(3) => "Value is 3"
  case _      => "Some other value"
}

