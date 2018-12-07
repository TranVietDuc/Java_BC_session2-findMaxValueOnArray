import java.sql.SQLOutput;
import java.util.Scanner;
public class findMaxValueOnArray {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter Array Size:");
            size = input.nextInt();
            if(size>20)
                System.out.println("Size should not exceed 20");
        }while (size>20);

        array = new int[size];
        for (int i =0; i<size; i++)
       {
            System.out.print("Enter Element " + (i+1) + " :" );
            array[i] = input.nextInt();
        }

        System.out.println("Property list: ");
        for (int j : array)
        {
            System.out.print(j + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int k = 0; k < size;k++){
            if(array[k]>max){
                max = array[k];
                index = k;
            }
        }
        System.out.println("Max value is: " + max + "at index:  " + index);

    }
}
