package final_section;

import java.util.function.Consumer;

//02:00:00
public class Callbacks {
    public static void main(String[] args) {
        hello("John", null, value -> {
            System.out.println(
                    String.format("Last Name not provided for %s.", value)
            );
        });

        helloRunnable("John", null, () -> {
            System.out.println(
                    "Last Name not provided"
            );
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void helloRunnable(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
