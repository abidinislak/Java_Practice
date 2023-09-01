package training;

public class PerfectNumber {



    public static boolean isPerfect(int num){

        if(num <1) return false;

        int devisorssum=0;
        for (int i = 1; i < num; i++) {


            if(num% i==0) devisorssum+=i;
        }
return devisorssum==num ;
    }
    public static void main(String[] args) {


        System.err.println(isPerfect(6));
        System.err.println(isPerfect(28));
        System.err.println(isPerfect(10));

    }
}
