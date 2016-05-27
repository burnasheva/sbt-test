import org.scalatest.FlatSpec
import org.scalatest._
import Matchers._

class Abcdef extends FlatSpec {

    "The Scala language" must "add correctly" in {
      val sum = 1 + 1
      System.out.println("Error msg")
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