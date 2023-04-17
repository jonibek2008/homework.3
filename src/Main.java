public class Main {
    public static void main(String[] args) {
        double[] numbers = {4.6, 3.9, 5.3, -2.0, 3.1, -7.2, 2.3, -6.9, 1.2, -9.5, 8.2, 6.7, -3.3, 1.6, 9.1};
        double sum = 0;
        int amount = 0;
        boolean exam = false;
        for (double nums: numbers) {
            if (nums < 0){
                exam = true;
            } else if (nums > 0 && exam) {
                sum += nums;
                amount++;
                System.out.println(nums);
            }
        }
        System.out.println("Среднее арифметическое положительных чисел: " + sum/amount);
    }
}