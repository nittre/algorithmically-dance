import java.util.Scanner;

public class SmallestAndBiggest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int smallest, biggest;
        int length;
        length = scan.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scan.nextInt();
        }

        smallest = numbers[0];
        biggest = numbers[0];

        for (int i = 0; i < length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (biggest < numbers[i]) {
                biggest = numbers[i];
            }
        }

        System.out.printf("%d %d", smallest, biggest);

        scan.close();
    }
}