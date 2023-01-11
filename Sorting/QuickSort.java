// 5 | QuickSort 
// Author : Ansh Kushwaha | 02/01/2023


/* Algorithm :
 * 	Partition :
 * 		1.) We start from the leftmost element and keep track of elements smaller than the pivot as i.
 * 		2.) While traversing, if we find an element smaller than pivot then we swap the current element with arr[i].
 * 		3.) Otherwise we ignore the current element.
 * 	QuickSort :
 * 		1.) if low < high, partition the array and obtain the partitioning index.
 * 		2.) quicksort left partition recursively.
 * 		3.) quicksort right partition recursively.
 */

package sorting;

public class QuickSort {
    public  int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for(int j = low; j <= high - 1; j++) {
        	if(arr[j] < pivot) {
        		i++;
        		int temp = arr[i];
        		arr[i] = arr[j];
        		arr[j] = temp;
        	}
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    public void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    
    /* Complexity :
     * 		Best Case & Average Case : O(nlogn)
     *  	Worst Case : O(n^2) <- Smallest/Largest element as pivot.
     */
}