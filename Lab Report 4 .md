Log into ieng6
 <pre>[candolin@its-cseb240-31]:~:2$ ssh cs15lfa23ab@ieng6.ucsd.edu </pre>
Keys pressed:
 &#60;s> &#60;s> &#60;h> &#60;space> &#60;Ctrl+v> &#60;left>(15x) &#60;backspace> &#60;backspace> &#60;a> &#60;b> &#60;Enter>
I copied the url from Week 3 webpage, then moved the cursor to the __ portion of the url given (to be filled in with the student's individual ID letters). I then removed these dashes, replaced them with 'ab', and pressed  &#60;Enter> to log into ieng6.


Clone your fork of the repository from your Github account (using the SSH URL)
 <pre>[cs15lfa23ab@ieng6-201]:~3$ git clone git@github.com:claireandolina/lab7fork.git </pre>
Keys pressed:  &#60;g> &#60;i> &#60;t> &#60;Space> &#60;c> &#60;l> &#60;o> &#60;n> &#60;e> &#60;Space> &#60;Ctrl+v> &#60;Enter>
I copied the URL from my forked week 7 lab repository (under ssh link). Then I typed "git clone " and pasted the SSH URL into the terminal, and pressed enter to clone my fork of the repository from my Github account.


Run the tests, demonstrating that they fail
 <pre>[cs15lfa23ab@ieng6-201]:lab7fork:92$ javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
[cs15lfa23ab@ieng6-201]:lab7fork:94$ java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests
JUnit version 4.13.2
..E
Time: 0.54
There was 1 failure:
1) testMerge2(ListExamplesTests)
org.junit.runners.model.TestTimedOutException: test timed out after 500 milliseconds
	at ListExamples.merge(ListExamples.java:44)
	at ListExamplesTests.testMerge2(ListExamplesTests.java:19)

FAILURES!!!
Tests run: 2,  Failures: 1
 </pre>
Keys pressed:  &#60;Ctrl+v> &#60;Enter> &#60;Ctrl+v> &#60;Ctrl+e> &#60;backspace>(10x) &#60;L> &#60;i> &#60;s> &#60;t> &#60;E> &#60;x> &#60;a> &#60;m> &#60;p> &#60;l> &#60;e> &#60;s> &#60;T> &#60;e> &#60;s> &#60;t> &#60;s> &#60;Enter>
I copied the javac and java commands with JUnit from Week 4's lesson on testing, one at a time. The second line, I had to erase the filename used in that lesson with the relevant testing filename (ArrayTests -> ListExamplesTests). Then, I pressed enter, resulting in the above output demonstrating failure in one of the test methods.

Edit the code file to fix the failing test
 &#60;j> 43x, 

Keys pressed:  &#60;v> &#60;i> &#60;m> &#60;Space> &#60;L> &#60;i> &#60;s> &#60;t> &#60;E> &#60;x> &#60;a> &#60;m> &#60;p> &#60;l> &#60;e> &#60;s> &#60;T> &#60;e> &#60;s> &#60;t> &#60;s> &#60;Enter> &#60;Shift+G> &#60;k>(6x) &#60;$> &#60;h>(6x) &#60;r> &#60;2> &#60;:> &#60;w> &#60;q>

I first opened ListExamples in the vim by typing "vim ListExamplesTests" and pressing Enter. As the change was located closer to the end of the file, I pressed Shift+G to move cursor to end of the file. I then pressed k 6 times to move up to the line needing to be changed. Once at this line, I pressed $ (Shift+3) to move the cursor to the end of this line. Then, I pressed h 6 times to move to the left 6 times, to center on the exact character needing to be replaced. I pressed r and 2, which changed (replaced) 1 with 2. Now that the index variable had been correctly assigned, I typed ":wq" to exit the vim and save my changes.


Run the tests, demonstrating that they now succeed
 <pre>[cs15lfa23ab@ieng6-201]:lab7fork:103$ javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
[cs15lfa23ab@ieng6-201]:lab7fork:104$ java -cp .:lib/hamcrest-core-1.3.jar:liunit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests
JUnit version 4.13.2
..
Time: 0.023

OK (2 tests)
 </pre>

Keys pressed:  &#60;Up>(11x) &#60;Enter> &#60;Up>(11x) &#60;Enter>
The javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java command was 11 up in the search history, so I used up arrow to access it. Then the java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ... command was 11 up in the history, so I accessed and ran it in the same way.


Commit and push the resulting change to your Github account (you can pick any commit message!)

 <pre>
[cs15lfa23ab@ieng6-201]:lab7fork:108$ git add *  
[cs15lfa23ab@ieng6-201]:lab7fork:108$ git commit -m &quot;Fixed bug- incorrect indreference when incrementing&quot;
[cs15lfa23ab@ieng6-201]:lab7fork:109$ git push
 </pre>

Keys pressed:
&#60;g>&#60;i>&#60;t>&#60;Space>&#60;a>&#60;d>&#60;d>&#60;Space>&#60;*>&#60;Enter>
&#60;g>&#60;i>&#60;t>&#60;Space>&#60;c>&#60;o>&#60;m>&#60;m>&#60;i>&#60;t>&#60;->&#60;m>&#60;">(message typed here)&#60;">
&#60;g>&#60;i>&#60;t>&#60;Space>&#60;p>&#60;u>&#60;s>&#60;h>&#60;Enter>
