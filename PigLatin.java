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
}
