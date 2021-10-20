package z_buoi8_bai1.controller.Utils;

import java.util.Scanner;


public class ScannerUtils {
	
	public static String readString(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				String result = scanner.nextLine().trim();
				if(result != null & !result.isEmpty()) {
					return result;
				}
			} catch(Exception e) {
				showError(errorMessage);
			}
		}
	}
	private static void showError(String message) {
		System.out.println("Error: "+message);
		
	}
	public static int readInt(Scanner scanner, String errorMessage , int min , int max) {
		while (true) {
			try {
				int a = Integer.parseInt(scanner.nextLine());
				if(a<min || a>max) {
					System.out.println("Ban phai nhap 1 so");
					System.out.println("Moi ban nhap lai: ");
				}
			} catch(Exception e) {
				showError(errorMessage);
			}
		}
	}

}
