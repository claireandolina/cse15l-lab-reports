/*
In your Edstem workspace, make a new file called SearchEngine.java. In it, 
implement a web server (like NumberServer.java) that tracks a list of strings.
It should support a path for
1. adding a new string to the list, and a path for
2. querying the list of strings and returning a list of all strings that have a given substring.
*/

import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    //ArrayList str = new ArrayList();
    StringBuilder str = new StringBuilder();


/*
/add?s=anewstringtoadd

/add?s=pineapple

/add?s=apple

/search?s=app
(would return pineapple and apple)
*/

    public String handleRequest(URI url) {
        if url.getQuery().contains("="){
            String[] parameters = url.getQuery().split("=");
            if (url.getPath().contains("/add-message")) {
                if (parameters[0].equals("s")) {
                    num++;
                    str.append(num+" "+parameters[1]+\n);
                    return String.format(str);
                    //"'%s' is now added to the master string! It's now %d", parameters[1], str);
                }
                else{
                    return "Invalid query!";
                }
            }
            else if (url.getPath().contains("/search")) {
                StringBuilder queryResult = new StringBuilder();
                for string value : str {
                    if(value.contains(parameters[1]))
                    {
                        queryResult.append(value +", ");
                    }
                }
                return queryResult.toString()
            }
            else{
                return "Invalid query!";
            }
        }
        else {
            return "404 Not Found!";
        }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
