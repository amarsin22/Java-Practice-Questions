import java.util.Scanner;
public class OddEven {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter any Number");
    int number=scanner.nextInt();
    if(number%2==0){
      System.out.print(number +" is even");
    }
    else{
      System.out.print(number +" is odd");
    }
  }
}
