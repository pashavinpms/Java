package by.gsu.pmslab;
import java.util.Arrays;
import java.util.Scanner;

public class ThreadGenerator {
    public static void main(String[] args) {
        System.out.println("Введите количество потоков: ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(amount);
        int[] flows = new int[amount];
        int[] end = new int[amount];
        double[] result = new double[amount];
        for (int i = 1; i <= amount; i++) {
            System.out.println("Выберите операцию для " + i + " потока:" +
                    " \n1. Сложение.\n2. Вычитание.\n3. Умножение.");
            int operation = scan.nextInt();
            flows[i - 1] = operation;
            System.out.println("Введите число для " + i + " потока: ");
            end[i-1] = scan.nextInt();
        }
        execute(amount, end, result);
        getResult(result, amount, flows);
    }
    private static double[] execute(int amount, int[] end, double[] result) {
        for (int i = 0; i < amount; i++) {
            ClaculatorThread claculatorThread = new ClaculatorThread(end[i]);
            claculatorThread.start();
            result[i] = claculatorThread.getResult();
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    private static void getResult(double[] result, int amount, int[] flows) {
        int summaryResult = 0;
        for (int i=0; i < amount; i++){
            switch (flows[i]) {
                case 1: summaryResult += result[i];
                    break;
                case 2: summaryResult -= result[i];
                    break;
                case 3: summaryResult *= result[i];
                    break;
                default: summaryResult += 0;
                    break;
            }
        }
        System.out.println("Ответ: " + summaryResult);
    }
}
