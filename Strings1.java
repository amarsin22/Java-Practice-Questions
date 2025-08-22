import java.util.*;

public class Strings1 {
  public static void main(String[] args){
  StringBuilder sb=new StringBuilder("tony");
  System.out.println(sb);
  
  //char at index 0
  System.out.println(sb.charAt(0));

  //set char at index 0
  sb.setCharAt(0, 'a');
  System.out.println(sb);

  //insert char at index 
  sb.insert(0,'s');
  System.out.println(sb);

  //delete the extra n
  sb.delete(2, 3);
  System.out.println(sb);
  }
}
