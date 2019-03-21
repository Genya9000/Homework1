import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1_5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Введите число для отображения в двоичном виде");
        int x = 0;

        try {
            x = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = Integer.toBinaryString(x);
        //char[] chArray = s.toCharArray();

        System.out.println(s);


        System.out.println("Введите номер позиции");

        try {
            String numa = reader.readLine();
            int number = Integer.parseInt(numa);
            int y = (int) Math.pow(2, number-1);
             int z= x^y;
            System.out.println(Integer.toBinaryString(z));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
