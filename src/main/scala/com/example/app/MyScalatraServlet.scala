package com.example.app

import com.typesafe.config.{ConfigFactory, ConfigValue}
import org.scalatra._

import java.util
import java.util.Map
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

class MyScalatraServlet extends ScalatraServlet {


  val config2 = ConfigFactory.load()
  val port = config2.getInt("myapp.server.port")
  val host = config2.getString("myapp.server.host")

  get("/") {
    views.html.hello()
  }

  get("/config") {
   val abc=  s"Server running on $host:$port"

    val allEntries= config2.entrySet()

    allEntries.toList.mkString("\n")

  }

}
