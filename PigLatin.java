import java.util.Scanner;
public class PigLatin {
  public static String pigLatinSimple(String s) {
    String newstr = "";
    boolean isSpecial = false;
    if (s.substring(0,1).equals("a") || s.substring(0,1).equals("e") || s.substring(0,1).equals("i") || s.substring(0,1).equals("o") || s.substring(0,1).equals("u")) {
      isSpecial = true;
        }
    for (int i = 0; i < s.length(); i++) {
      if (i > 0) {
        newstr += s.substring(i, i + 1);
      }
    }
    newstr += s.substring(0, 1);
    if (isSpecial == true) {
      newstr += "hay";
    }
    else {
      newstr += "ay";
    }
    return newstr;
  }
  public static String pigLatin(String s) {
    String newstr = "";
    boolean isSpecial = false;
    if (s.substring(0,1).equals("a") || s.substring(0,1).equals("e") || s.substring(0,1).equals("i") || s.substring(0,1).equals("o") || s.substring(0,1).equals("u")) {
      isSpecial = true;
        }

    boolean digraph = false;
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < digraphs.length; i++) {
      if (s.length() > 1) {
        if (s.substring(0,2).equals(digraphs[i])) {
          digraph = true;
        }
      }
    }
    if (digraph) {
        newstr += s.substring(2);
        newstr += s.substring(0, 2);
    }
    else {
      for (int i = 0; i < s.length(); i++) {
      if (i > 0) {
        newstr += s.substring(i, i + 1);
      }
    }
    newstr += s.substring(0, 1);
  }
    if (isSpecial == true) {
      newstr += "hay";
    }
    else {
      newstr += "ay";
    }
    return newstr;
  }

  public static String pigLatinBest(String s) {
    String newstr = "";
    if (Character.isLetter(s.charAt(0))) {
      if (!Character.isLetter(s.charAt(s.length()-1))) {
        newstr = pigLatin(s.substring(0, s.length()-1)) + s.substring(s.length()-1);
        return newstr;
      } else {
        newstr = pigLatin(s);
        return newstr;
      }
    }
    else {
        return s;

    }
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    while (s.hasNextLine()) {
      String str = s.nextLine();
      String newstr = "";
      String[] words = str.split(" ");
      for (int i = 0; i < words.length; i++) {
  
          newstr += pigLatinBest(words[i]) + " ";
      }
      System.out.println(newstr);
    }

  }


}
