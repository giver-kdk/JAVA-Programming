package pkg01_rmi;
import java.rmi.*;


public class Server extends AdderImp{
	Server() throws RemoteException{

	}
	public static void main(String[] args)
	{
		try{
			AdderImp skeleton = new AdderImp();

			Naming.rebind("csit", skeleton);
			System.out.println("Server is Ready...");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}