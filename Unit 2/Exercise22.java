class Exercise22 {
    public static void main(String[] args) {
        String str = "Hello!";
        String message = "Welcome to the program.";


        //1. charAt
        //EXAMPLE:
        //char c = str.charAt(1);
        //System.out.print(c);
        //QUESTION: find the character at 5 in str and print it (output: !)
        System.out.println(str.charAt(5));

        //2. indexOf
        //EXAMPLE:
        //int n = str.indexOf("lo");
        //System.out.print(n);
        //QUESTION: find and print the indexOf "the" in message (output: 11)
        System.out.println(message.indexOf("the"));

        //3. length
        //EXAMPLE:
        //System.out.println(str.length());
        //QUESTION: find and print the length of message (output: 23)
        System.out.println(message.length());

        //4. substring
        //EXAMPLE:
        String str2 = str.substring(1,3);
        System.out.print(str2);
        //QUESTION: find and print a substring of message from an index of 0 to 7. (output: Welcome)
        System.out.println(message.substring(0,7));



        //CHALLENGES
        //Print the last character in message and make it work even if the length of message changes.
        System.out.println(message.charAt(message.length()-1));


        //Go through these other methods and try to use each one (you might need to google the syntax)
        //System.out.println(message.compareTo(str));
        //str.compareTo("hi");
        //System.out.println(str.endsWith(message));
        //equals(Object anObject)
        //equalsIgnoreCase(String anotherString)
        //indexOf(String str)
        //indexOf(String str, int fromIndex)
        int k = str.lastIndexOf(2,3);
        System.out.println(k);
        //lastIndexOf(String str, int fromIndex)
        //length()
        //replace(char oldChar, char newChar)
        //replaceAll(String regex, String replacement)
        //startsWith(String prefix)
        //startsWith(String prefix, int offset)
        //substring(int beginIndex)
        //substring(int beginIndex, int endIndex)
        //toLowerCase()
        //toUpperCase()



    }
}
