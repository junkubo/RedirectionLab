public class Tester {
  public static void main(String[] args) {
    PigLatin pig = new PigLatin();
    System.out.println(pig.pigLatinSimple("david"));
    System.out.println(pig.pigLatinSimple("aaron"));
    System.out.println(pig.pigLatinSimple("End simple === start pigLatin ==="));
    System.out.println(pig.pigLatin("the"));
    System.out.println(pig.pigLatin("check"));
    System.out.println(pig.pigLatin("skee"));
    System.out.println(pig.pigLatin("emu"));
    System.out.println(pig.pigLatin("grade"));
  }
}
