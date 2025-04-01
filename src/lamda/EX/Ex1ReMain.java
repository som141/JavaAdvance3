package lamda.EX;

import java.util.Random;

public class Ex1ReMain {

    public static void run(Runnable r) {
        long startNs = System.nanoTime();

        r.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        run(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }

        });

        run(()->{
            Random random = new Random();
            System.out.println(random.nextInt(6));
        });
    }
}