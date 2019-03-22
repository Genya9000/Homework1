import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1_1_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numa = reader.readLine();
        String numa1 = reader.readLine();


        int num1 = Integer.parseInt(numa);
        if (num1 <= 0) throw new Exception();
        int num2 = Integer.parseInt(numa1);
        if (num2 <= 0) throw new Exception();

        System.out.println(init(num1, num2));
    }

    private static int init(int m, int n){
         /*
            Алгоритм
            1. НОД(0, n) = n; НОД(m, 0) = m;
            2. Если m, n чётные, тогда НОД(m, n) = 2 * НОД(m / 2, n / 2).
            3. Если m чётное, тогда НОД(m, n) = НОД(m / 2, n).
            4. Если n чётное, тогда НОД(m, n) = НОД(m, n / 2).
            5. Если m, n нечётные и m > n, тогда НОД(m, n) = НОД(n, m - n).
            6. Если m, n нечётные и m < n, тогда НОД(m, n) = НОД(n, n - m).
            7. Если m = n, тогда НОД(m, n) = m;
        */
        /*if (n == 0 || m == 0){
            return m | n;
        }*/
        if (m == n){
            return m;
        }

        if ((n & 1) == 0 && (m & 1) == 0){
            return init(m >> 1, n >> 1) << 1;
        }
        else if ((m&1) == 0){
            return init(m >> 1, n);
        }
        else if ((n&1) == 0){
            return init(m, n >> 1);
        }
        else {
            if (m > n){
                return init(n, m - n);
            }
            else {
                return init(n, n-m);
            }
        }
}}





