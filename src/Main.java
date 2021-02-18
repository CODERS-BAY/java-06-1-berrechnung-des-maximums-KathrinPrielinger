import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println(numbers[i]);
        }
        int max = Collections.max(Arrays.asList(numbers));

        System.out.println(Arrays.toString(numbers));
        System.out.println("Das Maximum ist:");
        System.out.println(max);

    }
}


        /*
            int max = Collections.max(Arrays.asList(numbers));


            double result = (numbers[0] + numbers[1] + numbers[2]) / numbers.length;
            System.out.println(Arrays.toString(numbers));
            System.out.println("Der Mittelwert ist:");
            System.out.format("%.2f", result);
        */