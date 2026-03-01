public class BannerUC6 {

    // Method for letter O
    static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method for letter P
    static String[] getP() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method for letter S
    static String[] getS() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Combine and print
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}