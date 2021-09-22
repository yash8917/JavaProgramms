import java.util.Locale;

public class ChangeTheStringCase {
    public static void main(String[] args) {
        String s="This is the treat";
        System.out.println("Original :" + s);
        String upper=s.toUpperCase();
        String lower=s.toLowerCase();
        System.out.println("Uppercase :"+ upper);
        System.out.println("Lowercase :"+ lower);
    }
}
