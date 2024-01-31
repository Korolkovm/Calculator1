import java.io.BufferedReader;                 // Калькулятор принимает значения от 1 до 10 включительно
import java.io.IOException;                    //
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите выражение(a+b;a-b;a*b;a/b): ");
        String a, b, c;
        String[] data = reader.readLine().replaceAll("\\s+", "").split("");
        a = data[0];
        b = data[1];
        c = data[2];



        int q = Integer.parseInt(a);
        if (q> 0 && q <= 10){
        }else {
            System.out.println("Ошибка. Введите число от 1 до 10. ");
            return;
        }
        int w = Integer.parseInt(c);
        if (w> 0 && w <= 10){
        }else {
            System.out.println("Ошибка. Введите число от 1 до 10. ");
            return;
        }


        if (b.equals("+")) {
            int d;
            System.out.println(d = q + w);
        }

        if (b.equals("-")) {
            int d;
            System.out.println(d = q - w);
        }

        if (b.equals("*")) {
            int d;
            System.out.println(d = q * w);
        }

        if (b.equals("/")) {
            int d;
            System.out.println(d = q / w);
        }
    }


}
