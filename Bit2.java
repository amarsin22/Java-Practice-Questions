import java.util.*;

public class Bit2 {
  public static void main(String[] args) {
    int n=5;
    int pos=2;
    int bitMask=1<<pos;
  
    int newNumber=bitMask | n;
    System.out.println(newNumber);
  }
}
 