import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer =0;
        int max =0;

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length-1; i>=0; i--){
            if(arr[i]>max){
                answer++;
                max = arr[i];

            }
        }

        System.out.println(answer);

    }
}