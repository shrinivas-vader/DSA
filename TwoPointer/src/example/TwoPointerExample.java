package example;

public class TwoPointerExample {
	
	public static boolean checkHaspairSum(int[] arr, int target) {
		
		int left = 0;
		int right = arr.length-1;
		
		
		
		while(left<right) {
			int sum = arr[left] + arr[right];
			if(sum==target) {
				return true;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6,7,8};
		
		int target = 11;
		System.out.println(checkHaspairSum(arr,target));

	}

}
