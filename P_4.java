/*Write a Java program that outputs all possible strings formed by using 
 * the characters 'c', 'a', 'r', 'b', 'o', and 'n' exactly once. */
public class P_4{
    public static void main(String[] args) {
        String input = "carbon";
        generatePermutations("", input);
    }

    public static void generatePermutations(String prefix, String suffix) {
        int n = suffix.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, n));
            }
        }
    }
}