package Chapter7;

public class OddArray
{
    public static void main(String[] args) {
        int []a = {1, 2, 5, 7, 8, 3, 9};
        System.out.println("Odd number");
        for (int i=0; i<a.length; i++){
            if ( a[i]%2 == 1){
                System.out.println(a[i]);
            }
        }
    }
}
