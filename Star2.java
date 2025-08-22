public class Star2 {
  public static void main(String[] args) {
    int n=5;
    int number=1;

    //outer loop
    for(int i=0; i<=n; i++){
      //inner loop
      for(int j=0; j<i; j++){
        System.out.print(number+" ");
        number++;
      }
      System.out.println();
    }
  }
}
