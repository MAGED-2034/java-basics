/**
 * This class was created  to test java annotataions.
 * @Override will generate compile error if there is not method from supperClass or Interface to override.
 * @Deprecated(since = "", forRemoval = boolean) 
 * @SuppressWarrnings take parameters like unused
 * @SuppressWarnings({"unused", "deprecation"}) we can use multi level annotaion.
 * Annotation can annotate Classes, Member variables and Methods. 
 * You cannot put them into method body - this is syntactically incorrect. 
 *
 *
 */

package topics.annotation;

public class Annotation {
	
	private String name = "MAGED";
	private int level = 1;

      	public Annotation (String name, int level) {
		this.name = name;
		this.level = level;
	}
	

	//setters and getters.
	public String getName () {
		return this.name;
	}
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return this.level;
	}

	public void  setLevel(int level) {
		this.level = level;
	}


	@Deprecated(since = "3.0", forRemoval = false)
	public static String greet(String st) {
		return "Hi!, " + st;
	}


	//test annotation deprcated with value true.
        @Deprecated(since = "5.0", forRemoval = true)
        public static void printNothing() {
                System.out.println("Unused static method");
        }

	@SuppressWarnings({"unused", "deprecation"})
	public void printGreetings() {
		System.out.printf("\033[0;31m%s\n", greet(this.name));
	}
		



 }
