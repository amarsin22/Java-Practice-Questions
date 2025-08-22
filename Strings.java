import java.util.*;
public class Strings {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String firstName="Amar";
    String lastName="Singh";
    String fullName=firstName+ "@" + lastName;

    System.out.println(fullName.length());

    for(int i=0; i<fullName.length();i++){
      System.out.println(fullName.charAt(i));

      //Strings are immutable
    }
  }
}
