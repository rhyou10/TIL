import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 4;
        System.out.println(a);
        boolean b = true;
        char ch = 'A';
        String str = "ABC";

        System.out.println(str);
        System.out.println(ch);
        System.out.println(b);

        Scanner scanner = new Scanner(System.in);

        int input_num = scanner.nextInt();
        System.out.println(input_num);

        scanner.close();
    }
}
