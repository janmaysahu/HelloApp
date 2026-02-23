public class OOPSBannerUC3 {

    public static void main(String[] args) {

        printLine(
                "  *****  ",
                "  *****  ",
                "  *****  ",
                "  *****  "
        );

        printLine(
                " *     * ",
                " *     * ",
                " *     * ",
                " *      "
        );

        printLine(
                " *     * ",
                " *     * ",
                " *     * ",
                " *      "
        );

        printLine(
                " *     * ",
                " *     * ",
                "  *****  ",
                "  *****  "
        );

        printLine(
                " *     * ",
                " *     * ",
                " *      ",
                "      * "
        );

        printLine(
                " *     * ",
                " *     * ",
                " *      ",
                "      * "
        );

        printLine(
                "  *****  ",
                "  *****  ",
                " *      ",
                "  *****  "
        );
    }

    // Static helper method using String.join()
    private static void printLine(String o1, String o2, String p, String s) {
        System.out.println(String.join("   ", o1, o2, p, s));
    }
}