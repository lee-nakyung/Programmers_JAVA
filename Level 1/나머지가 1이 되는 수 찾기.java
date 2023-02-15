/*나머지가 1이 되는 수 찾기
문제 설명
자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

제한사항
3 ≤ n ≤ 1,000,000

입출력 예
n	result
10	3
12	11
*/

class Solution {
    public int solution(int n) {
        
        double answer=Math.sqrt(n-1); //n의 제곱근까지 for문을 돌려야하므로 제곱근 구함
        
        for(int i=2; i<=answer; i++){//2부터 제곱근까지 for문 돌림
            if(n%i==1) //만약 나눈 나머지가 1이면
                return i; //그 값인 i를 리턴
        }
        return n-1; //1이 아닐 경우에 그 수에서 제일 큰 값이므로 n-1
           
    
    }
}
