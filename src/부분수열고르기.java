import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 부분수열고르기 {
    static int []arr;
    static int N;
    static int a;
    static int d;
    static int M;
    static long [][]dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        a=Integer.parseInt(st.nextToken());
        d=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        arr=new int[N+1];
        dp= new long[N + 1][M + 1];
        for(int i=1;i<=N;i++){
            arr[i]=a+d*(i-1);
        }

    }
}
