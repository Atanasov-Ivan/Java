import java.io.IOException;
//import java.util.Scanner;

public class Console {

	public static String readLine() {
		String input = "";
		// Scanner sc = new Scanner(System.in);
		// input = sc.nextLine();

		while (true) {
			char ch;
			try {
				ch = (char) System.in.read();

				if (ch == '\r') {
					continue;
				} else if (ch == '\n') {
					break;
				} else {
					input += ch;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return input;

	}

	public static String readLine(String prompt) {
		String input = "";
		// Scanner sc = new Scanner(System.in);
		
		
		System.out.print(prompt);
		while (true) {
			char ch;
			try {
				ch = (char) System.in.read();

				if (ch == '\r') {
					continue;
				} else if (ch == '\n') {
					break;
				} else {
					input += ch;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return input;
	}

	public static void printPrompt(String prompt) {
		System.out.println(prompt);
	}

	public static int readInt(String prompt) {
		String input = readLine(prompt);
		int inputInt = Integer.parseInt(input);
		return inputInt;
	}

	public static double readDouble(String prompt) {
		String input = readLine(prompt);
		double inputDouble = Double.parseDouble(input);
		return inputDouble;
	}

	public static long readLong(String prompt) {
		String input = readLine(prompt);
		long inputLong = Long.parseLong(input);
		return inputLong;
	}

	public static String readString(String prompt) {
		String input = readLine(prompt);
		String inputString = input;
		return inputString;
	}

	public static void main(String[] args) {
		// write your code here
	}

}
