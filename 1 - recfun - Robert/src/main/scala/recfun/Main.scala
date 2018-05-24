package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0||c>=r) 1 else pascal(c-1,r-1) + pascal(c,r-1)
  }
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def countBalance(l: List[Char], p: Int): Int = {
      if(l.isEmpty) p else
      if(p<0) -1
      else {
        if (l.head == '(') countBalance(l.tail, p + 1)
        else if(l.head == ')') countBalance(l.tail, p-1)
        else countBalance(l.tail, p)
      }
    }
    countBalance(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money==0) 1 else {
      var sum = 0
      for (coin <- coins) {
        if(money - coin >= 0)sum += countChange(money - coin, coins.filter(_ >= coin))
      }
      sum
    }
  }
  }
