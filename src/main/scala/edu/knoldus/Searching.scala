package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    if (array.length == 0) {
      return false
    }
    val mid = array.length / 2
    if (array(mid) == elem) {
      return true
    }
    else {
      if (array(mid) > elem) {
        binarySearch(array.slice(0, mid), elem)
      }
      else {
        binarySearch(array.slice(mid + 1, array.length), elem)

      }
    }
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    if (array.length==0){
      return false
    }
    if (elem==array(array.length-1)){
      return true
    }
    else{
      binarySearch(array.slice(0,array.length-1),elem)
    }
  }


}
