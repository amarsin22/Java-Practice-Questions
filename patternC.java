public class patternC {
  public static void main(String[] args) {
    int n=5;
    
    //outer loop
    for(int i=1; i<=5; i++){
      //inner loop
      for(int j=1; j<=5; j++){
        if(i==1 || j==1 || i==5){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
