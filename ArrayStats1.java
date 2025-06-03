public class ArrayStats1{
    // Attributes
    int[] array = {10, 25, 7, 46, 32}; // predefined array
    int sum;
    double average;
    int max;
    int min; // Extra attribute

    // Method to calculate statistics
    public void calculateStats() {
        sum = 0;
        max = array[0];
        min = array[0];

        for (int num : array) {
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        average = (double) sum / array.length;
    }

    // Method to display results
    public void displayStats() {
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min); // show extra attribute
    }

    // Main method
    public static void main(String[] args) {
        ArrayStats1 stats = new ArrayStats1();
        stats.calculateStats();
        stats.displayStats();
    }
}