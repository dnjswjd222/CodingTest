package study.day05;

class Solution5 {
    public int solution(int[] num_list) {
        int answer = 0;
        String arr1 = "";
        String arr2 = "";
        
        for (int i:num_list){
            if(i%2==0)
                arr2 += i;
            else
                arr1 += i;
        }
        return answer = Integer.parseInt(arr1) + Integer.parseInt(arr2);
    }
}