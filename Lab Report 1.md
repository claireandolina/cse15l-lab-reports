Summary of Commands -
-
cd:
  * no Arg:
            [user@sahara ~/lecture1]$ cd
            [user@sahara ~]$ 
  * w/ path to directory:
            [user@sahara ~]$ cd lecture1/
            [user@sahara ~/lecture1]$
  * w/ path to file:
            [user@sahara ~/lecture1]$ cd README
            bash: cd: README: Not a directory
ls:
  * no Arg:
            [user@sahara ~/lecture1]$ ls
            Hello.class  Hello.java  messages  README
  * w/ path to directory:
            [user@sahara ~/lecture1]$ ls messages/
            en-us.txt  es-mx.txt  fr.txt  zh-cn.txt
  * w/ path to file:
            [user@sahara ~/lecture1]$ ls messages/fr.txt
            messages/fr.txt
    
cat:
  * no Arg:
            [user@sahara ~/lecture1]$ cat
            k 
            k
            lk
            lk
            hello
            hello

  * w/ path to directory:
                [user@sahara ~/lecture1]$ cat messages/
                cat: messages/: Is a directory
    
  * w/ path to file:
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



