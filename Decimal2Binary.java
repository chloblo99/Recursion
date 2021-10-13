public class Decimal2Binary {

    public static String toBinary(int n){
        if(n==1) return "1";
        else return toBinary(n/2) + n % 2;
    }

    public static void main(String[] args){
        System.out.println("26 in binary is " + toBinary(26));
        System.out.println("18 in binary is " + toBinary(18));
        System.out.println("100 in binary is " + toBinary(100));
    }
}