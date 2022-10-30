public class SumIntegers {


    public static void main(String[] args){
        int n = 10000;

        long startTime, endTime;
        startTime = System.nanoTime();
        System.out.println(sum_A(n));
        endTime = System.nanoTime();
        System.out.println("Algorithm A takes: " +(endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        System.out.println(sum_B(n));
        endTime = System.nanoTime();
        System.out.println("Algorithm B takes: " +(endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        System.out.println(sum_C(n));
        endTime = System.nanoTime();
        System.out.println("Algorithm C takes: " +(endTime - startTime) + " nanoseconds");
    }





    public static long sum_A(int n){
        long sum = 0;
        for(long i=1; i <= n ; i++){
            sum = sum + i;
        }

        return sum;
    }

    public static long sum_B(int n){
        long sum = 0;
        for (long i=1; i <= n; i++){
            for(long j=1; j <=i; j++){
                sum = sum + 1;
            }
        }

        return sum;
    }

    public static long sum_C(int n){
        long sum = 0;
        sum = n * (n + 1) / 2;

        return sum;
    }
}
