// 6 | HeapSort
// Author : Ansh Kushwaha | 10/01/2023

/* Algorithm : 
 * 		1.) Build a max heap from the input data.
 * 		2.) At this point, the maximum element is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of the heap by 1.
 * 			Finally, heapify the root of the tree.
 * 		3.) Repeat step 2 while the size of the heap is greater than 1.
 */

package Sorting;

public class HeapSort {
	private void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1; // left child
		int r = 2 * i + 2; // right child
		
		//If left child if larger than root
		if(l < n && arr[l] > arr[largest])
			largest = l;
		if(r < n && arr[r] > arr[largest])
			largest = r;
		
		//If largest is not root
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			//Recursively heapify the affected subtree
			heapify(arr, n, largest);
		}
		
	}
	
	public void heapSort(int arr[], int n) {
		for(int i = n / 2 - 1; i >= 0; i--)
			heapify(arr,n , i);
		
		//One by one extract root element from the heap
		for(int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			//call heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}
	
	/* Complexity :
	 * 		Average Case : O(logn)
	 */
}
