public class BuggyJava {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        System.out.println("Sum: " + calculateSum(numbers));
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
