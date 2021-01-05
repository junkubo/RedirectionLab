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
      if (s.substring(0,2).equals(digraphs[i])) {
        digraph = true;
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
}
