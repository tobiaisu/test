package me.tobiaisu.objects;

public class Count {
	private static int count;

	public static void addCount() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Number of objects: " + count;
	}
}
