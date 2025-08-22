public class MoveCharacter {
  public static void moveAllx(String str, int idx, int count, String newString){
  
    for(int i=0; i<count; i++){
      System.out.println(newString);
    }

    char currchar=str.charAt(idx);
    if (currchar=='x'){
      count++;
      moveAllx(str, idx, count, newString);
    }
    else{

      newString += currchar;
      moveAllx(str, idx+1, count, newString);
    }

  }
  public static void main(String[] args) {
    String str="abxcdxxe";
    moveAllx(str, 0, 0, "");
  }
}
