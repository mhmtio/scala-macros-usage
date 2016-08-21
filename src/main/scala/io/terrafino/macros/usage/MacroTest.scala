package io.terrafino.macros.usage

import io.terrafino.macros.SimpleMacros._

object MacroTest extends App {

  implicit class Tree(tree: String) {
    def set(adoValue: (String, Int)): Int = {
      println(s"setting ${tree}/${adoValue._1} = ${adoValue._2}")
      1
    }
  }

  implicit class Ado(ado: String) {
    def to(value: Int): (String, Int) = (ado, value)
  }


  //"CONSOLIDATION_C0".set("C0.EQY.1" to 1)

  tree("CONSOLIDATION_C0") {
    "C0.EQY.1" to 100
    "C0.EQY.2" to 200 
    "C0.EQY.3" to 300 
  }
}