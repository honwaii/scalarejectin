package com.honwaii.scala.domain

class Rule(val id: Int, val isAll: Boolean, val terminals: List[String], val times: List[FromDateTo],
           val fences: List[Fence], val inJudge: Int, val inNum: Int, val outJudge: Int,
           val daysOfWeek: Int, val date: FromDateTo
          ) {

  override def toString = s"Rule($id, $isAll, $terminals, $times, $fences, $inJudge, $inNum, " +
    s"$outJudge, $daysOfWeek, $date)"
}
