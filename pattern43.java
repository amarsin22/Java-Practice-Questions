public class pattern43 {
  public static void main(String[] args) {
    int n=7;

    for(int i=1; i<=n; i++){

      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      int spaces= 2*(n-i);
      for(int j=1; j<=n; j++){
        System.out.print(" ");
      }
      System.out.println();
    }
    //2nd part
    for(int j=1; j<=i; j++){
      System.out.print("*");
    }
    System.out.println();
  }
}
