class Multitabs
{
    void printconsole(){
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int result = x * y;
                System.out.printf("%d * %d = %d\n", x, y, result);
            }
            System.out.println();
        }
    }
}
