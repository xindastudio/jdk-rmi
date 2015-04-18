package test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class RmiClient {

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
			HelloWordInterface hwi = (HelloWordInterface)Naming.lookup("rmi://localhost:9999/HelloWordService");
			System.out.println(hwi.say("世界你好！"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
