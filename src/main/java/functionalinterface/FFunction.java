package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

//31:01
public class FFunction {
    public static void main(String[] args) {

        // Function
        int incrementedNumber = incrementByOne(0);
        System.out.println(incrementedNumber);

        int numberIncremented = incrementByOneFunction.apply(0);
        System.out.println(numberIncremented);

        int multipliedNumb = multiplyByTenFunction.apply(numberIncremented);
        System.out.println(multipliedNumb);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        Integer applied = addByOneAndThenMultiplyByTen.apply(3);

        System.out.println(applied);

        // ---------------------------------------------------------------
        // BiFunction
        int commonMethodResult = incrementByOneAndMultiply(4, 100);
        System.out.println(commonMethodResult);

        Integer biFunctionResult = incrementByOneAndMultiplyBiFunction.apply(5, 100);
        System.out.println(biFunctionResult);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static int incrementByOne(int number) {
        return ++number;
    }

    // -----------------------------------------------------------------------

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrement, multiplier) -> (++numberToIncrement) * multiplier;

    static int incrementByOneAndMultiply(int number, int multiplier) {
        return (++number) * multiplier;
    }
}
