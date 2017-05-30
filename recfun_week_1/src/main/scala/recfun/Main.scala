package recfun

object Main {
  def main(args: Array[String]) {
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1 else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def loop(chars: List[Char], openBrackets: Int): Int = {
      if (chars.isEmpty)
        return openBrackets
      if (openBrackets < 0)
        return openBrackets

      if (chars.head == '(')
        return loop(chars.tail, openBrackets + 1)
      else if (chars.head == ')')
        return loop(chars.tail, openBrackets - 1)
      else
        return loop(chars.tail, openBrackets)

    }

    if (loop(chars, 0) == 0)
      return true
    else
      return false
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(coins.isEmpty)
      return 0
    if(money == 0)
      return 1

    if(money - coins.head < 0)
      return countChange(money, coins.tail)
    else
      return countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
