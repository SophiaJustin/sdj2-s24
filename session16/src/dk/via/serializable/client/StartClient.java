package dk.via.serializable.client;

import dk.via.serializable.shared.Expression;
import dk.via.serializable.shared.Math;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartClient {
    public static void main(String[] args) throws IOException, NotBoundException {
        // Step 1: Get the registry
        Registry registry = LocateRegistry.getRegistry(1099);
        // Step 2: Lookup the remote object
        // Step 3: Cast the proxy to the remote interface
        Math math = (Math) registry.lookup("math");
        // Step 4: Call methods
        Expression expression = new Expression('+', 2, 2);
        double result = math.compute(expression);
        System.out.println(result);
   }
}
