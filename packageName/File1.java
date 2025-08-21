package packageName;

import java.util.Scanner;
public class File1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Verb: ");
		String verb = scan.nextLine();
		System.out.println("Adjective: ");
		String adjective = scan.nextLine();
		System.out.println("Noun: ");
		String noun = scan.nextLine();
		
		System.out.println("They wanted to " + verb + " a " + adjective + " " + noun + " for the science fair.");

	}

}
