package RMIServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer
{
  public static Registry registry;

  public RMIServer() throws RemoteException
  {
  }

  public static void main(String[] args)
  {
    System.out.println("RMI server starts");
        /*
        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new SecurityManager());
        }
        */
    try
    {
      // Create a server registry at default port 1099
      registry = LocateRegistry.createRegistry(1099);
      System.out.println("RMI registry created");

      // Register the service by a name
      String serviceName = "Compute";
      RMIInterfaceImplementation remoteEngine = new RMIInterfaceImplementation();
      Naming.rebind("//localhost/" + serviceName, remoteEngine);
      System.out.println("Compute engine bound in registry");
    }
    catch (Exception e)
    {
      System.err.println("Exception:" + e);
    }
  }
}


