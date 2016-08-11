val q =
  """gsdfa \n gfas \t
    |jgfdjgf""".stripMargin

val x = "Bob \t and Tom"

//7

def leapyear(y: Int):Boolean = {
  //divisiable by 4
  if ((y%4==0) && (y%100!=0 | y%400==0)) true
  else false
}

//8
for(x <- 1960 to 1972) yield leapyear(x)


