Part 1 – Debugging Scenario
Design a debugging scenario, and write your report as a conversation on EdStem. It should have:

The original post from a student with a screenshot showing a symptom and a description of a guess at the bug/some sense of what the failure-inducing input is. (Don’t actually make the post! Just write the content that would go in such a post)

Student:
Hello! I am working on a program to filter string lists in-order by words that match "moon" (ignore case). This is my code so far:

<pre>
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.List;

class ListExamples {
  static List<String> filter(List<String> list) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(s.equalsIgnoreCase("moon")) {
        result.add(0, s);
      }
    }
    return result;
  }
      
public static void main(String[] args)
{
    List<String> input = Arrays.asList("Moon", "MOO", "moon", "MOON");
    List<String> filtered = ListExamples.filter(input);
    for(int i =0; i &#60 filtered.size();i++)
    {
        if(i==filtered.size()-1)
        {
            System.out.println(filtered.get(i));
            break;
        }
        System.out.print(filtered.get(i)+", ");

    }
}
}
</pre>

Output:
  ![image](https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/59d1972b-9db0-4168-a03c-b67c85dfddf2)

My symptom is that the filtered input array is printing with the correct contents, but somehow in the reverse order. I'm guessing that this must have something to do with how the array is being re-populated, but I don't see how my code is failing to add in the correct order. For every in-order iteration, a string is added to the result, as it appears. Am I misunderstanding something about what I'm trying to do here? Is my populating method completely incorrect?




A response from a TA asking a leading question or suggesting a command to try (To be clear, you are mimicking a TA here.)

Hi there, I would suggest researching a bit more about the syntax involved in adding a string to a List in java. It seems you have the right idea, but you are correct that there is something you are doing unintentionally related to how you populate the array. However, the error is only apparent on certain failure-inducing input. Try running this code with input `List<String> input = Arrays.asList("Moon", "MOO", "moo")` instead.

Another screenshot/terminal output showing what information the student got from trying that, and a clear description of what the bug is.

Oh, I see it now! After changing the input as you suggested, I got a result array of `("Moon")`, so this isn't something wrong with the correctness or filtering method. After doing further research, I see that by typing `result.add(0, s)`, I in turn was inserting each filtered string at the zero'th index of my result array, which caused the results to be flipped. This is the location of the bug, after all! Thanks for your help.



Notes about the setup:
This bug didn't require knowledge about the directory structure or anything outside of the `ListExamples.java` file being tested. When `List<String> input = Arrays.asList("Moon", "MOO", "moon", "MOON")`, after compiling with `javac ListExamples.java` and running with `java ListExamples`, we triggered the bug. To fix the bug, we changed `result.add(0,s)` to be `result.add(s)`. The result of this change was the result array being in-order as expected. A bash script called run.sh (total of 2 lines- `javac ListExamples.java` and `java ListExamples.java` was created to compile and run the `ListExamples.java` file. This is the result of the run after fixing the bug:

[user@sahara ~]$ bash run.sh
Moon, moon, MOON

Part 2 - Reflection:

The group debugging exercise was very useful for my understanding of team-oriented software engineering. Prior to this class, I had never done any sort of automation. The experience of not only building an autograder, but exercising group development principles, was paramount to my understanding of how the script worked. Viewing other students' code was incredibly helpful in refactoring my own code. I was able to rewrite my code with a more critical eye, because it was easier to spot errors within others' code than my own.
