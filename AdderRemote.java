import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements Adder {

    // Constructor must declare RemoteException
    AdderRemote() throws RemoteException {
        super();
    }

    // Implement the add method
    public int add(int x, int y) {
        return x + y;
    }
}
