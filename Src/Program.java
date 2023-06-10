public class Program {
    public static void main(String[] args) {

        int count = 0;

        for (int number = 1; count < 100; number++) {
            if (!FourOrNine(number)) {
                System.out.println(number);
                count++;
            }
        }
    }

    private static boolean FourOrNine(int number) {
        String numberStr = String.valueOf(number);
        return numberStr.contains("4") || numberStr.contains("9");
    }
}








