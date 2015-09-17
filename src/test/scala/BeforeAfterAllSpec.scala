package views.admin.mlproposals

import org.specs2.mutable.After
import org.specs2.mutable.Specification
import org.specs2.mutable.BeforeAfter
import org.specs2.specification.Scope

/*
 * This not works proper. "after" run on after before, even any test is not executed yet
 */
class BeforeAfterAllSpec extends Specification with BeforeAfter {
  sequential
  def before = {
    println("==== before on all ====")
  }
  def after = {
    println("==== after on all ====")
  }

  "BeforeAfterAllSpec" should {
    "always true" in new BeforeAfterScope {
      println("all test 1")
      true === true
    }
    "always true again" in {
      println("all test 2")
      true === true
    }
  }
  "BeforeAfterAllSpec2" should {
    "return true" in {
      println("all test 3")
      true === true
    }
    "return true again" in {
      println("all test 4")
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

