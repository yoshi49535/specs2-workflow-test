Output of Spec test should be below

````
> test
[info] Set current project to spec test (in build file:/Users/aokiyoshi/Workspace/volare/apps/test/specs2/)
step before on BeforeAfter
all test 2
**** before on scope ****
all test 1
**** after on Scope ****
step middle on BeforeAfter
all test 3
all test 4
step after on BeforeAfter
[info] BeforeAfterAllSpec
[info] 
[info] BeforeAfterAllSpec should
[info] + test1
[info] + test2
[info] 
[info] BeforeAfterAllSpec2 should
[info] + test3
[info] + test4
[info] 
[info] Total for specification BeforeAfterAllSpec
[info] Finished in 46 ms
[info] 4 examples, 0 failure, 0 error
[info]  
==== before on parallel test ====
==== before on parallel test ====
==== before on parallel test ====
==== before on parallel test ====
para test 2
para test 3
para test 4
==== after on parallel test ====
**** before on scope ****
para test 1
==== after on parallel test ====
**** after on Scope ****
==== after on parallel test ====
==== after on parallel test ====
[info] ParallelSpec
[info] 
[info] ParallelSpec should
[info] x test1
[error]    the value is not equal to 'true' (ParallelSpec.scala:23)
[info] 
[info] x test2
[error]    the value is not equal to 'true' (ParallelSpec.scala:27)
[info] 
[info] 
[info] ParallelSpec2 should
[info] + test3
[info] x test4
[error]    the value is not equal to 'true' (ParallelSpec.scala:37)
[info] 
[info] 
[info] Total for specification ParallelSpec
[info] Finished in 1 ms
[info] 4 examples, 3 failures, 0 error
[info]  
==== before on sequential test ====
**** before on scope ****
seq test 1
**** after on Scope ****
==== after on sequential test ====
==== before on sequential test ====
seq test 2
==== after on sequential test ====
==== before on sequential test ====
seq test 3
==== after on sequential test ====
==== before on sequential test ====
seq test 4
==== after on sequential test ====
[info] SequentialSpec
[info] 
[info] SequentialSpec should
[info] + test1
[info] + test2
[info] 
[info] SequentialSpec2 should
[info] + test3
[info] + test4
[info] 
[info] Total for specification SequentialSpec
[info] Finished in 7 ms
[info] 4 examples, 0 failure, 0 error
[info]  
[error] Failed: Total 12, Failed 3, Errors 0, Passed 9
[error] Failed tests:
[error]   ParallelSpec
[error] (test:test) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 2 s, completed 2015/09/17 15:56:17
````
