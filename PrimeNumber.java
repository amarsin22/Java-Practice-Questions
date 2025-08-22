import java.util.Scanner;
public class PrimeNumber {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter any Number");
    int number = scanner.nextInt();
    if(isPrime(number)){

      System.out.println(number + " is a prime Number");
    }
    else{
      System.out.println(number + " is not Prime Number");
    }

  }
  public static boolean isPrime(int num){
    for(int i=2; i<=num/2; i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
  
}
