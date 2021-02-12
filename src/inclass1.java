public class inclass1 {

    public static void main(String[] args) {
        double[] tempList = { 12.5, 49.7, 56, -60, 84.4, -7, 3, 24, -17, 9, 7, 3.1, -47, -12 };
        System.out.println("Average temperature: " + calcAvg(tempList));

    }

    // Calculate and print the average
    public static double calcAvg(double[] temps) {
        double avg = 0, sum = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] <= 50 && temps[i] >= -50)
                sum += temps[i];
        }
        avg = sum / temps.length;

        return avg;
    }
}