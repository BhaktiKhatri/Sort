package Sort;

import java.util.Arrays;

class SelectionSort 
{ 
    public static void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        System.out.println("arr: "+Arrays.toString(arr)+" n: "+n);
        
        // One by one move boundary of unsorted subarray 
        for(int i=0; i<n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            
            System.out.println("i: "+i+" arr[i]: "+arr[i]+" min_idx: "+min_idx);
            
            for(int j = i+1; j < n; j++) { 
            	
            	System.out.println("j: "+j+" arr[j]: "+arr[j]+" min_idx: "+min_idx+" arr[min_idx]: "+arr[min_idx]);
                
            	if(arr[j] < arr[min_idx]) { 
                    min_idx = j; 
                }
            }
            System.out.println("i: "+i+" arr[i]: "+arr[i]+" min_idx: "+min_idx+" arr[min_idx]: "+arr[min_idx]);
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
            
            System.out.println("arr: "+Arrays.toString(arr));
        } 
    } 
  
    // Prints the array 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        //SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        sort(arr); 
        System.out.println("Sorted array"); 
        printArray(arr); 
    } 
} 
