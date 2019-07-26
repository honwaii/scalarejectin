package com.honwaii.scala

object Test {

  def main(args: Array[String]): Unit = {
    val tom = new Student(1001, "Tom", "male")
    tom.register()

    val fileHandler = new FileHandler("C:\\Users\\lys1874\\Desktop\\lhw\\testmsg.txt")
    fileHandler.handleData()

    val list1 = List(1, 2, 3)
    val list2 = List(1, 2, 3)
    val list = List(list1, list2).flatMap(x => x.map(x => x * 2))
    val m = list.reduce(_ + _)
    //    val p = list.partition(x => x % 2 != 0)
    val p = list.sum
    println(p)
  }


}
