import java.util.Scanner;
import java.util.Arrays;
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i =0; i<N; i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		Arrays.sort(a);
		System.out.print(a[0]+" "+a[N-1]);
		}
	}