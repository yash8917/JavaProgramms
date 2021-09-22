public class PrimeNo {
    public static void main(String[] args) {
        int num=14;
        boolean isprime;
        if (num<2) isprime=false;
        else isprime=true;
        for (int i=2; i<=num/i;i++){
            if ((num%1)==0){
                isprime=false;
                break;
            }
        }
        if (isprime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
