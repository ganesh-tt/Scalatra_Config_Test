import com.example.app._
import com.typesafe.config.ConfigFactory
import org.scalatra._
import jakarta.servlet.ServletContext
import org.slf4j.Logger

import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    context.mount(new MyScalatraServlet, "/*")

    val config2 = ConfigFactory.load()

    val logger = org.slf4j.LoggerFactory.getLogger("RandomLogger")

    val allEntries = config2.entrySet()

   val listStr=  allEntries.toList.mkString("\n")
    logger.error(listStr)
  }
}
