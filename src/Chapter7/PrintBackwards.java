package Chapter7;

public class PrintBackwards {
    public static void main(String[] args) {
        int []a = {1, -3, 2, 1, 0};
        //Stores the reverse of given string
        int reversedStr = 0;

        //Iterate through the string from last and add each character to variable reversedStr
        for(int i = 0; i >= 0; i--){
            reversedStr = reversedStr + a[i];
        }


        //Displays the reverse of given string
        System.out.println("Element " + reversedStr);
    }

}
