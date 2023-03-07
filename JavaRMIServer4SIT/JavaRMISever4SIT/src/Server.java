import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server
{
	public Server() {}

	public static void main(String[] args)
	{
		try
		{
			HelloImplementation obj = new HelloImplementation();
			HelloInterface stub = 
					(HelloInterface) UnicastRemoteObject.exportObject(obj, 1099);

			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("HelloInterface", stub);
			System.out.print("Servidor em execu��o... ");
		}
		catch(Exception e)
		{
			System.out.println("EXCE��O: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
