package org.ksk.dp;

/**
 * @author ksk
 * 
 *         Singleton pattern contains only -- >> private constructor and a field
 *         to hold its result, and a static accessor method with a name like
 *         getInstance().
 * 
 * 
 */
public class SingletonPattern {

	public static SingletonPattern pattern = null;

	/**
	 * A private Constructor prevents any other class from instantiating.
	 */
	private SingletonPattern() {
	};

	public static SingletonPattern getInstance() {

		if (pattern == null)
			pattern = new SingletonPattern();
		return pattern;
	}

	/**
	 * testing method
	 */
	public void display() {

		System.out
				.println("This method is got called from only single instance");

	}

	public static void main(String[] args) {

		SingletonPattern pattern = SingletonPattern.getInstance(); // you can't
																	// use new
																	// to
																	// instantiate
																	// new
																	// object
																	// because
																	// of
																	// private
																	// constructor
		pattern.display(); // testing

	}
}
