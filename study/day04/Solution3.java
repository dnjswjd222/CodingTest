package study.day04;

public class Solution3 {
	public int solution(int n) {
		int answer = 0;
		if (n % 2 == 1) {
			for (int i = n; i > 0; i -= 2)
				answer += i;
		} else {
			for (int i = n; i > 0; i -= 2)
				answer += i * i;
		}
		return answer;
	}
}
