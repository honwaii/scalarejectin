package com.honwaii.scala.domain

class StaticRuleInfo(val shopId: String, val rules: List[Rule]) {

  override def toString = s"StaticRuleInfo($shopId,$rules)"
}
