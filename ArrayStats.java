public class ArrayStats {
    public static void main(String[] args) {
        // Predefined array of integers
        int[] array = {10, 25, 7, 46, 32};

        int sum = 0;
        int max = array[0];

        // Calculate sum and find maximum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
        }

        double average = (double) sum / array.length;

        // Output the results
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
    }
}