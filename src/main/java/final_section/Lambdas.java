package final_section;

import java.util.function.BiFunction;

// 02:15:34
public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if (name.isBlank())
                throw new IllegalArgumentException("");

            System.out.println(
                    String.format(
                            "Parameters passed: \nName: %s, Age: %o",
                            name,
                            age)
            );

            return name.toUpperCase();

        };

        System.out.println(upperCaseName.apply("Toby", 1));
    }
}
