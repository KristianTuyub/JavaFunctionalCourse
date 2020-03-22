package optionals;

import java.util.Optional;
//01:30:43
public class OptionalsCourse {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hell0")
                .orElseThrow(
                        () -> new IllegalStateException("Exception, Null Value Provided")
                );

        System.out.println(value);

        String email = null;
        Optional.ofNullable(email)
                .ifPresentOrElse(
                        emailProvided -> System.out.println(
                                String.format("Sending email to: %s", emailProvided)
                        ),
                        () -> System.out.println("Cannot sent email, email not provided")
                );

    }
}
