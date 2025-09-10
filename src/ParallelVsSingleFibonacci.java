import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ParallelVsSingleFibonacci {

    // 단순 재귀 (CPU 계산량 큰 버전)
    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        int N = 50; // 계산이 좀 무거운 값

        // 1. 단일 스레드
        long start1 = System.nanoTime();
        long result1 = fib(N);
        long end1 = System.nanoTime();
        System.out.println("단일 스레드 결과: " + result1);
        System.out.println("단일 스레드 시간(ns): " + (end1 - start1));

        // 3. ExecutorService (스레드 풀)
        ExecutorService pool = Executors.newFixedThreadPool(10); // 코어 2개만 사용
        long start3 = System.nanoTime();
        Future<Long> f1 = pool.submit(() -> fib(N - 1));
        long part2 = fib(N - 2);
        long result3 = f1.get() + part2;
        long end3 = System.nanoTime();
        pool.shutdown();
        System.out.println("ExecutorService 결과: " + result3);
        System.out.println("ExecutorService 시간(ns): " + (end3 - start3));
    }
}
