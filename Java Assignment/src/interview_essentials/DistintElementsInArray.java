package interview_essentials;

import java.util.HashSet;
public class DistintElementsInArray {

	static int[] array = { 2, 3, 2, 3, 4, 5, 4, 7, 8 };

	public void checkForDistict(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
				System.out.print(array[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		DistintElementsInArray obj = new DistintElementsInArray();
		System.out.println("Input Array is \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n\nDistinct Array is\n");

		obj.checkForDistict(array);
	}

}
