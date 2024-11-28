public class Exercise23D {
    public static void main(String[] args) {
        System.out.println(convertPhoneNum("(123)456-7890"));

    }
    public static long convertPhoneNum(String phone) {
        phone = phone.replace('(', ' ');
        phone = phone.replace(')', ' ');
        phone = phone.replace('-', ' ');
        phone = phone.replaceAll(" ", "");
        return Long.parseLong(phone);
    }
}
