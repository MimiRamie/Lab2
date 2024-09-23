import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        //Array
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        while(true){
            System.out.println("\nEnter option: \n 1. Array initialization\n 2. Modifying an array element");
            int option = sc.nextInt();
            switch (option) {
                case 1:        //Array initialization
                System.out.println("Enter 5 int in array: ");
                for (int i = 0; i < numbers.length; i++){
                    numbers[i] = sc.nextInt();
                }
                System.out.println("New array elenment: ");
                for (int i = 0; i < numbers.length; i++){
                    System.out.print(numbers[i]+" ");   
                }
                    break;
                case 2:        //Modifying an array element
                System.out.println("Old array: ");
                for (int i = 0; i < numbers.length; i++){
                    System.out.print(numbers[i]+" ");   
                }
                System.out.println("\nEnter index in array to modify: ");
                    int index = sc.nextInt();
                System.out.println("Enter the new value of the element: ");
                    int num = sc.nextInt();
                System.out.println("Modified array element: ");
                if (index < numbers.length && index >= 0){
                    numbers[index] = num;
                }
                for (int i = 0; i < numbers.length; i++){
                    System.out.print(numbers[i]+" ");
                }
                break;
                default:
                    break;
            }
            sc.close();
        }

    }
//Link list

    //Create class SinglyLinkedList




}
    

