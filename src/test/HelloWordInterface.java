package test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWordInterface extends Remote {
	public String say(String word) throws RemoteException;
}
