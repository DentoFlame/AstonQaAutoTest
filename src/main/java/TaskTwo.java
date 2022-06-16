import java.util.Scanner;


public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("Введите имя: ");
        String strinput = in.next();
            String strexpected = "Вячеслав";
            if (strinput.equals(strexpected)){
                print("Привет, " + strinput);
            } else {
                print("Нет такого имени");
            }
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
