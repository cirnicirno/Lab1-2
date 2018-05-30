import sun.awt.geom.AreaOp;

import java.util.*;

public class NumChecker {

    public NumChecker() {
    }

    public void console() {

        Scanner in = new Scanner(System.in);

        if (in.hasNextDouble()) {
            System.out.println("Число");
        } else {
            System.out.println("Не число");
        }


    }


}
