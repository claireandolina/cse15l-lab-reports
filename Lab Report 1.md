Summary of Commands -
-

**cd:**
  * no Arg: *Sets working directory to be base one (home)*
    
    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we moved back into the home directory one level
    up ("user@sahara ~"). This was the output because the cd command without arguments sends the operator back to the home directory from their original
    location in a sub-directory. The output here is not an error.
    
            [user@sahara ~/lecture1]$ cd
    
            [user@sahara ~]$
    
  * with path to directory: *Sets working directory to the argument directory path.*
    
    When this command was run, the working directory was "user@sahara ~". After the command was run, we moved into the subdirectory within the home folder,
    called lecture1 ("user@sahara ~/lecture1"). This was the output because the cd command with a valid argument (path to a directory) sends the operator inside
    of the indicated directory. The output here is not an error.
    
            [user@sahara ~]$ cd lecture1/
    
            [user@sahara ~/lecture1]$

    
  * with path to file: *Error- unable to switch directories into a file*
    
    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we receive an error that the directory we were
    trying to change into (README) was not a directory. This was the output because the README argument signifies a filepath, not a directory path, so this
    is an invalid argument that results in an error. The directory after running is the same as the original directory ("user@sahara ~/lecture1").
    
            [user@sahara ~/lecture1]$ cd README
    
            bash: cd: README: Not a directory
    

**ls:**

  * no Arg: *Lists out all files and directories in current working directory*

    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we remained in the same directory and received an
    output list of all constituents within the current directory, regardless of the file extension or item type (folders, documents, etc). The files
    "Hello.class", "Hello.java", and "README" were inside this directory, along with another subdirectory/folder "messages", so they made up the output. This
    is not an error.
    
            [user@sahara ~/lecture1]$ ls
    
            Hello.class  Hello.java  messages  README
    
  * with path to directory: *Lists out all files and directories in argument's directory*

    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we remained in the same directory and received an
    output list of all constituents within the *argument* directory, "messages/". The files "en-us.txt", "es-mx.txt", "fr.txt", and "zh-cn.txt" were within
    the argument directory, so they made up the output. This is not an error.
    
            [user@sahara ~/lecture1]$ ls messages/
    
            en-us.txt  es-mx.txt  fr.txt  zh-cn.txt
    
  * with path to file: *Lists out file path of argument*

    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we remained in the same directory and received an
    output of the filepath of the argument. Upon further research, using ls with a filepath can display information about the file according to requested
    options (additional parameters). This output is not an error.
    
            [user@sahara ~/lecture1]$ ls messages/fr.txt
    
            messages/fr.txt


**cat:**

  * no Arg: *Blank, then upon further input, echos*

    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we remained in the same directory and received
    back a blank output. The reason for this is that cat will output the contents of the file argument, but since nothing was put as an argument, it outputted
    nothing as well. When I started entering text, it would echo it back to me (taking the text as a parameter to output, and doing so). This output is not an
    error.
    
            [user@sahara ~/lecture1]$ cat
    
            k
            k
            lk
            lk
            hello
            hello
    

  * with path to directory: *Error- can't display file contents of a directory*

    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we receive an error that the filepath we are
    trying to output (messages/) is a directory (not a filepath). This was the output because messages/, being a directory, is not a valid argument for cat,
    which outputs contents of a file. 
    
    
                [user@sahara ~/lecture1]$ cat messages/
    
                cat: messages/: Is a directory
    
    
  * with path to file: *Displays file contents of argument*

    When this command was run, the working directory was "user@sahara ~/lecture1". After the command was run, we received as output the file contents of the
    argument filepath ("Hello.java"). This resulted in the code written in the .java file to display on the screen, as that was what was recorded within it.
    This output is not an error.   
    
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



