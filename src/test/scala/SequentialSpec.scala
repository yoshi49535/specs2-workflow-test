import org.specs2.mutable.After
import org.specs2.mutable.Specification
import org.specs2.specification.AfterExample
import org.specs2.specification.BeforeExample
import org.specs2.specification.Scope

class SequentialSpec extends Specification with BeforeExample with AfterExample {

  sequential

  var onTest = false
  def before = {
    println("==== before on sequential test ====")
    onTest = true 
  }
  def after = {
    println("==== after on sequential test ====")
    onTest = false 
  }

  "SequentialSpec" should {
    "test1" in new BeforeAfterScope {
      println("seq test 1")
      onTest === true
    }
    "test2" in {
      println("seq test 2")
      onTest === true
    }
  }
  "SequentialSpec2" should {
    "test3" in {
      println("seq test 3")
      onTest === true
    }
    "test4" in {
      println("seq test 4")
      onTest === true
    }
  }

  trait BeforeAfterScope extends Scope with After {
    println("**** before on scope ****")

    def after = {
      println("**** after on Scope ****")
    }
  }
}
