Summary of Commands -
-
Although everything is correct, remember to be more thorough in your explanation and be more formal in your writing. For instace: use with instead of "w/." In addition, check the prompt again and make sure you include everything that is required for each of the categories. For example, you failed to mention any description of " What the working directory was when the command was run." Once you make all of these changes, you should get full points on the resubmission

What the working directory was when the command was run
A sentence or two explaining why you got that output (e.g. what was in the filesystem, what it meant to have no arguments).
Indicate whether the output is an error or not, and if it’s an error, explain why it’s an error.

**cd:**
  * no Arg: Sets working directory to be base one (home)
    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we moved back into the home directory one level up     ("user@sahara ~"). This was the output because the cd command without arguments sends the operator back to the home directory from their original location
    in a sub-directory. The output here is not an error.
    
            [user@sahara ~/lecture1]$ cd
    
            [user@sahara ~]$
    
  * w/ path to directory: Sets working directory to the argument directory path
    When this command was run, the working directory was "user@sahara ~". After the command was run, we moved into the subdirectory within the home folder,
    called lecture1 ("user@sahara ~/lecture1"). This was the output because the cd command with a valid argument (path to a directory) sends the operator inside
    of the indicated directory. The output here is not an error.
    
            [user@sahara ~]$ cd lecture1/
    
            [user@sahara ~/lecture1]$
    
  * w/ path to file: Error- unable to switch directories into a file
        When this command was run, the working directory was "user@sahara ~". After the command was run, we moved into the subdirectory within the home folder,
    called lecture1 ("user@sahara ~/lecture1"). This was the output because the cd command with a valid argument (path to a directory) sends the operator inside
    of the indicated directory. The output here is not an error.
    
            [user@sahara ~/lecture1]$ cd README
    
            bash: cd: README: Not a directory
    
**ls:**

  * no Arg: Lists out all files and directories in current working directory
    
            [user@sahara ~/lecture1]$ ls
    
            Hello.class  Hello.java  messages  README
    
  * w/ path to directory: Lists out all files and directories in argument's directory
    
            [user@sahara ~/lecture1]$ ls messages/
    
            en-us.txt  es-mx.txt  fr.txt  zh-cn.txt
    
  * w/ path to file: Lists out file path of argument
    
            [user@sahara ~/lecture1]$ ls messages/fr.txt
    
            messages/fr.txt
    
    
**cat:**

  * no Arg: Blank, then upon further input, echos
    
            [user@sahara ~/lecture1]$ cat
    
            k
            k
            lk
            lk
            hello
            hello
    

  * w/ path to directory: Error- can't display file contents of a directory
    
                [user@sahara ~/lecture1]$ cat messages/
    
                cat: messages/: Is a directory
    
    
  * w/ path to file: Displays file contents of argument
    
            [user@sahara ~/lecture1]$ cat Hello.java
    
              import java.io.IOException;
              import java.nio.charset.StandardCharsets;
              import java.nio.file.Files;
              import java.nio.file.Path;
              
              public class Hello {
                public static void main(String[] args) throws IOException {
                  String content = Files.readString(Path.of(args[0]), StandardCharse
              ts.UTF_8);    
                  System.out.println(content);
                }



