/*
 * WAJP to print fibonacci series without using loops
 *  0,1,1,2,3,5,8,13
 */

package qsp;

public class P41 {
	
	public static void fib(int a,int b,int sum, int count) {
		if(count>10) {
			return;
		}
		else {
			if (a==0) {
				System.out.println(a);
				System.out.println(b);
			}
		sum=a+b;
		System.out.println(sum);
		a=b;
		b=sum;
		count++;
		fib(a,b,sum,count);
		}
	}
	
	public static void main(String[] args) {
		fib(0,1,0,1);
	}

}
