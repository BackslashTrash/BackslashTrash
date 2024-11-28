public class Enrichment1 {
    public static void main(String[] args) {
       int Sum = 0;
       int TermValue = 1; //First term
       int TermValue2 = 1;  // Second Term
       while (TermValue < 1000) {
           TermValue += TermValue2;   // First term adds the second term
           TermValue2 += TermValue;   // Second term adds the new first term
           Sum = TermValue + TermValue2;     // adds all the terms together
       }
       Sum -= 1;    // Minus 1 because the sum of the values is equal to adding the next term minus 1
       System.out.println(TermValue);
       System.out.println("The sum is " + Sum + ".");
    }
}
