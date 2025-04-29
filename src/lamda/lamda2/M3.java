package lamda.lamda2;

import lamda.Produce;

public class M3 {
    static void an(Produce produce){
        System.out.println(System.nanoTime());
        produce.run();
        System.out.println(System.nanoTime());
    }
    static MyFunction getOperation(String operator){
        switch (operator){
            case "+":
                return (a,b)->a+b;
            case "-":
                return (a,b)->a-b;
            case "*":
                return (a,b)->a*b;
            default:
                return (a,b)->a/b;
        }
    };
    public static void main(String[] args) {
        an(new Produce() {
            @Override
            public void run() {
                for(int i=0;i<4;i++){
                    System.out.println("안녕하세요");
                }
            }
        });
        an(new Produce() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        an(()->{
            System.out.println("안녕하세요");

        });
        MyFunction add=getOperation("+");
        System.out.println(add.apply(1,2));

    }
}
