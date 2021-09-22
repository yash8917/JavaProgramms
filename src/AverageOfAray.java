public class AverageOfAray {
    public static void main(String[] args) {
        double num[]={10.1,34.4,324.5,454.5,33.4};
        double result =0.0;
        for (int i = 0; i < 5; i++) {
            result+=num[i];
        }
        System.out.println("Average is "+result/5);
    }
}
