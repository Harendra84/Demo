public class AverageOfArrayWithRoundTwoDecimalPoint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double average = calculateAverage(arr);
        System.out.printf("The average is: %.2f%n", average);
    }

    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (int num : arr) {
            sum += num;
        }
        
        return Math.round((sum / arr.length) * 100.0) / 100.0;
    }
}
