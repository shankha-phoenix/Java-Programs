package org.practice.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Program : SearchQuery.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */

public class SearchQuery extends UnicastRemoteObject implements Search {

	private static final long serialVersionUID = 1L;

	protected SearchQuery() throws RemoteException {
		super();
	}

	@Override
	public String query(String search) throws RemoteException {
		String result;
        if (search.equals("Reflection in Java"))
            result = "Found";
        else
            result = "Not Found";
 
        return result;
	}

}
