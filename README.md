Run this locally on your system 

**Step 1 : Compile the Java Files**
Open a terminal and navigate to the directory containing your .java files. Then
 compile them:
 javac *.java

**Step 2 :  Start the RMI Registry**
In one terminal, start the RMI registry:
 rmiregistry 5000 

**step 3 : Start the Server**
In another terminal, start the server:
 java MyServer

** Step 3 :  Run the Client Application**
Finally, in another terminal, run the client application:
 java MyClient
