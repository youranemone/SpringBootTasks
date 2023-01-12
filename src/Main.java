import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Student student = new Student("Dima", 20, 541);
        //student.learn();
        System.out.println("Sum between a and b: " + streamSum(10000000,1000000000));
    }

    public static long streamSum (int a, int b){
        long sumL=IntStream.range(a,b).asLongStream().sum();
        return sumL;
    }
}