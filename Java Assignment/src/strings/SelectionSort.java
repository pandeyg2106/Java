package strings;

public class SelectionSort {
	
	
	public int[] selectionSort(int[] arr){
		
		for(int i=0;i<arr.length-1;i++){
			int index_of_smallest_value = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[index_of_smallest_value]>arr[j]){
					index_of_smallest_value = j;
				}						
			}
			int temp = arr[index_of_smallest_value];
			arr[index_of_smallest_value] = arr[i];
			arr[i] = temp;
			System.out.println("After "+(i+1)+" iteration");
			printArray(arr);			
		}
		return arr;
	}
	
	public static void printArray(int[] input){
		for(int i =0; i<input.length;i++){
			System.out.print(input[i]+",");
		}
		System.out.println("\n");
	}
		
	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 3 };
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(array);
	}

}
