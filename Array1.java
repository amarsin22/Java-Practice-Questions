import java.util.Scanner;

public class Array1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size=sc.nextInt();

    int number[]= new int[size];
     
    System.out.print("Enter " + size + " elements: ");
    for(int i=0; i<size; i++){
   
      number[i] = sc.nextInt();
    }
      System.out.println("Array elements are : ");
      for(int i = 0; i<size; i++){
         System.out.println(number[i]);
      }
      sc.close();
    
  }
}
