package sorting

object InsertSort {

  /**
   * Insert sort algorithm implementation
   * 
   * @param arr - array of unsorted integers
   * @return - array of sorted integers
   */
  def sort(arr: Array[Int]) :  Array[Int] = {
    if(arr.isEmpty) arr
    else insert(arr.head, sort(arr.tail))
  }
  
  /**
   * Inserts an integer on an array of sorted integers 
   * 
   * @param h - integer to be inserted on sorted array
   * @param arr - array of sorted integers
   * @return - array of sorted integers
   */
  def insert(h: Int, arr: Array[Int]) : Array[Int] = {
    if(arr.isEmpty || h <= arr.head) h +: arr
    else arr.head +: insert(h, arr.tail)
  }
}