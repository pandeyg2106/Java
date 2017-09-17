package interview_essentials;

public class BubbleSort {

	static int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 3 };
	int temp;

	public void bubbleSort(int[] a) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("After "+(i+1)+" iteration");
			printArray(arr);
		}
	}
	
	public static void printArray(int[] input){
		for(int i =0; i<input.length;i++){
			System.out.print(input[i]+",");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		System.out.println("Input Array:");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("\n");
		obj.bubbleSort(arr);
		
	}

}
