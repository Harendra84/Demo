public class NthAPFirstTwoTerms {

    public static int nthTermAP(int a1, int a2, int n) {

        int nthTerm = a1, d = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthTerm += d;
        }
        return nthTerm;
    }

    public static void main(String[] args) {
        int a1 = 2; // First term of the AP
        int a2 = 3; // Common difference of the AP
        int n = 4; // Term number to find

        // Calculate the nth term using the formula: nth term = a + (n - 1) * d
        // int nthTerm = a + (n - 1) * d;
        // Print the result
        // System.out.println("The " + n + "th term of the AP is: " + nthTerm);

        // Using the method to find the nth term
        int nthTerm = nthTermAP(a1, a2, n);
        // Print the result
        System.out.println("The " + n + "th term of the AP is: " + nthTerm);
    }
}
