package study.day04;

public class Solution4 {
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		if (eq.equals("=")) {
			if (ineq.equals("<"))
				answer = n <= m ? 1 : 0;
			else if (ineq.equals(">"))
				answer = n >= m ? 1 : 0;
		} else if (eq.equals("!")) {
			if (ineq.equals("<"))
				answer = n < m ? 1 : 0;
			else if (ineq.equals(">"))
				answer = n > m ? 1 : 0;
		}
		return answer;
	}
}
