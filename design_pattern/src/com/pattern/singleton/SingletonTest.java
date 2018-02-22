package com.pattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getValue());
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setValue("singleton2");
		System.out.println(singleton2.getValue());
	}

}

/**
 * 单例模式
 * 	保证程序中只有该类的一个实例。
 */
final class Singleton {
	private String value;
	private static Singleton instance = new Singleton("singleton");
	
	private Singleton(String value) {
		this.value = value;
	}
	
	public static Singleton getInstance(){
		/*if(instance == null){
			instance = new Singleton("singleton");
		}*/
		return instance;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
