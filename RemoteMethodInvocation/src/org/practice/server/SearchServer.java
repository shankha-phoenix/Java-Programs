package org.practice.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Program : SearchServer.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class SearchServer {

	public static void main(String[] args) {
		try
        {
            Search obj = new SearchQuery();
 
            LocateRegistry.createRegistry(1900);
 
            Naming.rebind("rmi://localhost:1900"+"/geeksforgeeks",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
	}

}
