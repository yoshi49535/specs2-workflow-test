import org.specs2.mutable.After
import org.specs2.mutable.Specification
import org.specs2.mutable.BeforeAfter
import org.specs2.specification.Scope

/*
 * This not works proper. "after" run on after before, even any test is not executed yet
 */
class BeforeAfterAllSpec extends Specification {
  var onTest = false

  step {
    println("step before on BeforeAfter")
    onTest = true
  }

  "BeforeAfterAllSpec" should {
    "test1" in new BeforeAfterScope {
      println("all test 1")
      onTest === true
    }
    "test2" in {
      println("all test 2")
      onTest === true
    }
  }

  step {
    println("step middle on BeforeAfter")
  }

  "BeforeAfterAllSpec2" should {
    "test3" in {
      println("all test 3")
      onTest === true
    }
    "test4" in {
      println("all test 4")
      onTest === true
    }
  }

  trait BeforeAfterScope extends Scope with After {
    println("**** before on scope ****")

    def after = {
      println("**** after on Scope ****")
    }
  }

  step {
    println("step after on BeforeAfter")
    onTest = false
  }
}

