package sideprojects;

import java.time.LocalTime;
import java.util.Scanner;

public class timeKillerGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시간 입력(hh:mm:ss) :");
		String dateInput = scan.nextLine();
		LocalTime timeAnswer = LocalTime.parse(dateInput);
		System.out.println(timeAnswer.plusHours(1));
	}
}
