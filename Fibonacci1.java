import java.util.Scanner;
public class Fibonacci1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number=6;
    int first=0,second=1,next;
    System.out.print("Fibonacci Series is: ");
     for(int i=0; i<=number; i++){
      System.out.print(first + " ");
      next=second+ first;
      first=second;
      second=next;
     }
  }
}
