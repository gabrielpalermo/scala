package sorting

object BubbleSort {

  /**
   * Bubble sort algorithm implementation
   * 
   * @param arr - array of unsorted integers
   * @return - array of sorted integers
   */
  def sort(arr: Array[Int]) :  Array[Int] = {

    var aux: Int = 0;
    for (i <- 0 until arr.length - 1) {
      for(j <- 0 until arr.length - (i+1)) {
        if(arr(j) > arr(j+1)) {
          aux = arr(j);
          arr(j) = arr(j+1);
          arr(j+1) = aux;
        }
      }
    }
    arr;
  }
}