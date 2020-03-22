package functionalinterface;

import java.util.function.Predicate;

public class FPredicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000343910"));
        System.out.println(isPhoneNumberValid("0700034391"));

        System.out.println(isPhoneNumberValidPredicate.test("07899889891"));

        System.out.println(isPhoneNumberValidPredicate
                .and(containsNumberThree)
                .test("07090805043")
        );

        System.out.println(isPhoneNumberValidPredicate
                .or(containsNumberThree)
                .test("07090805042")
        );
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree =
            phoneNumber -> phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
