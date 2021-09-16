//passing annonymous array
public class Lab1 {
    public static void value(int arr[]) {
       for( int res:arr){
           System.out.println(res);
       }
    }
    public static void main(String[] args){
        int ar1[]={1,2,44,5};
//        value (new int[]{10,20,30,40}
        value(ar1);
    }
}
