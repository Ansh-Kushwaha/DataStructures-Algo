// 1 | BubbleSort
// Author : Ansh Kushwaha | 09/01/2023

/* Algorithm :
 * 		1.) Run a nested loop to traverse the input array using two variables i and j, such that 0 <= i < n1 and 0 <= j < n-i-1 
 * 		2.) If arr[j] is greater than arr[j+1] swap these adjacent elements, else move on
 * 		3.) Print the sorted array
 */

package Sorting;

public class BubbleSort {
	public void bubbleSort(int arr[], int n) {
		boolean flag;
		for(int i = 0; i < n-1; i++) {
			flag = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if(!flag)
				break;
		}
	}
	
	/* Complexity :
	 * 		Best Case : O(n) <- Array already sorted.
	 *  	Worst Case : O(n^2)
	 */
}
