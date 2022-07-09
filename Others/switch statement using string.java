import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ag= new Scanner(System.in);
        System.out.println("Enter a word among three words: no, yes, hello");
        String name = ag.nextLine();
        switch(name){
            case "no":
                System.out.print("no right!");
                break;
                
            case "yes":
                System.out.print("yes right!");
                break;
                
            case "hello":
                System.out.print("hello right");
                break;
        }
        
    }
}                                                     
