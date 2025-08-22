public class hallowTriangle {
  public static void main(String[] args) {

    int n=7;
    //outer loop
    for(int i=1; i<=n; i++){

      //inner loop
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<=(2*i-1); k++){
        if(k==1 || k==(2*i-1) ){
        System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int i=n-1; i>1; i--){
      for(int j=1; j<n-i; j++){

        System.out.print(" ");
      }
      for(int k=1; k<=2*n-i; k++){
        if(k==1 || k<=2*n-i){
          System.out.print("*");
        }
      }
      System.out.println(" ");
    }
  }
}
