import java.io.*;
import java.util.*;
import java.util.Scanner;
public class calculate implements body {
	 public int Summation_of_even(int n){
		 int add = 0;
		 for(int i = 1; i <= n; i++) {
			 if(i % 2 == 0) add += i;
			 else continue;
		 }
		 return add;
	 }
	 public int Summation_of_odd(int n) {
		 int add1 = 0;
		 for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) add1 += i;
            else continue;			
		 }
		 return add1;
	 }
	 public int Summation_of_all(int n) {
		int add2 = 0;
        for(int i = 1; i <= n; i++) {
            add2 += i;
        }			
		return add2;
	 }
	 public int Summation_of_prime(int n) {
		 boolean prime[] = new boolean[n + 1];
		 Arrays.fill(prime , true);
		 for(int i = 2; i * i <= n; i += 1) {
            if(prime[i]) {
               for(int j = i + i; j <= n; j += i) prime[j] = false;
            }
        }
		int ans = 0;
        for(int i = 2; i <= n; i++) {
            if(prime[i]) ans += i;
            else continue;
        }
		return ans;
	 }
}