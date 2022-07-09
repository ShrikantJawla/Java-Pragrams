import java.util.Scanner;
class Main
{
    public static void main(String[] args){
        Scanner as= new Scanner(System.in);
        int a = as.nextInt();
        int b = 0;
        for(int i=1;i<a;i++){
            for( int j=1;j<a;j++){
                if((i+j==a) && i>j)
                b+=1;
                else if ((i+j==a) && (i==j))
                b+=1;
            }
        }
        System.out.print(b);
    }

}
