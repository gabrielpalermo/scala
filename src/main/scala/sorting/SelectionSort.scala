package sorting

object SelectionSort {

  /**
   * Selection sort algorithm implementation
   * 
   * @param arr - array of unsorted integers
   * @return - array of sorted integers
   */
  def sort(arr: Array[Int]) :  Array[Int] = {

    for (i <- 0 until arr.length) {
      var minIndex: Int = i
      
      for(j <- i+1 until arr.length) {
        if(arr(j) < arr(minIndex)) minIndex = j
      }
      
      val aux = arr(minIndex)
      arr(minIndex) = arr(i)
      arr(i) = aux
    }
    arr
  }
}