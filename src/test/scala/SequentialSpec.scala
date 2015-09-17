package views.admin.mlproposals

import org.specs2.mutable.After
import org.specs2.mutable.Specification
import org.specs2.specification.AfterExample
import org.specs2.specification.BeforeExample
import org.specs2.specification.Scope

class SequentialSpec extends Specification with BeforeExample with AfterExample {

  sequential

  def before = {
    println("==== before on sequential test ====")
  }
  def after = {
    println("==== after on sequential test ====")
  }

  "SequentialSpec" should {
    "always true" in new BeforeAfterScope {
      println("seq test 1")
      true === true
    }
    "always true again" in {
      println("seq test 2")
      true === true
    }
  }
  "SequentialSpec2" should {
    "return true" in {
      println("seq test 3")
      true === true
    }
    "return true again" in {
      println("seq test 4")
      true === true
    }
  }

  trait BeforeAfterScope extends Scope with After {
    println("**** before on scope ****")

    def after = {
      println("**** after on Scope ****")
    }
  }
}
