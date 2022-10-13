import java.util.Scanner;
public class lab7practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter a year:");
int number = scan.nextInt();

if((number %4==0 && number %100!=0) || (number %400==0)) 
{
	System.out.println("With these conditions it is a leap year.");
	}
else
{
System.out.println("The conditions did not meet, enter another year.");
	}
}

}
