package BasicPrograms;

public class Overloading_Methods {
    public static int powerOfAnyNumber(int a, int b){
        return (int)Math.pow(a,b);
    }

    public static int addition(int ... arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int mul(int ...num){
        int prod =1;
        for(int i=0; i< num.length; i++)
            prod*= num[i];
        return prod;
    }


    public static void main(String[] args) {
//        System.out.println(powerOfAnyNumber(4,5));
//        System.out.println(addition(6,8,5,34));
        int so = addition(25,25,25,25,25,25,25,25,25,25);
        System.out.println(so);

        System.out.println(mul(45,34,45,23,45,23));
    }

}
