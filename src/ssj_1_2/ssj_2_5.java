package ssj_1_2;

import java.util.Scanner;

public class ssj_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a integer for seconds: ");
	int seconds = input.nextInt();
	int minutes = seconds / 60;
	int remainingSeconds = seconds % 60;
	System.out.println(seconds + " seconds is " + minutes +" minutes and " + remainingSeconds + " seconds");
	}

}
