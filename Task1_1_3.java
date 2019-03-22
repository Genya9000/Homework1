public class Task1_1_3 {

        public static void main(String[] args) {
            byte b = 1;
            short s = 1;
            int i = 1;
            long l = 1L;

            int count = 0;
            while (b != 0) {
                b = (byte) (b << 1);
                count++;
            }
            System.out.println("Byte содержит " + count + " бит");

            count = 0;
            while (s != 0) {
                s = (short) (s << 1);
                count++;
            }
            System.out.println("Short содержит " + count + " бит");

            count = 0;
            while (i != 0) {
                i = i << 1;
                count++;
            }
            System.out.println("Int содержит " + count + " бит");

            count = 0;
            while (l != 0) {
                l = l << 1;
                count++;
            }
            System.out.println("Long содержит " + count + " бит");
        }
    }

