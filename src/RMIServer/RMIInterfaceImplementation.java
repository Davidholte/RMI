package RMIServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIInterfaceImplementation extends UnicastRemoteObject implements RMIInterface
{
  public RMIInterfaceImplementation() throws RemoteException
  {
    super();
  }

  // provide the interface methods implementation
  public java.util.Date getDate() throws RemoteException
  {
    return new java.util.Date();
  }

  public int sum(int a,int b) throws RemoteException
  {
    return a+b;
  }
}
