public class PigLatin {
  public static String pigLatinSimple(String s) {
    String newstr = "";
    for (int i = 0; i < s.length(); i++) {
      if (i > 0) {
        newstr += s[i];
      }
    }
    newstr += s[0];
    newstr += "ay";
  }
}
