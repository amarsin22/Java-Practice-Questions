public class TOH {
  public static void TOHanoi(int n, String src, String helper, String dest){

    if (n==1) {
      System.out.println("transfer disk from " + n + " from " + src + " to " + dest);
      return;
    }
    TOHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk from " + n + " from " + src + " to " + dest);
    TOHanoi(n-1, helper, src, dest);
  }
  public static void main(String[] args) {
    int n=3;
    TOHanoi(n, "S", "H", "D");
  }
}
