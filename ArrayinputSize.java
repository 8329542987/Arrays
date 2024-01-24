import java.util.*;

public class ArrayinputSize 
{

	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	
        	int[] numbers = acceptNumbers(size, scanner);

	        // Find greater and smallest numbers
	        int greater = findGreater(numbers);
	        int smallest = findSmallest(numbers);
	
		System.out.println("-------------------------------------------------- Display result -----------------------------------------");
	        // Display results
	        System.out.println("Greater number: " + greater);
	        System.out.println("Smallest number: " + smallest);

	        // Sort the array in ascending order
	        int[] ascendingOrder = sortAscending(numbers.clone()); // Pass a clone to avoid modifying the original array
	        System.out.println("Ascending order: ");
	        printArray(ascendingOrder);
	
	        // Sort the array in descending order	
	        int[] descendingOrder = sortDescending(numbers.clone()); // Pass a clone to avoid modifying the original array
        	System.out.println("Descending order: ");
        	printArray(descendingOrder);
    	}

	// Function to accept numbers from the user and return the array
	public static int[] acceptNumbers(int size, Scanner scanner) 
	{
        	int[] arr = new int[size];
        	for (int i = 0; i < arr.length; i++) 
		{
        		System.out.print("Enter Element " + (i + 1) + ": ");
            		arr[i] = scanner.nextInt();
     		}
        	return arr;
    	}

	// Function to find the greater number
	public static int findGreater(int[] arr) 
	{
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) 
		{
	        	if (arr[i] > max) 
			{
                		max = arr[i];
            		}
        	}
        	return max;
    	}

        // Function to find the smallest number
        public static int findSmallest(int[] arr)
	{
        	int min = arr[0];
        	for (int i = 1; i < arr.length; i++) 
		{
        		if (arr[i] < min) 
			{
                		min = arr[i];
            		}
        	}
       		return min;
    	}

        // Function to sort the array in ascending order
	public static int[] sortAscending(int[] arr) 
	{
        	for (int i = 0; i < arr.length - 1; i++) 
		{
        		for (int j = i + 1; j < arr.length; j++) 
			{
	        	        if (arr[i] > arr[j]) 
				{
				        // swap arr[i] and arr[j]
			                int temp = arr[i];
                	 		arr[i] = arr[j];
                	    		arr[j] = temp;
                		}
           		}
        	}
        	return arr;
    	}

    	// Function to sort the array in descending order
    	public static int[] sortDescending(int[] arr) 
	{
        	for (int i = 0; i < arr.length - 1; i++) 
		{
        		for (int j = i + 1; j < arr.length; j++) 
			{
                		if (arr[i] < arr[j]) 
				{
                			// swap arr[i] and arr[j]
               			        int temp = arr[i];
              			        arr[i] = arr[j];
                			arr[j] = temp;
                		}
            		}
        	}
       		return arr;
    	}

    	// Function to print an array
    	public static void printArray(int[] arr)
	{
        	for (int num : arr) 
		{
            		System.out.print(num + " ");
        	}
        	System.out.println();
    	}
}
