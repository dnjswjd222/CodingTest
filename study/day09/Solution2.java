package study.day09;

import java.util.*;

class Solution2 {
	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";

		for (int i = 0; i < my_strings.length; i++) {
			String str = my_strings[i];
			for (int j = parts[i][0]; j <= parts[i][1]; j++) {
				answer += str.charAt(j);
			}
		}
		return answer;
	}
}