package org.practice.client;

import java.rmi.Naming;

import org.practice.server.Search;

/**
 * Program : ClientRequest.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ClientRequest {

	public static void main(String[] args) {
		String answer,value="Reflection in Java";
        try
        {
            Search access = (Search)Naming.lookup("rmi://localhost:1900"+"/geeksforgeeks");
            answer = access.query(value);
            System.out.println("Article on " + value + " " + answer + " at GeeksforGeeks");
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }

	}

}
