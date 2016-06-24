/**
 * 
 */
package org.practice;

/**
 * Program : RealImage.java
 * Author : Shankhadeep Ghosh
 * Email : shankhadeep.ghosh@gmail.com
 */
public class RealImage implements Image {
	
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadFromDisk(filename);
	}
	
	private void loadFromDisk(String filename2) {
		System.out.println("Loading from Disk :- " +filename);
		display();
	}

	@Override
	public void display() {
		System.out.println("Displaying image :- " +filename);

	}

}
