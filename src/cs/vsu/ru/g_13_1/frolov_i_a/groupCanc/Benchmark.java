package cs.vsu.ru.g_13_1.frolov_i_a.groupCanc;
import java.util.Random;
public class Benchmark {
    public static void main(String[] args) {
        int[] value = {100000, 200000, 400000, 800000, 1600000, 1800000, 2000000, 2200000,2400000};
//        long dummySum = 0;
        Random random = new Random(42);
        for (int w = 0; w < 5; w++) {
            linkList stack = new linkList();

            for (int i = 0; i < 10000; i++) {
                int operation = random.nextInt(3);

                if (operation == 0) {
                    stack.push(i);
                } else if (operation == 1) {
                    if (stack.size > 0) {
                        stack.pop();
                    }
                } else {
                    if (stack.size > 0) {
                        int m = random.nextInt(stack.size) + 1;
                        stack.cancel(m);
                    }
                }
            }
        }
//        for (int w = 0; w < 100; w++) {
//            linkList progrevstack = new linkList();
//            for (int i = 0; i < 500000; i++) {
//                progrevstack.push(i);
//            }
//            progrevstack.cancel(25000);
//        }

        for (int n : value) {
            linkList myst = new linkList();
            long time = System.nanoTime();
            for (int i = 0; i < n; i++) {
                int operation = random.nextInt(3);
                if (operation == 0) {
                    myst.push(random.nextInt());
                } else if (operation == 1) {
                    if (myst.size > 0) {
                        myst.pop();
                    }
                } else {
                    if (myst.size > 0) {
                        int m = random.nextInt(myst.size) + 1;
                        myst.cancel(m);
                    }
                }
            }
            long end = System.nanoTime();
            long amort = (end - time)/n;
            System.out.println(n + "\t " + amort);
        }



    }
}

//            long[] MedTime =new long[5];
//            for (int r = 0; r < 5; r++) {
//
//                linkList stack = new linkList();
//                for (int i = 0; i < n; i++) {
//                    stack.push(i);
//                }
//
//                long time = System.nanoTime();
//                stack.cancel(n / 2);
//                long endtime = System.nanoTime();
//                MedTime[r] = endtime - time;
//                dummySum += stack.size;
//            }
//            java.util.Arrays.sort(MedTime);
//            long median = MedTime[2];
//            System.out.println(n + "\t" + median);
//        }
//        if(dummySum == -1){
//            System.out.println();
//        }



