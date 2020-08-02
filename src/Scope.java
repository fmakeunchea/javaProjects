public class Scope {

    //field that is accessible to all methods of this class
    private static int x = 1;

    //method main creates and initializes local variable x
    //and calls methods useLocalVariable and useField
    public static void main(String[] args)
    {
        int x = 5;  // methods local variable x shadows field x

        System.out.printf("local x in main is %d%n", x );

        useLocalVariable(); //useLocalVariable has local x
        useField(); //useField uses class scope's field x
        useLocalVariable(); //useLocalVariable reinitialize local x
        useField(); //class Scope's field x retain its value

        System.out.printf("%n local x in main is %d%n", x);
    }
    //create and initialize local variable x during each call
    public static void useLocalVariable()
    {
        int x = 25; // initialized each time useLocalVariable is call

        System.out.printf("%nLocal x on entering method useLocalVariable is %d%n", x);
        ++x;  //modifies this method's local variable x
        System.out.printf("%nLocal x before existing method useLocalVariable is %d%n", x);
    }
    public static void useField()
    {
        int x = 25; // initialized each time useLocalVariable is call

        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10;  //modifies this method's local variable x
        System.out.printf("%nLocal x before existing method useField is %d%n", x);
    }
}
