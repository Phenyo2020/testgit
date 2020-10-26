import java.util.Scanner;

public class Reverse{
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Word to reverse");
	String str = sc.next();
	StringBuilder str2 = new StringBuilder();
	str2.append(str);
	str2.reverse();
	System.out.println("Word reversed :" +str2);
	}
}