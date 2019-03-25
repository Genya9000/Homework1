
public class Task113 {
    public static void main(String[] args) {
        System.out.println(getTypeValue(-9000000000L));

    }
    public static String getTypeValue(long number){
        int i = 1;
        if (number < 0) {
            number = ~--number;
            number--;
        }

        while(number > 0){
            number = number >>> 1;
            i++;
        }

        if (i <= 8) return "Число типа byte";
        if (i <= 16) return "Число типа short";
        if (i <= 32) return "Число типа int";
        if (i <= 64) return "Число типа long";
        return "Unknown type";
    }
}