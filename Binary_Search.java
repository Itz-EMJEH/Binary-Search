/* Description: <Binary search that accepts user input for the array size and elements, sorts the array then searches for the desired target value of the user,
 *displays the low, mid, high and the search direction>
Programmed by: <MARK JOEL DOMINGUITO> <BSIT> <48079> <DATA STRUCTURES AND ALGORITHM>
Last Modified: <09-07-2026>
Version: <version 2.0>
[Acknowledgements: <geeksforgeeks.com, w3schools.com , Claude(Anthropic)and asked for low, high and mid logic > 
to our cherished DSA Instructor Maam Pauline Rivas :3]
*/



import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {
    public static int bSearch(int[] arr, int target, int low, int high) {
        // Base case target is not found
        if (low > high) {
            System.out.println("bSearch(" + low + ", " + high + ", " + target + ")  not found");
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;	

        // If target is found at the middle
        if (arr[mid] == target) {
            System.out.println("bSearch(" + low + ", " + high + ", " + target + ")  mid = " + mid + "  found");
            return mid;
        } else if (target < arr[mid]) {
            // If target is smaller, search the left half
            System.out.println("bSearch(" + low + ", " + high + ", " + target + ")  mid = " + mid + "  search left");
            return bSearch(arr, target, low, mid - 1);
        } else {
            // Otherwise, search the right half
            System.out.println("bSearch(" + low + ", " + high + ", " + target + ")  mid = " + mid + "  search right");
            return bSearch(arr, target, mid + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter elemens
       System.out.print("Number of Elements: "); 
        int n = scanner.nextInt();
        
        //enter elements of the array;
        int[] num = new int[n];
      
        for (int i = 0; i < n ; i++){
            System.out.print("Element " + (i+1) + ": " );
            num[i] = scanner.nextInt();
        }
        
        System.out.println();
        
        //sorting
        Arrays.sort(num);
        
         System.out.print("Sorted array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        
        //ask target value
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        int result = bSearch(num, target, 0 ,num.length - 1);
        
        System.out.println();
        
        //display result
        if (result == -1){
            
            System.out.println("Target not found \nIndex -1 ");
        } else {
            System.out.println("Target found \nindex: " + result );
        } 
    
        
    }
}
