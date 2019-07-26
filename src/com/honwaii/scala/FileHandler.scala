package com.honwaii.scala

import scala.io.Source

class FileHandler(path: String) {

  def handleData(): Unit = {
    val text = Source.fromFile(path).mkString
    val lines = text.split("\r\n")
    val result = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.length)
    for (r <- result)
      println(r)
  }




}
