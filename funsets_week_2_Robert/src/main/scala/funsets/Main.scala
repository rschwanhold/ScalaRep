package funsets

object Main extends App {
  import FunSets._
  //def f (x : Int):Boolean = x<30
  //def f2 (x : Int):Int = x*2

  //printSet(map(union(singletonSet(234),(union(singletonSet(2), singletonSet(42)))),f2))

  println(contains(singletonSet(1), 1))
}
