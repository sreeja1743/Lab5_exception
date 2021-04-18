package Lab5;

@SuppressWarnings("serial")
public class Age extends Exception{
	private final  int age;
	
    public Age(int age) {
    	this.age = age;
    }
    public String toString() {
    	return "Not eligible because age is "+age;
    }
}
