import java.util.Scanner;
public class MakeStars {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    while (s.hasNextLine()) {
      String str = s.nextLine();
      String newstr = "";
      boolean whitespace = false;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t' || str.charAt(i) == '\r'){
          if (!whitespace) {
            newstr += " ";
            whitespace = true;
          }
          else {}

        }
        else {
          newstr += "*";
          whitespace = false;
        }
      }
      System.out.println(newstr);
    }

  }

}
