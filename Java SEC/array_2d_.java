// This program demonstrates the creation and manipulation of a 2D array in Java. It initializes a 3x3 array, fills it with the sum of its indices, and then prints the elements of the array to the console.
public class array_2d_ {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; 

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j; 
            }
        }

        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}