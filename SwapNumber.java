import java.util.Scanner;
public class SwapNumber {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the FIrst Number");
    int a =7;     
    System.out.println("Enter the Second Number");
    int b= 12;
    System.out.println("Before swapping: a= " + a + ",b= " + b );
    
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after Swapping: a = " + a + ", b = " + b);
    
  }
}
