import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name:");
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		if(s.equals("nikhil"))
		{
			System.out.println("Hey Nikhil");
		}
		else if(s.equals("sahil")) 
		{
			System.out.println("Hey Sahil");
		}
		else
		{
			System.out.println("You are not welcome");
		}
		sc.close();
		
	}
	

}
