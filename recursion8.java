public class recursion8 {
  public static int calPower(int x, int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int xpownm1= calPower(x, n-1);
    int xPown= x * xpownm1;
    return xPown;
  }
  public static void main(String[] args) {
    int x=4,n=3;
    int ans=calPower(x, n);
    System.out.println("the power of the digit is: " +ans);
  }
}
