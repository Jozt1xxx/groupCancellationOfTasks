package cs.vsu.ru.g_13_1.frolov_i_a.groupCanc;

public class Benchmark {
    public static void main(String[] args) {
        int[] value = {100000, 200000, 400000, 800000};
        long dummySum = 0;
        for (int w = 0; w < 5; w++) {
            linkList progrevstack = new linkList();
            for (int i = 0; i < 500000; i++) {
                progrevstack.push(i);
            }
            progrevstack.cancel(25000);

        }
        for (int n : value){
            long[] MedTime =new long[5];
            for (int r = 0; r < 5; r++) {

                linkList stack = new linkList();
                for (int i = 0; i < n; i++) {
                    stack.push(i);
                }

                long time = System.nanoTime();
                stack.cancel(n / 2);
                long endtime = System.nanoTime();
                MedTime[r] = endtime - time;
                dummySum += stack.size;
            }
            java.util.Arrays.sort(MedTime);
            long median = MedTime[2];
            System.out.println(n + "\t" + median);
        }
        if(dummySum == -1){
            System.out.println();
        }
    }

}
