package views.admin.mlproposals

import org.specs2.mutable.After
import org.specs2.mutable.Specification
import org.specs2.specification.AfterExample
import org.specs2.specification.BeforeExample
import org.specs2.specification.Scope

// CAUSION:: parallel test collapt the var value.
class ParallelSpec extends Specification with BeforeExample with AfterExample {
  @volatile var onTest = false

  def before = {
    println("==== before on parallel test ====")
    onTest = true
  }
  def after = {
    println("==== after on parallel test ====")
    onTest = false 
  }

  "ParallelSpec" should {
    "test1" in new BeforeAfterScope {
      println("para test 1")
      onTest === true
    }
    "test2" in {
      println("para test 2")
      onTest === true
    }
  }
  "ParallelSpec2" should {
    "test3" in {
      println("para test 3")
      onTest === true
    }
    "test4" in {
      println("para test 4")
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
