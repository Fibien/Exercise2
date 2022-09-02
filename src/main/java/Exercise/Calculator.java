package Exercise;
import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands).
                sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public int getSum(int i, int j) {
        return i + j;
    }
    public int getProduct(int i, int j){
        return i * j;
    }

}