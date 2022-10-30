public class SumAnalysis {

    public static void main(String[] args){
        int[] n = new int[]{1,10,100,1000,10000,100000,1000000};

        final Object[][] table = new String[7][];

        table[0] = new String[] {"1", String.valueOf(timeTakenA(n[0])),String.valueOf(timeTakenB(n[0])),String.valueOf(timeTakenC(n[0]))};
        table[1] = new String[] {"10", String.valueOf(timeTakenA(n[1])),String.valueOf(timeTakenB(n[1])),String.valueOf(timeTakenC(n[1]))};
        table[2] = new String[] {"100", String.valueOf(timeTakenA(n[2])),String.valueOf(timeTakenB(n[2])),String.valueOf(timeTakenC(n[2]))};
        table[3] = new String[] {"1000", String.valueOf(timeTakenA(n[3])),String.valueOf(timeTakenB(n[3])),String.valueOf(timeTakenC(n[3]))};
        table[4] = new String[] {"10000", String.valueOf(timeTakenA(n[4])),String.valueOf(timeTakenB(n[4])),String.valueOf(timeTakenC(n[4]))};
        table[5] = new String[] {"100000", String.valueOf(timeTakenA(n[5])),String.valueOf(timeTakenB(n[5])),String.valueOf(timeTakenC(n[5]))};
        table[6] = new String[] {"1000000", String.valueOf(timeTakenA(n[6])),String.valueOf(timeTakenB(n[6])),String.valueOf(timeTakenC(n[6]))};

        for(final Object[] row : table){
            System.out.format("%15s%15s%15s%15s%n",row);
        }


    }

    public static long timeTakenA(int n){
        long startTime, endTime;
        startTime = System.nanoTime();
        sum_A(n);
        endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long timeTakenB(int n){
        long startTime, endTime;
        startTime = System.nanoTime();
        sum_B(n);
        endTime = System.nanoTime();
        return endTime - startTime;
    }


    public static long timeTakenC(int n){
        long startTime, endTime;
        startTime = System.nanoTime();
        sum_C(n);
        endTime = System.nanoTime();
        return endTime - startTime;
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
