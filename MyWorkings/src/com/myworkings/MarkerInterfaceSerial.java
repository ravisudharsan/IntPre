package com.myworkings;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MarkerInterfaceSerial implements Serializable {
	int id;
	String name;

	MarkerInterfaceSerial(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Seriliazation
		MarkerInterfaceSerial cloneable = new MarkerInterfaceSerial(1, "Ravi");
		FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(cloneable);
		// DeSeriliazation

		FileInputStream fileInputStream = new FileInputStream("xyz.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		MarkerInterfaceSerial a = (MarkerInterfaceSerial) inputStream.readObject();
		System.out.println(a.name);

	}
}
