import lib_check.all.*
import scala.scalanative.unsafe.Zone

@main def hello =
  Zone:
    val hello = Hello.apply(25, 135.0)
    println(s"Result is: ${resolve(!hello, 42)}");

    println(MY_CONST_1)
