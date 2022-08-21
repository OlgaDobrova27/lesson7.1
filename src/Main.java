public class Main {
    public static void main(String[] args) {

        // Задание 1

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Сумма затрат за месяц составила" + " " + sum);


        // Задание 2

        int minSum = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != 0 + minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма затрат за месяц составила" + " " + minSum);

        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма затрат за месяц составила" + " " + maxSum);

        //Задание 3

        int spendingPerMonth = 4303149;
        double averageWaste = spendingPerMonth / 30.0;
        System.out.println("Средняя сумма трат за месяц составила рублей" + averageWaste);


        // Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ' , 'v', 'o', 'n', 'a', 'v' , 'I' };
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
