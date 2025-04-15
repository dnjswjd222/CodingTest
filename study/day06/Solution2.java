package study.day06;

class Solution2 {
	public int solution(int n, String control) {
		for (int i = 0; i < control.length(); i++) {
			char ch = control.charAt(i);
			switch (ch) {
			case 'w' -> n += 1;
			case 's' -> n -= 1;
			case 'a' -> n -= 10;
			case 'd' -> n += 10;
			}
		}
		return n;
	}
}