package Sort;

import java.util.Arrays;

// Java program for implementation of Heap Sort
//https://www.youtube.com/watch?v=MtQL_ll5KhQ

public class HeapSort 
{ 
	public static void sort(int arr[]) { 
		int n = arr.length; 

		System.out.println("arr: "+Arrays.toString(arr)+" n: "+n);
		
		// Build heap (rearrange array) 
		for(int i=n / 2 - 1; i >= 0; i--) {
			System.out.println("i: "+i);
			
			heapify(arr, n, i); 
		}
		
		System.out.println("arr: "+Arrays.toString(arr)+" n: "+n);
		
		// One by one extract an element from heap 
		for(int i=n-1; i>=0; i--) {
				System.out.println("arr[0]: "+arr[0]+" i: "+i+" arr[i]: "+arr[i]+" arr: "+Arrays.toString(arr));
			
				// Move current root to end 
				int temp = arr[0]; 
				arr[0] = arr[i]; 
				arr[i] = temp; 
	
				// call max heapify on the reduced heap 
				heapify(arr, i, 0); 
		} 
		System.out.println("arr: "+Arrays.toString(arr)+" n: "+n);
	} 

	// To heapify a subtree rooted with node i which is 
	// an index in arr[]. n is size of heap 
	public static void heapify(int arr[], int n, int i) { 
		System.out.println("arr: "+Arrays.toString(arr)+" n: "+n+" i: "+i);
		
		int largest = i; // Initialize largest as root 
		int l = 2*i + 1; // left = 2*i + 1 
		int r = 2*i + 2; // right = 2*i + 2 
		
		System.out.println("largest: "+largest+" l: "+l+" r: "+r);

		// If left child is larger than root 
		if(l < n && arr[l] > arr[largest]) {
			largest = l; 
		}

		System.out.println("largest: "+largest+" l: "+l+" r: "+r);
		
		// If right child is larger than largest so far 
		if (r < n && arr[r] > arr[largest]) {
			largest = r; 
		}
		
		System.out.println("largest: "+largest+" l: "+l+" r: "+r);
		System.out.println("arr: "+Arrays.toString(arr)+" n: "+n+" i: "+i);
		
		// If largest is not root 
		if (largest != i) { 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			// Recursively heapify the affected sub-tree 
			heapify(arr, n, largest); 
		} 
		
		System.out.println("arr: "+Arrays.toString(arr)+" n: "+n+" i: "+i);
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int n = arr.length; 

		HeapSort ob = new HeapSort(); 
		sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
	} 
} 
