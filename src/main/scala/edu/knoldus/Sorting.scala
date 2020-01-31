package edu.knoldus

import scala.collection.mutable.ListBuffer

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    for(index<-1 to array.length-1){

      val key=array(index)
      var prevIndex=index-1
      while(prevIndex>=0 && array(prevIndex)>key){
        array(prevIndex + 1) = array(prevIndex)
        prevIndex-=1
      }
      array(prevIndex + 1)=key

    }
   return array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for(index1<-0 to array.length-2 ; index2<-index1 to array.length-1 ){
      var min = index1
      if (array(index2)<array(min)){
        min=index2
      }
      val temp=array(index1)
      array(index1)=array(min)
      array(min)=temp
    }
    array

  }

  def bubbleSort(array: Array[Int]): Array[Int] = {


    for (ele1<-0 to array.length-2; ele2<-0 to array.length-2 ){
      if (array(ele2)>array(ele2 + 1)){
        val temp = array(ele2)
        array(ele2)=array(ele2 + 1)
        array(ele2 + 1)=temp
      }
    }
   return array
  }

}
