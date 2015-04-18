package test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWord extends UnicastRemoteObject implements HelloWordInterface {
	private String server;
	private String client;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected HelloWord() throws RemoteException {
		super();
		server = "Server say ";
		client = "Client say ";
	}

	@Override
	public String say(String word) throws RemoteException {
		System.out.println(client + word + " at " + System.currentTimeMillis());
		return server + word + " at " + System.currentTimeMillis();
	}

}
