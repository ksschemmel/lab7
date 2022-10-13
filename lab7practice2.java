import java.util.Scanner;
public class lab7practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter Employee Number: ");
int employee = scan.nextInt();
int category = employee;
System.out.println("You are a:");
switch(category) {
case 100:
	System.out.println("General Manager");
	break;
case 200:
	System.out.println("Supervisor");
	break;
case 300: 
	System.out.println("Staff");
	break;
case 400:
	System.out.println("Contractor");
	break;
default:
	System.out.println("Invalid Employee Number");
}
	}

}
