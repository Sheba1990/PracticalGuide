package practice;

//#7
public class ComparingStrings {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "abc";
        s2 = s1;
        System.out.println("Comparing of links on strings " + (s1 == s2));

        s1 += 'd';
        System.out.println("Comparing of links on strings " + (s1 == s2));

        s2 = new String(s1);
        System.out.println("Comparing of links on strings " + (s1 == s2));

        System.out.println("Comparing of values of strings " + s1.equals(s2));
    }
}
