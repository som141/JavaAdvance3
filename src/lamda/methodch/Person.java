package lamda.methodch;

public class Person {
    private String name;
// 생성자
    public Person(){
        this("unknown");
    }
    //생성자+매개변수
    public Person(String name){
        this.name=name;
    }
//    정적 메서드(클래스 로더에 의해 만들어지는)
    public static String greeting(){
        return "Hello World!";

    }//정적 매개변수 메서드
    public static String getName(String name){
        return "Hello"+name;
    }//인스턴스 메서드
    public String getName(){
        return name;
    }//매개변수있는 인스턴스 메서드
    public String instanceName(int age){
        return this.name+age;
    }

}
