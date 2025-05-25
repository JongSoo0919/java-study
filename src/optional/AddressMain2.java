package optional;

import optional.model.Address;
import optional.model.User;

import java.util.Optional;

public class AddressMain2 {
    public static void main(String[] args) {
        User user1 = new User("user1", null);
        User user2 = new User("user2", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                System.out::println, // 값이 있을 때,
                () -> System.out.println("UNKNOWN") // 값이 없을 때
        );

    }
    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user) // user가 null 일 수 있으므로 ofNullable
                .map(User::getAddress)
                .map(Address::getStreet);

        // map 체이닝 중간에 null이면, Optional.empty()를 반환
    }
}
