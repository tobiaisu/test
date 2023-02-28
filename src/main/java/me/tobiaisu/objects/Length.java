package me.tobiaisu.objects;

import java.util.Scanner;

public class Length {
	public static float length(Scanner scanner, String name) {
		float length;

		do {
			System.out.print("Set " + name + ": ");
			length = scanner.nextFloat();
		} while (length <= 0);

		return length;
	}

	public static float triangleLength(Scanner scanner, String name, float hypotenuse, float opposite) {
		float length;

		do {
			System.out.print("Set " + name + ": ");
			length = scanner.nextFloat();
		} while (length <= 0 || length >= hypotenuse + opposite);

		return length;
	}
}
