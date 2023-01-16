
public class MergeSort implements Strategy {
	   public void sort(int[] numbers) {
	        System.out.println("sorting array using merge sort strategy");
	        System.out.println(" le tableau avant le tri par fusion ");
	        for(int i=0; i < numbers.length; i++){
	            System.out.print("   "+numbers[i] + " ");
	        }
	        sort(numbers,0, numbers.length-1);
	        
	        
	        System.out.println("\n le tableau apès le tri par fusion");
	        for(int i=0; i < numbers.length; i++){
	            System.out.print("   "+numbers[i] + " ");
	        }
	        System.out.println();
	    }

	    
	    void sort(int arr[], int m, int n) {
	        if (m < n) {
	            // Find the middle point
	            int s = (m+n)/2;

	            // Sort first and second halves
	            sort(arr, m, s);
	            sort(arr , s+1, n);

	            // Merge the sorted halves
	            merge(arr, m, s, n);
	        }
	    }


	    
	    void merge(int arr[], int l, int m, int r) {
	        // Find sizes of two subarrays to be merged
	        int l1 = m - l + 1;
	        int l2 = r - m;

	        /* Create temp arrays */
	        int L[] = new int [l1];
	        int R[] = new int [l2];

	        /*Copy data to temp arrays*/
	        for (int i=0; i<l1; ++i)
	            L[i] = arr[l + i];
	        for (int j=0; j<l2; ++j)
	            R[j] = arr[m + 1+ j];


	        /* Merge the temp arrays */

	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;

	        // Initial index of merged subarray array
	        int k = l;
	        while (i < l1 && j < l2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        /* Copy remaining elements of L[] if any */
	        while (i < l1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        /* Copy remaining elements of R[] if any */
	        while (j < l2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

}
