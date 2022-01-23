scalaVersion := "3.1.1"
enablePlugins(ScalaNativePlugin, BindgenPlugin)

Bindgen.bindings := { builder =>
  builder.define(
    baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "header.h",
    "lib_check",
    cImports = List("header.h")
  )
}
