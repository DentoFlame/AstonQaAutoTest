import java.util.Scanner;


public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("������� ���: ");
        String strinput = in.next();
            String strexpected = "��������";
            if (strinput.equals(strexpected)){
                print("������, " + strinput);
            } else {
                print("��� ������ �����");
            }
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
