public class pattern19 {
  public static void main(String[] args) {
    
    int n=5;
    //outer loop
    for(int i=1; i<=n; i++){
    
    //space
    for(int j=1; j<=n-i; j++){
      System.out.print(" ");
    }
    //first half
    for(int j=i; j>=1; j--){
      System.out.print(j);
    }
    //second half
    for(int j=1; j<=i; j++){
      System.out.print(j);
    }
    System.out.println();
    }
  }
}
