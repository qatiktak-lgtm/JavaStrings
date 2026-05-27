package lesson11.h_w_L011;

public class Methods_HomeWork_08 {
    public static void headerDesign(String homeworkNum, int taskNum) {
        System.out.println();
        int lineLength = 30;
        System.out.println("=".repeat(lineLength));
        System.out.printf("Home work %s | #%d%n", homeworkNum, taskNum);
        System.out.println("_".repeat(lineLength));
    }


    /*
    0123456789
    s->"ccbbbdddda"
    return 5
     */
    public static int CharIndexLongSubs(String shw8) {
        StringBuilder sb = new StringBuilder();
        sb.append(shw8.charAt(0));
        for (int i = 1; i < shw8.length(); i++) {
            if (shw8.charAt(i) != shw8.charAt(i - 1)) {
                sb.append(" ");
            }
            sb.append(shw8.charAt(i));
        }
        String[] parts = sb.toString().split(" ");
        String longest = "";
        for (String part : parts) {
            if (part.length() > longest.length()) {
                longest = part;
            }
        }
        return shw8.indexOf(longest);
    }
}

