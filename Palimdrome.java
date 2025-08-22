import java.util.Scanner;
public class Palimdrome {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter a number");
   int number = scanner.nextInt();
   if(isPalindrome(number)){
    System.out.println(number + " is a Palindrome");
   } else{
    System.out.println(number+ " is not Palindrome");
   }
  }
  public static boolean isPalindrome(int num){
    int orgNumber=num;
    int revsNumber=0;
    while(num!=0){
      int digit = num%10;
      revsNumber =revsNumber*10+digit;
      num = num/10;
    }
    return orgNumber==revsNumber;
  }
}
