package study.day09;

import java.util.*;

class Solution3 {
	public String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(my_string.length() - n);
		return answer;
	}
}