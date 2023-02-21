/*
핸드폰 번호 가리기

문제 설명

프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
phone_number는 길이 4 이상, 20이하인 문자열입니다.

입출력 예
phone_number	return
"01033334444"	"*******4444"
"027778888"	"*****8888
*/

class Solution {
    public String solution(String phone_number) {
        
        char array[]=phone_number.toCharArray(); //String인 phone number을 char 형 배열로 변환함 
        
        for(int i=0; i<array.length-4; i++) //for문을 0부터 넷째자리 전까지 돌림
            array[i]='*'; //*로 변환해서 번호 가림
        
        return new String(array); //String 형의 array 반환
    }
}
