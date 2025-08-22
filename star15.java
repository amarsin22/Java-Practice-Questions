public class star15{
  public static void main(String[] args) {
    int n=4;

    //upper half
    for(int i=1; i<=n; i++){
      //space
      for(int j=1; j<=n-i; j++){
      System.out.print(" ");
      }
      //star
      for(int j=1; j<=2*n-i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

