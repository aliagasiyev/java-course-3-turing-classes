package az.edu.module02.part02.lesson13;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Taskz {
    public static void main(String[] args) {
        User user1 = new User(1,"User1");

        User user2 = new User(2,"User2");
        User user3 = new User(3,"User3");

        List<User> users = Arrays.asList(user1, user2, user3);
        Stream<User> userStream = users.stream();
        Map<Integer, User> map = userStream.collect(
                Collectors.toMap(user -> user.id, user -> user)
        );
        System.out.println(map);

    }
}
