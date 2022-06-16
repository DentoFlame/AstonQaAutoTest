import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Введите число: ");

        try {
            int num = in.nextInt();
            if (num > 7) {
                print("Привет");
            }
        } catch (InputMismatchException e) {
            print("Введено некорректное число.");
        }
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
