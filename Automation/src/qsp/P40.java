/*
 * 		*	****
 * 		**	***
 * 		***	**
 * 		*****
 */

package qsp;

public class P40 {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(((j<(n/2)-1)&&(i>=j))||(j>(n/2)-1)&& (i+j>=4 || i+j<=7) && (i<n/2)) {
					System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
