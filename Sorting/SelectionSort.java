// 3 | SelectionSort
// Author : Ansh Kushwaha | 10/01/2023

/* Algorithm :
 * 		1.) Initialize a variable minIdx to 0 and.
 * 		2.) Traverse the array to find the minimum element in the array.
 * 		3.) While traversing if any element smaller than minIdx is found, then swap both the values.
 * 		4.) Then, increment minIdx to point to the next element.
 * 		5.) Repeat until array is sorted.
 */

package Sorting;

public class SelectionSort {
	public void selectionSort(int arr[], int n) {
		int minIdx;
		for(int i = 0; i < n-1; i++) {
			minIdx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIdx])
					minIdx = j;
			}
			if(minIdx != i) {
				int temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			}
		}
	}
	
	/* Complexity :
	 * 		Average Case & Worst Case : O(n^2)
	 */
}
