Part 1 - Bugs
Choose one of the bugs from lab 4.
Bug chosen: method to return a new array with all elements of the input array in reversed order.

Provide:

A failure-inducing input for the buggy program, as a JUnit test and any associated code (write it as a code block in Markdown)
```
  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1,2,3,4,5};
    int[] input3 = {0,0};
    int[] input4 = {-2,1,7};
    int[] input5 = {1};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{0,0}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{7,1,-2}, ArrayExamples.reversed(input4));
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input5));
  }
  ```
An input that doesn’t induce a failure, as a JUnit test and any associated code (write it as a code block in Markdown)
```
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  ```
The symptom, as the output of running the tests (provide it as a screenshot of running JUnit with at least the two inputs above)

The bug, as the before-and-after code change required to fix it (as two code blocks in Markdown)
 ```   
  // Returns a *new* array with all the elements of the input array in reversed order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  
  // Returns a *new* array with all the elements of the input array in reversed order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) 
    { //
      newArray[i] = arr[arr.length-i-1]; //this should be say newArray[arr.length-i-1] = arr[i]. setting
                                       // old array equal to new array values now (which is empty)
      //new array's first index = arr's last index
    }
    return newArray;
  }
```

Briefly describe why the fix addresses the issue.
  The original code was overriding the current values of the input array with values of the empty array that was meant to be populated. By replacing `arr[i] =  newArray[arr.length-i-1]` with `newArray[i] = arr[arr.length-i-1]` inside the `for`-loop, now the newArray is being fed values from the original array (in reverse) as desired.

Part 2 - Researching Commands
Consider the commands less, find, and grep. Choose one of them. Online, find 4 interesting command-line options or alternate ways to use the command you chose. To find information about the commands, a simple Web search like “find command-line options” will probably give decent results. There is also a built-in command on many systems called man (short for “manual”) that displays information about commands; you can use man grep, for example, to see a long listing of information about how grep works. Also consider asking ChatGPT!

For example, we saw the -name option for find in class. For each of those options, give 2 examples of using it on files and directories from ./technical. Show each example as a code block that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.

That makes 8 total examples, all focused on a single command. There should be two examples each for four different command-line options. Many commands like these have pretty sophisticated behavior possible – it can take years to be exposed to and learn all of the possible tricks and inner workings.

Along with each option/mode you show, cite your source for how you found out about it as a URL or a description of where you found it. See the syllabus on Academic Integrity and how to cite sources like ChatGPT for this class.
