package study.day01;

//2.a와 b 출력하기
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(-100000<=a && a<=100000 && -100000<=b && b<=100000){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
