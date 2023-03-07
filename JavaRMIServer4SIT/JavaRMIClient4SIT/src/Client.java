import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client
{
	public Client() {}

	public static void main(String[] args)
	{
		try
		{
			Registry registry = LocateRegistry.getRegistry(1099);
			HelloInterface stub =
					(HelloInterface) registry.lookup("HelloInterface");
			stub.printMessage();
		}
		catch(Exception e)
		{
			System.out.println("EXCEÇÃO: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
