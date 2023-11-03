import java.io.IOException;
import java.net.*;

class Handler implements URLHandler {
    int num = 0;
    StringBuilder str = new StringBuilder();

    public String handleRequest(URI url) {
        if(url.getQuery()==null)
        {
            return null;
        }
        if (url.getQuery().contains("=")){
            String[] parameters = url.getQuery().split("=");
            if (url.getPath().contains("/add-message")) {
                if (parameters[0].equals("s")) {
                    num++;
                    str.append(num+". "+parameters[1]+"\n");
                    return str.toString();
                }
                else{
                    return "Invalid query!";
                }
            }
            else{
                return "Invalid query!";
            }
        }
        else {
            return "404 Not Found!";
        }
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
