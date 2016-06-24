/**
 * 
 */
package org.practice;

/**
 * Program : ProxyImage.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class ProxyImage implements Image {

	RealImage realImage;
	private String filename;
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void display() {
		if(realImage == null)
			realImage = new RealImage(filename);
		else
			realImage.display();
	}

}
