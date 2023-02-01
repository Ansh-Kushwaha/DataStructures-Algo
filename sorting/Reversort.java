// 7 | Reversort

package sorting;

public class Reversort {
	private void reverse(int arr[], int l, int h) {
		while (l < h) {
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++; h--;
	    }
	}
	
	public void reversort(int arr[], int n) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i; j < n; j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			if(i != min)
				reverse(arr, i, min);
		}
	}
}
