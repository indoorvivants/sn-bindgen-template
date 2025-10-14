scalaVersion := "3.3.7"

enablePlugins(ScalaNativePlugin, BindgenPlugin)

import bindgen.interface.Binding

bindgenBindings := Seq(
  Binding(
    baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "header.h",
    "lib_check"
  ).withCImports(List("header.h"))
)
