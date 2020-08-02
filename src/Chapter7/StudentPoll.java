package Chapter7;

public class StudentPoll
{
    public static void main(String[] args) {
        // write your code here

        //student response array (more typically, input at runtime
        int[] responses = {1, 2, 5, 3, 4, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 1, 3, 3, 2, 14};

        int[] frequency = new int[6];  //array of frequency counters

    /*for each answer, select responses element and use that value
    as frequency index to determine element to increment
     */
        for (int answer = 0; answer < responses.length; answer++) {

            try
            {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);  //invokes toString method
                System.out.printf( "    responses[%d] = %d%n%n", answer, responses[answer]);
            }

        }
        System.out.printf("%s%10s%n", "Rating", "Frequency");
    }
}
