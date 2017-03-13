package Refleksja1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		System.out.println("Podaj nazwe klasy: ");
		Scanner sc = new Scanner(System.in);
		String className = sc.next();
		Class<?> c;		//tutaj nie okreslamy typu c, bo nie wiemy co to bedzie, stad ?
		try {
			c = Class.forName("Refleksja1."+className);
			Object object = c.newInstance();	//dajemy Object bo to najbardziej ogolny typ! a nie wiemy co to bedzie 
			String methodName = sc.next();		// newInstance to analogicznie do new Object, ale nie znamy typu!
			String parameterName = sc.next();
			Method setNameMethod = object.getClass().getMethod(methodName, String.class);
			setNameMethod.invoke(object, parameterName);		//metoda invoke dynamicznie wykonuje na danym obiekcie metode

		} catch (ClassNotFoundException e) {
			System.out.println("Takiej klasy nie ma");
		} catch (InvocationTargetException e) {
			e.printStackTrace();

		}
	}

}