package study.day02;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (1<=n && n<=1000){
            if(n%2==0)
                System.out.println(n+" is even");
            else
                System.out.println(n+" is odd");
        }
    }
}