package RMIServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote
{
  // Sum two numbers
  public int sum(int a, int b) throws RemoteException;

  // Get current date
  public java.util.Date getDate() throws RemoteException;

}

