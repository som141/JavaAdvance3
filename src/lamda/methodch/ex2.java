package lamda.methodch;

import java.util.function.Supplier;

public class ex2 {
    public static void main(String[] args) {
        //static 메서드 참조 방식
        Supplier<String> staticMethod1 = ()->Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting;//클래스 레벨에서의 스테틱 메소드 참조
        System.out.println(staticMethod1.get());
        System.out.println(staticMethod2.get());
        //특정 개체의 인스턴스 참조
        Person person = new Person("윤영주");
        Supplier<String> staticMethod3 = () -> person.getName();
        Supplier<String> staticMethod4 = person::getName;
        System.out.println(staticMethod3.get());
        System.out.println(staticMethod4.get());
        //생성자 참조방식
        Supplier<Person> staticMethod5 = () -> new Person();
        Supplier<Person> staticMethod6 = Person::new;

        System.out.println(staticMethod5.get());
        System.out.println(staticMethod6.get());
        

    }
}
