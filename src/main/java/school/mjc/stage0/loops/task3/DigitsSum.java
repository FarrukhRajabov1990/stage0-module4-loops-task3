package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0) t *= -1;
        String toWord = ("" + t);
        int sum = 0;
        for (int i = 0; i < toWord.length(); i++) {
            sum += toWord.charAt(i);
        }
        System.out.println(sum);
    }
}
