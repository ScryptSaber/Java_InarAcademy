package chapters.chapter12.checkpoint12;

public class Checkpoint12_22 {
    public static boolean isNumeric1(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (java.lang.NumberFormatException ex) {
            return false;
        }
    }

    public static boolean isNumeric(String token) {
        for (char c : token.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
