import org.scalatest.FlatSpec
import org.scalatest._
import Matchers._
import grizzled.slf4j.Logger

class Abcdef extends FlatSpec {

    "The Scala language" must "add correctly" in {
      val sum = 1 + 1
      System.err.println("Error msg")
      Console.err.println("Goodbye, World!")

      Console.setOut(Console.err)
      println("Goodbye, World")

      val logger = Logger(classOf[Abcdef])
      logger.error("some error")

      assert(sum === 2)

    }

  it must "subtract correctly" in {
    val diff = 4 - 1
    assert(diff === 3)
  }

  it must "multiply correctly" in {
    val diff = 4 * 1
    assert(diff === 4)
  }
}