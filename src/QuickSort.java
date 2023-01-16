
public class QuickSort implements Strategy {
	public void sort (int[] numbers) {
		
	
	        System.out.println("sorting array using quick sort strategy");
	        System.out.println("  le tableau avant le tri rapide ");
	        for(int i=0; i < numbers.length; i++){
	            System.out.print("   "+numbers[i] + " ");
	        }
	        quicksort(numbers, 0, numbers.length -1);
	        System.out.println("\n le tableau apès le tri rapide");
	        for(int i=0; i < numbers.length; i++){
	            System.out.print("   "+numbers[i] + " ");
	        }
	        System.out.println();
	    }

	    static void quicksort(int[] arr, int low, int high){
	        if(low < high){
	            int p = partition(arr, low, high);
	            quicksort(arr, low, p-1);
	            quicksort(arr, p+1, high);
	        }
	    }

	    static int partition(int[] arr, int low, int high){
	        int p = low, j;
	        for(j=low+1; j <= high; j++)
	            if(arr[j] < arr[low])
	                swap(arr, ++p, j);

	        swap(arr, low, p);
	        return p;
	    }

	    static void swap(int[] arr, int low, int pivot){
	        int tmp = arr[low];
	        arr[low] = arr[pivot];
	        arr[pivot] = tmp;
	    }
        
    
        
    }


