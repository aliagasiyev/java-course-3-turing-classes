package az.edu.module02.part02.lesson13;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Elvin", 25, 75);
        Person person2 = new Person("Osman", 24, 60);
        Person person3 = new Person("Elnur", 27, 55);
        Person[] people = {person1, person2, person3};
        
        Arrays.sort(people, (p1, p2) ->
                p2.getName().compareTo(p1.getName()));
        System.out.println(Arrays.toString(people));
    }
}