// 4 | MergeSort
// Author : Ansh Kushwaha | 10/01/2023

/* Algorithm :
 *  MergeSort :
 *  	1.) if r > l, find the middle point to divide the array into halves : mid = (l + r) / 2;
 *		2.) Call mergeSort for first half.
 *		3.) Call mergeSort for second half.
 *		4.) Merge both halves sorted in setp 2 and 3.
 */

package sorting;

public class MergeSort {
	public void merge(int arr[], int low, int mid, int high) {
		int l = mid - low + 1;
		int r = high - mid;
		int lArr[] = new int[l];
		int rArr[] = new int[r];
		
		//Copying values into left and right subarrays.
		for(int i = 0; i < l; i++)
			lArr[i] = arr[low + i];
		for(int j = 0; j < r; j++)
			rArr[j] = arr[mid + 1 + j];
		
		//Merging arrays
		int i = 0, j = 0, k = low;
		while(i < l && j < r) {
			if(lArr[i] <= rArr[j])
				arr[k++] = lArr[i++];
			else
				arr[k++] = rArr[j++];
		}
		
		while(i < l)
			arr[k++] = lArr[i++];
		
		while(j < r)
			arr[k++] = rArr[j++];
	}
	
	public void mergeSort(int arr[], int low, int high) {
		if(low < high) {
			int mid = low + (high - low)/2; //or (low + high)/2
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	/* Complexity :
	 * 		Auxiliary Space : O(n)
	 * 		Time Complexity : O(nlogn)
	 */
}
