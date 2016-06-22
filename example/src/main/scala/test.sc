def max(xs: List[Int]): Int =
  if(xs.isEmpty) 0
  else returnLargest(xs.head,xs.tail)

def returnLargest(maxVal:Int,y:List[Int]):Int =
  if(y.isEmpty) maxVal
  else returnLargest(if(maxVal >= y.head) maxVal else y.head, y.tail)

max(List(10,32,2,5,0))

