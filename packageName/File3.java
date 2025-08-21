package packageName;
import java.util.Scanner;

public class File3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		System.out.println("Total Score: " + (score1 + score2 + score3));
		System.out.println("Average Score: " + ((score1 + score2 + score3)/3));
		System.out.println("Stars Earned: " + ((score1 + score2 + score3)%3));
	}

}
