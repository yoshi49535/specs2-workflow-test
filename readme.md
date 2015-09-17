Output of Spec test should be below

````
> test
[info] Compiling 2 Scala sources to /Users/aokiyoshi/Workspace/volare/apps/test/specs2/target/scala-2.10/test-classes...
==== before on parallel test ====
==== before on parallel test ====
==== before on sequential test ====
==== before on parallel test ====
==== before on parallel test ====
para test 4
para test 2
para test 3
**** before on scope ****
para test 1
**** before on scope ****
seq test 1
**** after on Scope ****
**** after on Scope ****
==== after on parallel test ====
==== after on sequential test ====
==== before on sequential test ====
seq test 2
==== after on parallel test ====
==== after on sequential test ====
==== after on parallel test ====
==== after on parallel test ====
==== before on sequential test ====
seq test 3
==== after on sequential test ====
==== before on sequential test ====
seq test 4
==== after on sequential test ====
[info] ParallelSpec
[info] 
[info] ParallelSpec should
[info] + always true
[info] + always true again
[info] 
[info] ParallelSpec2 should
[info] + return true
[info] + return true again
[info] 
[info] Total for specification ParallelSpec
[info] Finished in 28 ms
[info] 4 examples, 0 failure, 0 error
[info]  
[info] SequentialSpec
[info] 
[info] SequentialSpec should
[info] + always true
[info] + always true again
[info] 
[info] SequentialSpec2 should
[info] + return true
[info] + return true again
[info] 
[info] Total for specification SequentialSpec
[info] Finished in 47 ms
[info] 4 examples, 0 failure, 0 error
[info]  
[info] Passed: Total 8, Failed 0, Errors 0, Passed 8
[success] Total time: 2 s, completed 2015/09/17 12:11:3
````
