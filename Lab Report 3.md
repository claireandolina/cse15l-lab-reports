Part 1 - Bugs
Bug chosen: method to return a new array with all elements of the input array in reversed order:
```
  // Returns a *new* array with all the elements of the input array in reversed order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```

A failure-inducing input for the buggy program, as a JUnit test and any associated code (write it as a code block in Markdown)
```
  @Test
  public void testReversed() {
    int[] input2 = {1,2,3,4,5};
    int[] input3 = {0,0};
    int[] input4 = {-2,1,7};
    int[] input5 = {1};
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
<img width="1304" alt="Screenshot 2023-11-02 at 10 21 18 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/5e6d2805-497b-4f33-b650-5aa56f9fa758">



The bug, as the before-and-after code change required to fix it (as two code blocks in Markdown)

 Before bug fix:
 ```   
  // Returns a *new* array with all the elements of the input array in reversed order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```
After bug fix:
  ```
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

Why the fix addresses the issue:
  The original code was overriding the current values of the input array with values of the empty array that was meant to be populated. By replacing `arr[i] =  newArray[arr.length-i-1]` with `newArray[i] = arr[arr.length-i-1]` inside the `for`-loop, now the newArray is being fed values from the original array (in reverse) as desired.

Part 2 - Researching Commands
Chosen command: `find` 

`find`

       -maxdepth levels
The `find` will descend at most `levels` (a non-negative integer) levels of directories below the starting-points.

<img width="685" alt="Screenshot 2023-11-02 at 10 28 12 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/8d0142e2-739b-4c9d-a13c-53f611ccafbc">

`-maxdepth` is useful to very explicitly state the endpoint of a search, if you know for certain that the file being searched for cannot be nested beyond a certain level. Using -maxdepth 0 means only apply tests and actions (if specified) to the starting-points themselves.

       -quit
       
Once the file is found, the process will exit immediately (with return value zero if no errors have occurred).

<img width="901" alt="Screenshot 2023-11-02 at 10 41 17 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/b47bf168-efc4-4e3a-ac8c-18022a7a8e7d">
              
One way that `-quit` might be useful is to stop searching the file system immediately once we have found what we want, to prevent uneccessary extra processing. If paired with options like `-print`, like seen above in the second command, we can still be sure that the file has been found.

       `-prune`
If the file is a directory, it will not descend into it during the search.
<img width="1081" alt="Screenshot 2023-11-02 at 11 00 40 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/78d77825-db97-4876-942c-f0b856166b49">
<img width="1192" alt="Screenshot 2023-11-02 at 11 03 50 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/de926e2d-ddf0-4596-951f-668c7109e922">
<img width="511" alt="Screenshot 2023-11-02 at 11 04 27 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/9c4f84a0-cbea-4629-8b83-09a4c4a9d9f5">

`prune` is useful for ignoring all directories that are irrelevant to a search, or may cost too much to be searched through due to large size. You could use `prune` to skip a directory and all files and directories under it, and print the names of the other files found.

       -type c
Returns in output only if file is of type c, where c = {b=block, c=character, d=directory, p=named pipe, f=regular file, l=symbolic link, s=socket, D=door}.

<img width="658" alt="Screenshot 2023-11-02 at 11 17 31 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/62fd763a-e1ab-440b-a7c5-a60ff001b529">
<img width="718" alt="Screenshot 2023-11-02 at 11 18 32 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/4cf659b3-8e3e-4192-adf5-46c896a09176">

This is useful to narrow your recursive search to a specific extension, but also to get an overview of what filetypes are not within your search (to search for more than one type at once, you can supply the combined list of type letters separated by a comma `,').

<href = "https://man7.org/linux/man-pages/man1/find.1.html">Source for the above commands.</href>

