import lib_check.functions.*
import lib_check.types.*
import scala.scalanative.unsafe.Zone

@main def hello =
  Zone { implicit z =>
    val hello = Hello.apply(25, 135.0)
    println(s"Result is: ${resolve(!hello, 42)}");
  }
