import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи число в двоичном формате");

        try {
            String line = reader.readLine();
            int numa  = Integer.parseInt(line, 2);
            System.out.println("\"" +line+"\" -> "+numa);
        } catch (IOException e) {

        }

    }
}