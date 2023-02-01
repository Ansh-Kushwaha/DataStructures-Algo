// 2 | InsertionSort
// Author : Ansh Kushwaha | 09/01/2023

/* Algorithm :
 * 		1.) If it is the first element then assume it is already sorted.
 * 		2.) Pick the next element, and store it separately in a key.
 * 		3.) Now, compare the key with all elements in the sorted array.
 * 		4.) If the element in the sorted array is smaller than the current element(key), then move to the next element. Else, shift greater elements in the array towards the right.
 * 		5.) Insert the element (key) into its correct position in the sorted array.
 * 		6.) Repeat until the array is sorted. 
 */

package sorting;

public class InsertionSort {
	public void insertionSort(int arr[], int n) {
		int key, i, j;
		for(i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	/* Complexity :
	 *  	Best Case : O(n) <- Array already sorted.
	 *  	Worst Case : O(n^2) <- Array sorted in reverse order.
	 */
}
