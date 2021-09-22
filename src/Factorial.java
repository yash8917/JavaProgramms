public class Factorial {
    // This is the recurtion Method
    int fact(int n){
        int result;
        if (n==1) return 1;
        result=fact(n-1)*n;
        return result;
    }
}

class Recurtion{
    public static void main(String[] args) {
        Factorial f=new Factorial();
        System.out.println(f.fact(3));
        System.out.println(f.fact(5));
        System.out.println(f.fact(4));
    }
}

