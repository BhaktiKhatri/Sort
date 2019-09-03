package Sort;

import java.util.Arrays;

class BubbleSort { 
    
	public static void bubbleSort(int arr[]) { 
    	System.out.println("arr: "+Arrays.toString(arr));
        int n = arr.length; 
        boolean swapped; 

        for(int i=0; i<n-1; i++) { 
            swapped = false; 

            for(int j=0; j<n-i-1; j++) { 
                
            	System.out.println("i: "+i+" j: "+j+" arr[i]: "+arr[i]+" arr[j]: "+arr[j]+" arr[j+1]: "+arr[j+1]);
            	
            	if(arr[j] > arr[j+1]) { 
    
            		// swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    swapped = true; 
                } 
            }
            
            if (swapped == false) 
                break; 
        }
    } 
  
    /* Prints the array */
    static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        //BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        bubbleSort(arr); 
        System.out.println("Sorted array"); 
        printArray(arr); 
    } 
} 