 
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Declare an array of size n
        int[] arr = new int[n];
        
        // Input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) { 
            arr[i] = scanner.nextInt();
        }
        
        // Print the elements of the array
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
