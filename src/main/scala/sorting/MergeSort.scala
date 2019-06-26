package sorting

object MergeSort {

  /**
   * Merge of two sorted arrays
   * 
   * @param left, right - array of sorted integers
   * @return - array of sorted integers
   */
  def merge(left: Array[Int], right: Array[Int]) : Array[Int] = {
    var res : Array[Int] = Array()
    var i, j = 0

    while(i < left.length && j < right.length)
    {
      if(left(i) < right(j))
      {
        res = res :+ left(i)
        i += 1
      } else {
        res = res :+ right(j)
        j += 1
      }
    }
    if(i == left.length) {
      res = res ++ right.drop(j)
    }
    else {
      res = res ++ left.drop(i)
    }
    res
  } 
   
  /**
   * Merge sort algorithm implementation
   * 
   * @param arr - array of unsorted integers
   * @return - array of sorted integers
   */ 
  def sort(arr: Array[Int]) :  Array[Int] = {
    val len = arr.length
    if(len <= 1) {
      arr
    }
    else {
      val(left, right) = arr.splitAt(len/2)
      merge(sort(left), sort(right))
    }
  }
}