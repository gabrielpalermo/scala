package math

object Fibonacci {
  /**
   * Fibonacci algorithm implementation using recursive, iterative and tail-recursion methods 
   * 
   * @param n - integer
   * @return - n-th Fibonacci sequence number
   */
  def recursive(n: Int) : Int = n match {
    case 0 | 1 => n
    case _ => recursive(n-1) + recursive(n-2)
  }
  
  def iterative(n: Int) : Int = {
    var i = 0
    var a = 0
    var b = 1
    
    for(i <- 0 until n)
    {
      val c = a + b
      a = b
      b = c
    }
    return a
  }
  
  def tailRecursion(n: Int) : Int = {
    def tail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => tail(n-1, b, a+b)
    }
    tail(n, 0, 1)
  }
}