package com.coffee.factory.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.coffee.factory.warehouse.CaffeeWareHouse;
import com.coffee.factory.warehouse.IngredientType;

public class ObjectsWriterReader implements Serializer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7817298134010208645L;
	private Object object;
	private String filePathName;
	private FileOutputStream fileOutputStream;
	private ObjectOutputStream objectOutputStream;
	private FileInputStream fileInputStream;
	private ObjectInputStream objectInputStream;
	
	public ObjectsWriterReader() {}
	
	public ObjectsWriterReader(Object object, String filePathName) {
		this.object = object;
		this.filePathName = filePathName;
		try {
			this.fileOutputStream = new FileOutputStream(filePathName);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			this.objectOutputStream = new ObjectOutputStream(this.fileOutputStream);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ObjectsWriterReader(String filePathName) {
		try {
			this.fileInputStream = new FileInputStream(filePathName);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			this.objectInputStream = new ObjectInputStream(this.fileInputStream);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getFilePathName() {
		return filePathName;
	}

	public void setFilePathName(String filePathName) {
		this.filePathName = filePathName;
	}

	public FileOutputStream getFileOutputStream() {
		return fileOutputStream;
	}

	public void setFileOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
		this.fileOutputStream = new FileOutputStream(this.filePathName);
	}

	public ObjectOutputStream getObjectOutputStream() {
		return objectOutputStream;
	}

	public void setObjectOutputStream(ObjectOutputStream objectOutputStream) throws IOException {
		this.objectOutputStream = new ObjectOutputStream(this.fileOutputStream);
	}

	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(FileInputStream fileInputStream) throws FileNotFoundException {
		this.fileInputStream = new FileInputStream(this.filePathName);
	}

	public ObjectInputStream getObjectInputStream() {
		return objectInputStream;
	}

	public void setObjectInputStream(ObjectInputStream objectInputStream) {
		this.objectInputStream = objectInputStream;
	}

	@Override
	public void serialize(Object object, String filePathName) {
		ObjectsWriterReader objectsWriterReader = new ObjectsWriterReader(object, filePathName);
		objectsWriterReader.getFileOutputStream();
		try {
			objectsWriterReader.getObjectOutputStream().writeObject(object);
			System.out.println("Your Object was successfully serialized and written in the file: " + filePathName);
			objectsWriterReader.getObjectOutputStream().flush();
			objectsWriterReader.getObjectOutputStream().close();
			objectsWriterReader.getFileOutputStream().close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public Object deSerialize(String filePathName) {
		Object object = null;
		ObjectsWriterReader objectsWriterReader = new ObjectsWriterReader(filePathName);
		objectsWriterReader.getFileInputStream();
		try {
			object = (Object) objectsWriterReader.getObjectInputStream().readObject();
			System.out.println("AFTER SERIALIZATION: " + object);
		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			objectsWriterReader.getObjectInputStream().close();
			objectsWriterReader.getFileInputStream().close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return object;
	}
	
	public static void main(String[] args) {
		CaffeeWareHouse.MainIngredients cmain = new CaffeeWareHouse.MainIngredients();
		CaffeeWareHouse.AdditionalIngredients cadd = new CaffeeWareHouse.AdditionalIngredients();
		CaffeeWareHouse cwhouse = new CaffeeWareHouse(cmain, cadd);
		System.out.println("BEFORE SERIALIZATION: " + cwhouse);
		ObjectsWriterReader objectsWriterReader = new ObjectsWriterReader();
		objectsWriterReader.serialize(cwhouse, "cwhouse.ser");
		objectsWriterReader.deSerialize("cwhouse.ser");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		cwhouse.takeIngredient(IngredientType.MAIN, "caffeeBeansARABICA", 15);
		cwhouse.takeIngredient(IngredientType.MAIN, "caffeeBeansROBUSTA", 25);
		cwhouse.takeIngredient(IngredientType.MAIN, "water", 50);
		cwhouse.takeIngredient(IngredientType.MAIN, "sugar", 15);
		cwhouse.takeIngredient(IngredientType.MAIN, "milk", 20);
		System.out.println("BEFORE SERIALIZATION: " + cwhouse);
		objectsWriterReader.serialize(cwhouse, "cwhouse.ser");
		objectsWriterReader.deSerialize("cwhouse.ser");
		

	}

}
