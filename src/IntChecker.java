import sun.awt.geom.AreaOp;

import java.util.*;

public class IntChecker {

    public IntChecker() {
    }

    public void console() {

        Scanner in = new Scanner(System.in);

        if (test(in.nextLine())) {
            System.out.println("Число");
        } else {
            System.out.println("Не число");
        }


    }

    public boolean test(String number) {
        try {
            Integer.parseInt(number);

            return true;
        } catch (NumberFormatException nfe) {

            return false;
        }
    }

}
