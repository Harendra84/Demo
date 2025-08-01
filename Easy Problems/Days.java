public class Days {
    public static void main(String[] args) {
        // Example usage
        int d = 2; // Tuesday
        int n = 5;
        int result = dayIndexNDaysBefore(d, n);
        System.out.println(result); // Output: 4 (Thursday)
    }

    // Returns the index for the day which is n days before the given day d
    public static int dayIndexNDaysBefore(int d, int n) {
        // Ensure d is in 0..6
        if (d < 0 || d > 6) throw new IllegalArgumentException("d must be between 0 and 6");
        // n can be any integer (positive or negative)
        int result = (d - n) % 7;
        if (result < 0) result += 7;
        return result;
    }
}
