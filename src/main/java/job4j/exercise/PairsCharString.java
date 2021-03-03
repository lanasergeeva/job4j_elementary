package job4j.exercise;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if((l.isEmpty() && r.isEmpty()) || l.charAt(0)==r.charAt(r.length()-1)) {
            return true;
        }
        return false;
    }
}
