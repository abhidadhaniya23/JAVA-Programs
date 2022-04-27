import java.util.*;

// Function:Array() //create array data of size 10 Array(int size)
// create array of size size Array(int data[])
// initialize array with parameter array void Reverse _an _array () 
//reverse element of an array int Maximum _of _array ()
// find maximum element of array int Average_of _array() 
//find average of element of array void Sorting () 
//sort element of array void display() 
//display element of array int search(int no) 
//search element and return index else return -1 int size(); 
//return size of an array Use all the function in main method. Create different objects with different constructors.

class Array {
    int size = 3;
    Scanner scan = new Scanner(System.in);
    int arr[][] = new int[size][size];

    Array() {
        System.out.print("\nEnter 3x3 matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Your 3x3 Matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void transpose() {
        System.out.println("\nTranspose Matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public void multiplication() {
        System.out.println("\nMultiplication of Matrix : ");

    }
}

class Arr {
    public static void main(String[] args) {
        Array method1 = new Array();
        method1.transpose();
    }
}
