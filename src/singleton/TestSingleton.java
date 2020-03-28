package singleton;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton mySingleton = Singleton.getSingleton();
		Singleton mySingletonTwo = Singleton.getSingleton();
		Singleton mySingletonThree = Singleton.getSingleton();
		Singleton mySingletonFour = Singleton.getSingleton();
		Singleton mySingletonFive = Singleton.getSingleton();
		Singleton mySingletonSix = Singleton.getSingleton();
		Singleton mySingletonSeven = Singleton.getSingleton();

		Singleton.calls();

		System.out.println("Program finished");
	}
}
