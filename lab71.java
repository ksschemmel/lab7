
import java.util.Scanner;

public class lab71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int gas=42;
		if(gas<=25){
			System.out.println("Level less than a quarter of a tank.");
		}
		else if(gas>=26 && gas<=50) {
			System.out.println("Level less than a half of a tank.");
		}
		else if(gas>=51 && gas<=75) {
			System.out.println("Level less than three quarters of a tank");
		}
		else if(gas>=76 && gas<=100) {
			System.out.println("almost a full tank.");
		}
		else {
			System.out.println("invalid.");
			
		}
			
		
	}
}
