public class pattern16 {
  public static void main(String[] args){

    int n=5;

    //outer loop
    for(int i=1; i<=n; i++){
      //spaces
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //star
      for(int j=1; j<=5; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
