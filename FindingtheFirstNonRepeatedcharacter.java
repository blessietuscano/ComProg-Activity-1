package blessietuscanoAct1;

public class FindingtheFirstNonRepeatedcharacter {

  public static void main(String[] args) {
   

  String inputStr = "Assessment";
  for(char i :inputStr.toCharArray()){
  if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)){
  
  System.out.println("First non-repeating character is; "+i);
     break;
     }
     }
  }
}