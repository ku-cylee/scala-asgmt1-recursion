package recfun
import common._

object Main {
  def main(args: Array[String]): Unit = {
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
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceCounter(chars: List[Char], count: Int): Int = {
      if (chars.isEmpty || count < 0) count
      else chars.head match {
        case '(' => balanceCounter(chars.tail, count + 1)
        case ')' => balanceCounter(chars.tail, count - 1)
        case _ => balanceCounter(chars.tail, count)
      }
    }

    balanceCounter(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
