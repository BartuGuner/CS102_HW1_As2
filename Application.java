
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int[] list = new int[100];// hjgjhgjhgjhgdaahsdsfsdf
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        for (var i = 0; i < list.length; i++) {
            list[i] = r.nextInt(100);
        }
        do {
            System.out.println("1 - find max");
            System.out.println("2 - find min");
            System.out.println("3 - find average");
            System.out.println("4 - find differ");
            System.out.println("5 - find sum of odd indexes");
            System.out.println("6 - find sum of even indexes");
            System.out.println("7 - exit");
            var choice = in.nextInt();

            if (choice == 1)
                System.out.println(FindMax(list));
            else if (choice == 2)
                System.out.println(FindMin(list));
            else if (choice == 3)
                System.out.println(AverageOfArray(list));
            else if (choice == 4)
                System.out.println(Arrays.toString(DifferOfArray(list)));
            else if (choice == 5)
                System.out.println(SumOfOddIndexs(list));
            else if (choice == 6)
                System.out.println(SumOfEvenIndexs(list));
            else if (choice == 7)
                break;

        } while (true);
    }

    public static int FindMax(int list[]) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    public static int FindMin(int list[]) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static int AverageOfArray(int list[]) {

        int average = 0;
        for (int i = 0; i < list.length; i++) {
            average += list[i];
        }

        return average;
    }

    public static int[] DifferOfArray(int list[]) {

        int differ[] = new int[list.length];
        int average = AverageOfArray(list);

        for (int i = 0; i < differ.length; i++) {
            differ[i] = list[i] - average;
        }

        return differ;
    }

    public static int SumOfOddIndexs(int list[]) {

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (i % 2 != 0) {
                sum += list[i];
            }
        }
        return sum;

    }

    public static int SumOfEvenIndexs(int list[]) {

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                sum += list[i];
            }
        }
        return sum;

    }

}
