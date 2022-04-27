import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int a;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long[] mem = new long[a +1];
        Arrays.fill(mem, -1);

        System.out.println(fibEffective(a));
    }
    //Наивный метод
    private static long fibNaive(int n, long[] mem) {
       if (mem[n] != -1) return mem[n];

        if (n <= 1 )  return n;



        long result =  fibNaive(n-1, mem    ) + fibNaive(n-2, mem);
        mem[n] = result;
        return result;
    }
    private static  long fibEffective (int n ) {
        long [] arr  = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }


}

