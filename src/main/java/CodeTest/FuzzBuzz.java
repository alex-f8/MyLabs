package CodeTest;

/*
*   if number dived on 3 write Fuzz
*   if divided on 5 Buzz
*   if divided on both write FuzzBuzz
* */

public class FuzzBuzz {
    public static void main(String[] args) {
        //int a = 43, b = 30;
        //System.out.println(Integer.max(b, a));
       // System.out.println(Byte.MAX_VALUE);
        for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            System.out.printf("%d: ", b);
            if( b != 0 && b % 15 == 0) System.out.println("FuzzBuzz");
            else if (b != 0 && b % 3 == 0) System.out.println("Fuzz");
            else if ( b != 0 && b % 5 == 0  ) System.out.println("Buzz");
            else System.out.println(b);
        }
    }
}
