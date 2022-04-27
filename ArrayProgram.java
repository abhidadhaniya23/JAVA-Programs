import java.util.*;

class ArrayOperations {
    int arr[] = { 20, 12, 90, 32, 67, 31, 14, 87, 23, 56 };

    public int search(int data, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public void sorting(int arr[]) {
        int index = 0;
        while (index < arr.length) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            index++;
        }
    }

    public void Reverse_an_array(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
    }

    public int Maximum_of_array(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public void display(int arr[]) {
        System.out.print("Array : [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                break;
            }
            System.out.print(" , ");
        }
        System.out.println(" ]");
    }

    public float Average_of_array(int arr[]) {
        int avg, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    public int Size_of_array(int arr[]) {
        return arr.length;
    }
}

public class ArrayProgram {
    public static void main(String[] args) {
        ArrayOperations array = new ArrayOperations();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("---------------------");
            System.out.println("1. Display Array");
            System.out.println("2. Sorting of Array");
            System.out.println("3. Search Element");
            System.out.println("4. Size of Array");
            System.out.println("5. Reverse elements of Array");
            System.out.println("6. Find Average of element");
            System.out.println("7. Find Maximum of element");
            System.out.println("8. Exit from program");
            System.out.println("---------------------");

            System.out.print("Enter choice : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    array.display(array.arr);
                    break;
                case 2:
                    array.sorting(array.arr);
                    array.display(array.arr);
                    break;
                case 3:
                    if (array.search(12, array.arr) != -1) {
                        System.out.println("Index of searched Element : " + array.search(12, array.arr));
                    } else {
                        System.out.println("Searched Element not founded!");
                    }
                    break;
                case 4:
                    System.out.println("Size of array : " + array.Size_of_array(array.arr));
                    break;
                case 5:
                    array.Reverse_an_array(array.arr);
                    array.display(array.arr);
                    break;
                case 6:
                    System.out.println("Average of elements of array : " + array.Average_of_array(array.arr));
                    break;
                case 7:
                    System.out.println("Maximum Number of array : " + array.Maximum_of_array(array.arr));
                    break;
                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice !");
                    System.exit(0);
                    break;
            }
        } while (true);

    }
}
