public class MultiTabs
{

    private int result;

    public MultiTabs() {
    }

    public void PrintConsole(){
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                result = x * y;
                System.out.printf("%d * %d = %d\n", x, y, result);
            }
            System.out.println();
        }
    }
}
