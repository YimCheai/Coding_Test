import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫째 줄 입력: 정수의 개수 N
        int N = scanner.nextInt();
        
        // 둘째 줄 입력: N개의 정수 배열
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 셋째 줄 입력: 찾으려고 하는 정수 v
        int v = scanner.nextInt();
        
        // 배열에서 v의 개수를 셈
        int count = 0;
        for (int num : numbers) {
            if (num == v) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        scanner.close();
    }
}
