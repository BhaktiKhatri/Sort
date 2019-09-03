package Sort;

import java.util.Arrays;

// Java program for implementation of QuickSort 
class QuickSort 
{ 
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	public static int partition(int arr[], int low, int high) {
		System.out.println("arr: "+Arrays.toString(arr)+" low: "+low+" high: "+high);
		
		int pivot = arr[high]; 
		int i = (low-1); // index of smaller element 
		
		System.out.println("pivot: "+pivot+" high: "+high);
		
		for (int j=low; j<high; j++) { 
			System.out.println("j: "+j+" pivot: "+pivot+" i: "+i);
			
			// If current element is smaller than or 
			// equal to pivot 
			if(arr[j] <= pivot) { 
				i++; 
				
				System.out.println("i: "+i+" arr[i]: "+arr[i]+" j: "+j+" arr[j]: "+arr[j]);

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
			System.out.println("arr: "+Arrays.toString(arr));
		} 
		System.out.println("arr: "+Arrays.toString(arr)+" i: "+i+" low: "+low+" high: "+high);

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 
		
		System.out.println("arr: "+Arrays.toString(arr));

		return i+1; 
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	public static void sort(int arr[], int low, int high) { 
		System.out.println("arr: "+Arrays.toString(arr)+" low: "+low+" high: "+high);
		
		if (low < high) { 
			
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			System.out.println("arr: "+Arrays.toString(arr)+" pi: "+pi+" low: "+low+" high: "+high);
			
			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			
			System.out.println("arr: "+Arrays.toString(arr)+" pi: "+pi+" low: "+low+" high: "+high);
			
			sort(arr, pi+1, high); 
			
			System.out.println("arr: "+Arrays.toString(arr)+" pi: "+pi+" low: "+low+" high: "+high);
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) { 
		int arr[] = {10, 7, 8, 9, 1, 5}; 
		int n = arr.length; 

		//QuickSort ob = new QuickSort(); 
		sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr); 
	} 
} 
