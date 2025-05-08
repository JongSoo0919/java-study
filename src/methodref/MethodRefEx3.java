package methodref;

import java.util.function.Function;

public class MethodRefEx3 {
    public static void main(String[] args) {
        //1. 정적 메서드 참조
        Function<String, String> staticMethod1 = (name) -> Person.greeting(name);
        Function<String, String> staticMethod2 = Person::greeting;

        System.out.println(staticMethod1.apply("kim"));
        System.out.println(staticMethod2.apply("kim"));

        //2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Function<Integer, String> instanceMethod1 = (n) -> person.introduceWithNumber(n);
        System.out.println("instanceMethod1.get() = " + instanceMethod1.apply(10));
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;
        System.out.println("instanceMethod2.get() = " + instanceMethod2.apply(20));
        
        //3. 생성자 참조
        Function<String, Person> newPerson1 = (name) -> new Person(name);
        System.out.println("newPerson1.get() = " + newPerson1.apply("name"));
        Function<String, Person> newPerson2 = Person::new;
        System.out.println("newPerson2.get() = " + newPerson2.apply("name"));
    }
}
