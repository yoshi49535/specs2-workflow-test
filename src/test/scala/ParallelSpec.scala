package views.admin.mlproposals

import org.specs2.mutable.After
import org.specs2.mutable.Specification
import org.specs2.specification.AfterExample
import org.specs2.specification.BeforeExample
import org.specs2.specification.Scope

class ParallelSpec extends Specification with BeforeExample with AfterExample {

  def before = {
    println("==== before on parallel test ====")
  }
  def after = {
    println("==== after on parallel test ====")
  }

  "ParallelSpec" should {
    "always true" in new BeforeAfterScope {
      println("para test 1")
      true === true
    }
    "always true again" in {
      println("para test 2")
      true === true
    }
  }
  "ParallelSpec2" should {
    "return true" in {
      println("para test 3")
      true === true
    }
    "return true again" in {
      println("para test 4")
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
