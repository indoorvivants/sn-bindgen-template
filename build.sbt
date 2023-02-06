scalaVersion := "3.2.2"
enablePlugins(ScalaNativePlugin, BindgenPlugin)

import bindgen.interface.Binding

bindgenBindings := Seq(
  Binding(
    baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "header.h",
    "lib_check",
    cImports = List("header.h")
  )
)
