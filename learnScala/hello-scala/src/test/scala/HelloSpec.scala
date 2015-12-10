import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "Hello" should "know who to greet" in {
    Hello.who should be === "Activator"
  }
}
