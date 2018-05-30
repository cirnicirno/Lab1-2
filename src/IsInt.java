import java.util.*;

public class IsInt {

    public IsInt() {
    }

    public void console() {

        Scanner in = new Scanner(System.in);

        if (check(in.nextLine())) {
            System.out.println("Число");
        } else {
            System.out.println("Не число");
        }


    }

    public boolean check(String test) {
        try {
            Integer.parseInt(test);

            return true;
        } catch (NumberFormatException nfe) {

            return false;
        }
    }

}
