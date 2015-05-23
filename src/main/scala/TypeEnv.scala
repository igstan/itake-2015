package itake

case class TypeEnv(bindings: Map[Term.Var, Type]) {
  def set(name: Term.Var, ty: Type): TypeEnv = {
    TypeEnv(bindings + (name -> ty))
  }

  def get(name: Term.Var): Option[Type] = {
    bindings.get(name)
  }
}
