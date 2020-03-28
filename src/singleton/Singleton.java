package singleton;

public final class Singleton {
	private static final Singleton singleton = new Singleton();
	private static int i;

	private Singleton() {
		System.out.println("Hi I was created once");
	}

	public static Singleton getSingleton() {
		i++;
		return singleton;
	}

	public static void calls() {
		System.out.println("the method has been called: "+i+" times");
	}



}
