package BasicPrograms;

public class CheckTheDigitsUsingString {
    public static void main(String[] args) {
        int i=4562589;
        String st = String.valueOf(i);
        System.out.println(st.length());
        System.out.println(st.charAt(3));
        System.out.println(st.indexOf('8'));
        System.out.println(st.lastIndexOf('5'));
    }
}
