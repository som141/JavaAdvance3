public class mem {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    public static void main(String[] args) {
        // 1) 힙에 Person 객체 생성
        Person p1 = new Person("Lee", 25);

        System.out.println("Name: " + p1.name + ", Age: " + p1.age);

        // 2) 더 이상 p1을 사용할 필요가 없으면 null 할당
        p1 = null;

        // 3) 한 시점에 강제로 GC를 요청 (보장이 아님)
        System.gc();

    }
}
