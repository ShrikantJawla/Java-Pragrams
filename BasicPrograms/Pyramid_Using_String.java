package BasicPrograms;

public class Pyramid_Using_String {
    public static void main(String[] args) {
        String s = "";
        for(int i=1; i<=10; i++){
            s+=Integer.toString(i);
            System.out.println(s);
        }
    }
}
