package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(forall(singletonSet(2), _%2 == 0))
  println(FunSets.toString(map(singletonSet(2), _*2)))
}
