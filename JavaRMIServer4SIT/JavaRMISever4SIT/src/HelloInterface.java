import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote
{
	public void printMessage() throws RemoteException;
}
