Part 1
Show the code for your StringServer, and two screenshots of using /add-message.
![screencapture-github-claireandolina-cse15l-lab-reports-blob-main-StringServer-java-2023-10-16-18_18_33](https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/983e4ed5-98bc-45ef-8a56-7265c2f9afa5)

For each of the two screenshots, describe:

Which methods in your code are called?
StringServer.main()->Server.start(int port, URLHandler new Handler())->Server.createContext("/", new ServerHttpHandler(handler)). Once this method has been called, the request entrypoint has been established, and once there is a request, the method "handle(final HttpExchange Exchange)" will be called in Server.java. This method calls an overloaded version of handleRequest(URI url) within our Handler.java class.

<img width="618" alt="Screenshot 2023-10-16 at 6 16 43 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/1ac4d3f9-2ceb-4f7f-b3c4-9c24d9ac3edc">

In this example of the handleRequest(URI url) method being called, its argument is the URI localhost:4000/add-message?s=How%20are%20you?. This URI's query is parsed from it, and the string that is desired to add is appended to an empty StringBuilder with a counter +". ", and returned to the browser. The value of int num was incremented once (it started at zero but was added to for the displayed list). Also, the StringBuilder itself changed from having a .toString() of "" to "1. How are you?/n" <- /n denoting that enter has been pressed.


<img width="610" alt="Screenshot 2023-10-16 at 6 17 23 PM" src="https://github.com/claireandolina/cse15l-lab-reports/assets/108210076/46a200a0-dd3c-4932-b278-a696d467c672">

In this example of the handleRequest(URI url) method being called, its argument is the URI localhost:4000/add-message?s=What%27s%20uppp. This URI's query is parsed from it, and the string that is desired to add is appended to a StringBuilder with a value of "1. How are you?/n" and a counter +". ", and returned to the browser. The value of int num was incremented once (it is now having a value of 2). Also, the StringBuilder itself changed from having a .toString() of "1. How are you?/n" to "1. How are you?/n2. What's uppp/n" <- /n denoting that enter has been pressed.


Part 2
Using the command line, show with ls and take screenshots of:

The path to the private key for your SSH key for logging into ieng6 (on your computer or on the home directory of the lab computer)
The path to the public key for your SSH key for logging into ieng6 (within your account on ieng6)
A terminal interaction where you log into ieng6 with your course-specific account without being asked for a password.


Part 3
I learned a lot about encryption/decryption strategies and the real purpose of having a public and private-facing key. By using ssh-keygen in terminal during this week's exploration and doing some further investigation on what is actually going on when this command is called, I learned how to log into a remote server without having to use a passcode each time!
