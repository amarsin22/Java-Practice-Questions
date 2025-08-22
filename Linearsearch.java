import java.util.*;
public class Linearsearch {
  public static void main(String[] args) {
    int arr[]={23,45,67,23,50};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the element to search: ");
    int ans=sc.nextInt();
    boolean found=false;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==ans){
        found = true;
        System.out.println("element found at index: " +i);
        break;
      }
    }
    if(found ==false){
      System.out.println("element are not present in the array");
    }

  }
}
