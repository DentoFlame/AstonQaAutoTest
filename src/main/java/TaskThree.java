import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("������� �������� ������ ����� \n�������, ��� ��������, � �������: 2,5,3,1 : ");
        String input = in.next();
        String[] str = input.split(",");
        Integer[] mass = new Integer[str.length];
        print("��������� ������: " + Arrays.toString(str) + "\n");
        try {
            for (int i = 0; i < str.length; i++) {
                mass[i] = Integer.parseInt(str[i]);
                if (mass[i] % 3 == 0) {
                    print(mass[i] + " ");
                }
            }
        } catch (NumberFormatException e) {
            print("������������ ������ �������");
        }

    }

    private static void print(String s) {
        System.out.print(s);
    }


}
