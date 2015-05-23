package itake

sealed trait Term

object Term {
  type Var = String
}

case class INT(value: Int) extends Term
case class BOOL(value: Boolean) extends Term
case class FUN(param: Term.Var, body: Term) extends Term
case class VAR(name: Term.Var) extends Term
case class APP(fn: Term, arg: Term) extends Term
case class IF(testCondition: Term, trueBranch: Term, falseBranch: Term) extends Term
case class LET(binding: Term.Var, value: Term, body: Term) extends Term
