import arifmetic.*;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 2.0;

        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b);

        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b);

        calculator = new Calculator(new Multiplier());
        calculator.calc(a, b);

        calculator = new Calculator(new Divider());
        calculator.calc(a, b);
    }

    public static long streamSum (int a, int b){
        long sumL=IntStream.range(a,b).asLongStream().sum();
        return sumL;
    }
}