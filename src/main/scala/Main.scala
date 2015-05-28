package itake

import parser.Parser
import signature.Signature

object Main {
  def main(args: Array[String]): Unit = {
    println("isZero: " + Signature.forType(Infer.typeOf(Parser.parse("""
      fn isZero =>
        if isZero 1
        then 2
        else 3
    """))))
  }
}
