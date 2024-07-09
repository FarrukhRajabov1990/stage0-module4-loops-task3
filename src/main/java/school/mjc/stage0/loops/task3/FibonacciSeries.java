package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacci = 1;
        int temp;
        int previous;
        for (int i = 0; i <= lastFibonacci; i++ ){
            if (i == 0) {
                System.out.println(fibonacci);
                System.out.println(fibonacci);
            }
            previous = fibonacci;
            fibonacci = fibonacci + previous;
            System.out.println(fibonacci);
        }
    }
}
