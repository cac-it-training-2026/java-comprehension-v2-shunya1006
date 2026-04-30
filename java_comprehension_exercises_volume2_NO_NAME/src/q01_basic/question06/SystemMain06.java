package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("input id>>");
			inputId = cr.inputNumber();

			System.out.print("input password>>");
			inputPassword = cr.inputString();

		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		Member member = new Member(inputId, inputPassword, name, age, rank);

		System.out.println("---SHOW MEMBER---");
		member.showMember();
	}

}
