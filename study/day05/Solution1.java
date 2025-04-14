package study.day05;

class Solution1 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i=0; i<code.length(); i++){
            switch(mode){
            case(0) -> {
                if(code.charAt(i) != '1' && i%2==0){
                    answer += code.charAt(i);
                }else if(code.charAt(i) == '1')
                    mode = 1;
            }
            case(1) -> {
                if(code.charAt(i) != '1' && i%2!=0){
                    answer += code.charAt(i);
                }else if(code.charAt(i) == '1')
                    mode = 0;
            }
        }
        }      
        return answer.isEmpty()? "EMPTY":answer;
    }
}