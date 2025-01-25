import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int highestFactorOfa =0;
        int highestFactorOfb =0;
        int finalAnswer =0;
        for (int i = 1; i <= a; i++) {
            if(a%i==0)
            {
                 highestFactorOfa = i;
                 for (int j = 1; j <= b; j++) {
                    if(b%j==0)
                    {
                         highestFactorOfb = j;
                         if(highestFactorOfa==highestFactorOfb)
                         {
                             finalAnswer = highestFactorOfa;
                         }
                    }
                }
            }
        }
        // System.out.println("Highest Divisor of " + a + " is " + highestFactorOfa);
       System.out.println("Highest Common Factor of " + a + " and " + b  + " is : " + finalAnswer);
    }
}
