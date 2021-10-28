package lab5.agevalidationprogram;
public class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String s){
		System.out.println(s);
	}
}
