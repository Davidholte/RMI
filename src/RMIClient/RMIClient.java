package RMIClient;

import java.rmi.Naming;
import java.util.Scanner;
import RMIServer.*;

public class RMIClient
{
  public static void main(String[] args)
  {
    int su;
    java.util.Date today;

    try
    {
      // Get the input from the Client console
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter two integer numbers: ");
      int a = inp.nextInt();
      int b = inp.nextInt();

      // Lookup in the registry for the service interface you know by name
      RMIInterface obj = (RMIInterface) Naming.lookup("//localhost/Compute");

      // Send requests, get responses
      su = obj.sum(a,b);
      today = obj.getDate();

      // Print the results on the Client console
      System.out.println("Server says: sum=" + su);
      System.out.println("Server says: today is " + today);
    }
    catch (Exception e)
    {
      System.out.println("Exception: " + e);
    }
  }

}
