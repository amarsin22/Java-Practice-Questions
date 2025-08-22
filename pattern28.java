public class pattern28{
  public static void main(String[] args) {
    int n=5;

    //outer loop
    for(int i=1; i<=n; i++){
      
      for(int j=1; j<=n; j++){
        if(i==1|| i==3|| i==5||j==1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}