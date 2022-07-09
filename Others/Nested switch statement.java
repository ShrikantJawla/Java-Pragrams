import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter two values: ");
        int a = ad.nextInt();
        int b= ad.nextInt();
        
        switch(a){
            case 1:
                switch(b) {
                    case 1:
                        System.out.print("B =1");
                        break;
                    
                    case 2:
                        System.out.print("B =2");
                        break;
                        
                    case 3:
                        System.out.print("B=3");
                        break;
                    }
                    break;
            case 2:
                System.out.print("a=2");
                break;
                
            case 3:
                System.out.print("a=3");
                break;
            default:
                System.out.print("default statement is here.");
        }
    }
}
