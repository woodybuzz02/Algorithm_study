package programmers;

public class 옷가게_할인_받기 {
	
	class Solution {
	    public int solution(int price) {
	        int answer = 0;
	        if(price>=500000){
	            answer = price*8/10;
	        }else if(price>=300000){
	            answer = price*9/10;
	        }else if(price>=100000){
	            answer = price*95/100;
	        }else{
	            answer = price;
	        }
	        return answer;
	    }
	}

}
