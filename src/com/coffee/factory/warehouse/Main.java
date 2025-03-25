package com.coffee.factory.warehouse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.coffee.factory.serialization.ObjectsWriterReader;


public class Main {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, FileNotFoundException, IOException, ClassNotFoundException {
		CaffeeWareHouse cwh = new CaffeeWareHouse();
		CaffeeWareHouse.MainIngredients cmain = new CaffeeWareHouse.MainIngredients();
		CaffeeWareHouse.AdditionalIngredients cadd = new CaffeeWareHouse.AdditionalIngredients();
		CaffeeWareHouse cwhouse = new CaffeeWareHouse(cmain, cadd);
		CaffeeWareHouse cwhouse01 = new CaffeeWareHouse(new CaffeeWareHouse.MainIngredients(CaffeeBeans.ROBUSTA, 700, 570, 1000, 500), cadd);
		System.out.println(cwhouse);
		System.out.println(cwhouse01);
		
		int cof01 = cwhouse.getMainIngredients().getCaffeeBeansARABICAAmountGr();
		int cof02 = cwhouse.getMainIngredients().getCaffeeBeansROBUSTAAmountGr();
		int cof03 = cwhouse.getMainIngredients().getCaffeeBeansARABICAAmountGr();
		System.out.println(cwhouse.getMainIngredients().getCaffeeBeansARABICAAmountGr());
		cwhouse.getMainIngredients().setCaffeeBeansARABICAAmountGr(500);
		System.out.println(cof01);
		System.out.println(cof02);
		System.out.println(cof03);
		System.out.println(cwhouse);
		System.out.println(CaffeeWareHouse.AdditionalIngredients.class.arrayType());
		System.out.println(Arrays.toString(CaffeeWareHouse.AdditionalIngredients.class.getDeclaredFields()));
		System.out.println(Arrays.toString(CaffeeWareHouse.AdditionalIngredients.class.getDeclaredFields()));
		System.out.println(CaffeeWareHouse.AdditionalIngredients.class.getDeclaredFields().toString());
		System.out.println(CaffeeWareHouse.AdditionalIngredients.class.getClass().getTypeName());
		Field[] fields = CaffeeWareHouse.AdditionalIngredients.class.getDeclaredFields();
		ArrayList<String> fieldNames  = new ArrayList<>();
		ArrayList<String> ingredients  = new ArrayList<>();
		for (Field f : fields) {
			f.setAccessible(true);
			String name = f.getName();
			fieldNames.add(name);
			Class<?> clazz = f.getType();
			Type gtype = f.getGenericType();
			//int value = f.getInt(name);
			System.out.println("field: " + f);
			System.out.println("fieldName: " + name + ", class: " + clazz + ", genericType: " + gtype + ", value?: " + 0);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
		System.out.println(fieldNames);
		for (String s : fieldNames) {
			s = s.replace("AmountGr", "").replace("AmountMl", "").replace("AmountUnits", "");
			ingredients.add(s);
		}
		System.out.println(fieldNames);
		System.out.println(ingredients);
		Field[] mfields = CaffeeWareHouse.MainIngredients.class.getDeclaredFields();
		Arrays.stream(mfields).forEach(field -> field.setAccessible(true));
		ArrayList<String> mfieldNames  = Arrays.stream(mfields)
				.map(field -> field.getName())
				.collect(Collectors.toCollection(ArrayList::new));
		Arrays.stream(mfields).forEach(field -> field.setAccessible(true));
		ArrayList<String> mingredients = Arrays.stream(mfields)
				.map(field -> field.getName())
				.map(str -> str.replace("AmountGr", "").replace("AmountMl", "").replace("AmountUnits", ""))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(mfields);
		System.out.println(mfieldNames);
		System.out.println(mingredients);
		System.out.println(cwhouse);
		System.out.println(cwhouse.takeIngredient(IngredientType.MAIN, "caffeeBeansROBUSTA", 20));
		System.out.println(cwhouse.takeIngredient(IngredientType.MAIN, "sugar", 25));
		System.out.println(cwhouse.takeIngredient(IngredientType.MAIN, "milk", 15));
		cwhouse.takeIngredient(IngredientType.MAIN, "water", 10000);
		System.out.println(cwhouse.takeIngredient(IngredientType.MAIN, "water", 10000));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "coconutMilk", 15));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "whiskey", 50));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "chocolateSyrup", 25));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "marshmallows", 50));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "eggYalk", 1));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "hazelnutOil", 15));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "coconutOil", 10));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "cloves", 5));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "darkChocolate", 50));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "ice", 150));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "salt", 50));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "cardamon", 25));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "nutmeg", 7));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "cayennePepper", 5));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "ginger", 15));
		System.out.println(cwhouse.takeIngredient(IngredientType.ADDITIONAL, "iceCream", 150));
		System.out.println("AFTER TAKEINGREDIENT: " + cwhouse);
		System.out.println(cwhouse.takeIngredient(IngredientType.MAIN, "water", 10000));
		System.out.println(cwhouse.getMainIngredients().getWaterAmountMl());
		/*cwhouse.addIngredient(IngredientType.ADDITIONAL, "iceCream", 250);
		cwhouse.addIngredient(IngredientType.MAIN, "caffeeBeansARABICA", 1520);
		cwhouse.addIngredient(IngredientType.MAIN, "sugar", 1000);
		cwhouse.addIngredient(IngredientType.MAIN, "milk", 2500);
		cwhouse.addIngredient(IngredientType.MAIN, "water", 50000);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "coconutOil", 100);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "cloves", 120);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "darkChocolate", 500);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "ice", 400);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "salt", 150);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "cardamon", 250);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "nutmeg", 48);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "cayennePepper", 55);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "ginger", 55);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "iceCream", 500);*/
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("caffeewarehouse.ser");
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(cwhouse);
			objectOutputStream.flush();
		}
		fileOutputStream.close();
		System.out.println("Object was successfully serialized!");
		
		FileInputStream fileInputStream = new FileInputStream("caffeewarehouse.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		CaffeeWareHouse caffeeWareHouse = (CaffeeWareHouse) objectInputStream.readObject();
		System.out.println(caffeeWareHouse);
		objectInputStream.close();
		fileInputStream.close();
		System.out.println("BEFORE ADDINGREDIENT: " + cwhouse);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "iceCream", 250);
		cwhouse.addIngredient(IngredientType.MAIN, "caffeeBeansARABICA", 1520);
		cwhouse.addIngredient(IngredientType.MAIN, "sugar", 1000);
		cwhouse.addIngredient(IngredientType.MAIN, "milk", 2500);
		cwhouse.addIngredient(IngredientType.MAIN, "water", 50000);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "coconutOil", 100);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "cloves", 120);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "darkChocolate", 500);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "ice", 400);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "salt", 150);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "cardamon", 250);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "nutmeg", 48);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "cayennePepper", 55);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "ginger", 55);
		cwhouse.addIngredient(IngredientType.ADDITIONAL, "iceCream", 500);
		System.out.println("AFTER ADDINGREDIENT: " + cwhouse);
		
		ObjectsWriterReader objectsWriterReader = new ObjectsWriterReader();
		objectsWriterReader.serialize(cwhouse, "addition-caffee-warehouse.ser");
		objectsWriterReader.deSerialize("addition-caffee-warehouse.ser");
		
		cwhouse.takeIngredient(IngredientType.MAIN, "caffeeBeansARABICA", 3010);
		cwhouse.takeIngredient(IngredientType.MAIN, "caffeeBeansARABICA", 3010);
	}
	
	
}