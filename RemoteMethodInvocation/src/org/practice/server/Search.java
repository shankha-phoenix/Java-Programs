package org.practice.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Program : Search.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public interface Search extends Remote {
	
	public String query(String search) throws RemoteException;
	
}
