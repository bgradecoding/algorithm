/*

----------------------------문제----------------------------

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.



- 예시
StuDY -> sTUdy



----------------------------생각의 과정----------------------------

1. 입력받은 문자열을 문자배열화하여 반복문을 한번 돌리면서 대문자는 소문자로, 소문자는 대문자로 변환한다.

2. 대소문자 구분은 조건문으로 97보다 크면 소문자로 그외는 대문자로 본다.

3. 대문자 변환 소문자 변환은 아스키코드 차이만큼을 빼고 더해서 처리하고 char와 int의 계산 이후 char형으로 변환하여 answer String에 추가한다.

아스키 코드 외워두기

대문자 65~90
소문자 97~122

*/


package string;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args){
        
        //입력 받기
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String answer = "";
        
        char[] word = str1.toCharArray();
        for( char i : word ){
            if(i >= 97) answer += (char)(i-32);
            else answer += (char)(i+32);
        }
        System.out.println(answer);
    }
}
