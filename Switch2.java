import java.util.*;

public class Switch2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();

    switch(button){

      case 1:System.out.println("Ram Ram");
      break;

      case 2:System.out.println("Good Morning Sare ne");
      break;

      case 3:System.out.println("How Are you");
      break;

      case 4:System.out.println("Radhe Radhe");
      break;

      default:System.out.println("Invalid");
    }
  }
}
