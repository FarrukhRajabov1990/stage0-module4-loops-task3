package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacci = 0;
        int previous;
        int sum = 0;
        for (int i = 0; i <= lastFibonacci; i++ ){
            if (i == 0) {
                System.out.println(fibonacci);
                sum++;
                fibonacci++;
                if (sum < lastFibonacci) {
                    System.out.println(fibonacci);
                    sum++;
                }
                if (sum < lastFibonacci) {
                    System.out.println(fibonacci);
                    sum++;
                }

            }
            previous = fibonacci;
            fibonacci = fibonacci + previous;
            if (sum < lastFibonacci) {
                System.out.println(fibonacci);
                sum++;
            }

        }
    }
}
