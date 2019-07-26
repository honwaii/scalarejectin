package com.honwaii.scala

class Student(id: Int, name: String, gender: String) {

  def register(): Unit = {
    println("student " + name + " registered:")
    println("id=" + id)
    println("name=" + name)
    println("gender=" + gender)
  }

}

