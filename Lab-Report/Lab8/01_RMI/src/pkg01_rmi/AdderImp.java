package pkg01_rmi;
import java.rmi.*;
import java.rmi.server.*;


public class AdderImp extends UnicastRemoteObject implements Adder{
//public class AdderImp implements Adder{
	AdderImp() throws RemoteException
//        AdderImp()
	{
//            super();
	}
	public int add(int a, int b) throws RemoteException
	{
            return a+b;
	}
}