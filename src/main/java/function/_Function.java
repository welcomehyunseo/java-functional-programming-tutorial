package function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOneFunction.apply(1);  // increment(1);
        System.out.println(increment);

        int multiply = multipleByTen.apply(10);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndMultiplyByTen = incrementByOneFunction.andThen(multipleByTen);
        System.out.println(addByOneAndMultiplyByTen.apply(2));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleByTen = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
