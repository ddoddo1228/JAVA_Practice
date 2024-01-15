import java.util.Scanner;

public class Java_1 {
    public static void main(String[] args) {
        
        double rand = Math.random();
        int ans = (int)(rand * 1000);
        int i = 0;
        int n;
        
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\n 0 ~ 999 사이의 수를 입력하세요.:");
            n = scan.nextInt();
            
            i++;
                
            if(ans > n) {
                System.out.println("UP");
            } else if(ans < n) {
                System.out.println("Down");
            } else {
                System.out.println("정답");
                break;
            }
        } while (i <= 20);
        scan.close();
    }
}
