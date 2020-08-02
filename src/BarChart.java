public class BarChart
{
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution:");

        //for each array element, output a bar of the chart
        for (int i = 0; i < a.length; i++)
        {
            if (i ==10)
                System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i*10 + 9);

            //print bar of asterisks
            for (int stars = 0; stars<a[i]; stars++)
            System.out.print("*");

            System.out.println();
        }
    }
}
