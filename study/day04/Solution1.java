package study.day04;

class Solution1 {
	public int solution(int num, int n) {
		int answer = 0;
		answer = num % n == 0 ? 1 : 0;
		return answer;
	}
}