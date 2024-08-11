import java.rmi.*;

public class MyServer {

    public static void main(String args[]) {
        try {
            // Create an instance of AdderRemote
            Adder stub = new AdderRemote();

            // Bind the remote object in the registry
            Naming.rebind("rmi://localhost:5000/binay", stub);

            System.out.println("Server is ready.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
