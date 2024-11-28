public class Exercise23E {
    public static void main(String[] args) {
        String wick = convertName("John Wick");
        System.out.print("hello");
        System.out.println("hello");


    }
    public static String convertName(String sentence) {
        String result = sentence.substring(0,sentence.indexOf(" "));
        sentence = sentence.substring(sentence.lastIndexOf(" ") +1);
        return sentence + ", " + result;
    }
}
