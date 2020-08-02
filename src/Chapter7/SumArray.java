package Chapter7;

public class SumArray
{
    public static void main(String[] args) {
        /*int[] array = { 87, 68, 94, 100, 83, 78, 91, 76, 87};
        int total = 0;

        //add each element's value to total
        for (int counter = 0; counter <array.length; counter++)
            total += array[counter];


*/
        int[] number = new int [8];
        number[1] = 4;
        number[4] = 99;
        number[7] = 2;

        int x = number[1];
        number[x] = 44;
        number[number[7]] = 11;

        System.out.printf("%s%8s%n", "Index,", "value");

        //output each array element's value

        for ( int counter = 0; counter < number.length; counter++)

            System.out.printf("%5d%8d%n", counter, number[counter]);
        System.out.println("Total of array elements: " + number);
    }
}
