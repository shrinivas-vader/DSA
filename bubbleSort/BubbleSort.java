package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
//		unsorted Array
//		int[] arr = {2,1,4,5,3,2};

//		sorted Array
		int[] arr = {1,2,3,4,5};
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {

		boolean ifSwap;
		
		//The first loop for iteration. Maximum no. of iterations will same as no. of elements
		for(int i=0;i<arr.length-1;i++){
			ifSwap = false;
			for(int j=0;j<arr.length-1-i;j++){
				//take element & compare it with to its next element
				if(arr[j]>arr[j+1]) {
					int swapNo = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=swapNo;
					ifSwap = true;
				}
			}
			
			System.out.println("Iteration no: "+(i+1));
			for(int k:arr){
				System.out.print(k+",");
			}
			
			System.out.println();

			//If no number swapped then array is sorted. No need for next iterations
			if(ifSwap == false) {
				break;
			}
		}
		
		//Printing final sorted array
		System.out.println("Final Array");
		for(int i:arr){
		System.out.print(i+",");
		}
	}
}
