package functionalinterface;

import java.util.function.Supplier;

//01:07:33
public class FSupplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURLSupplier.get());
    }

    static Supplier<String> getDBConnectionURLSupplier =
            () -> "jdbc://localhost:6060/users";
}
