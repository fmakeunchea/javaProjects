package Chapter7;

public class InitArray {

    public static void main(String[] args) {
        //declare variable array and initialize it with an array object
        int[] array = {32, 24, 64, 18, 95, 14, 90, 70, 60, 37}; //create the array object

        System.out.printf("%s%8s%n", "Index,", "value");

        //output each array element's value

        for ( int counter = 0; counter < array.length; counter++)

        System.out.printf("%5d%8d%n", counter, array[counter]);
    }

}
