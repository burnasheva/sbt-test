import org.scalatest.FlatSpec
import org.scalatest._
import Matchers._

@Ignore 
class ExampleSpec extends FlatSpec {

    "The Scala language" must "add correctly" in {
      val sum = 1 + 1
      assert(sum === 3)
    }

  it must "subtract correctly" in {
    val diff = 4 - 1
    assert(diff === 4)
  }
}