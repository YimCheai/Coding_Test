import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int total = 0;
		
		for(int i = 0; i<N; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			  
			 total += price*num;
			 
			 
		}
		 if(total == X) {
				  System.out.println("Yes");
		 }
		 else {
				 System.out.println("No");
	     }
	}

}
