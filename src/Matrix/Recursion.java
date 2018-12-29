package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Recursion {
 
    public static void main(String[] args) throws NumberFormatException,
            IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter the power for " + x);
        int n = Integer.parseInt(br.readLine());
 
        System.out.println(x + " raised to power " + n + " = " + power(x, n));
    }
 
    private static long power(int x, int n) {
        long y = 0;
 
        if (n == 0)
            return 1;
        else if (n == 1)
            return x;
        else {
            y = power(x, n / 2);
            y = y * y;
            if (n % 2 == 0)
                return y;
        }
        return x * y;
    }
 
}
 
 
