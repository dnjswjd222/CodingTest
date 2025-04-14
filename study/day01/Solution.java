package study.day01;

//1.문자열 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(1<=a.length() && a.length() <= 1000000){
            System.out.println(a);
        }
    }
}