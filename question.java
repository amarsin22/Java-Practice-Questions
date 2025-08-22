import java.util.*;
public class question {


  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int v=sc.nextInt();
    int w=sc.nextInt();
    float ans=(( 4*v ) -w ) / 2;
    if(w >= 2 ||( w % 2==0) || v>w){
      System.out.println("TW= " +(int)(ans)+ "FW= " +(int)(v-ans));
      
    }else{
      System.out.println("invalid");
    }
  }
}
 