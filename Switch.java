import java.util.*;

public class Switch{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int button=sc.nextInt();

    switch(button){
      case 1: System.out.println("Hello");
      break;
      case 2: System.out.println("Jay Siya Ram");
      break;
      case 3: System.out.println("Radhe Radhe");
      break;
      default:System.out.println("invalid button");
    }
  }
}
