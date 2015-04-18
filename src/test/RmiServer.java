package test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*/如果设置了安全管理,则需要policy.txt配置文件
		if (null == System.getSecurityManager()) {
			System.setSecurityManager(new RMISecurityManager());
		}
		//*/
		try {
			HelloWordInterface hwi = new HelloWord();
			LocateRegistry.createRegistry(9999);
			Naming.rebind("rmi://localhost:9999/HelloWordService", hwi);
			System.out.println("RMI Server start...");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
