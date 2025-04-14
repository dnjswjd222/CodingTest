package study.day01;

//4.대소문자 바꿔서 출력하기
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i=0; i<a.length(); i++) {
        	char ch = a.charAt(i);
        	if(Character.isUpperCase(ch))
        		result += Character.toLowerCase(ch);
        	else if(Character.isLowerCase(ch))
        		result += Character.toUpperCase(ch);
        }
        System.out.println(result);
    }
}