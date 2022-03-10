/*

----------------------------문제----------------------------

한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

- 예시
Computercooler
c



----------------------------생각의 과정----------------------------

1. 대소문자를 구분하지 않으므로 소문자나 대문자로 변환한 이후 로직을 수행한다.

2. 첫번째 특정 문자열을 문자배열화하여 반복문을 한번 돌리면서 입력받은 두번째 문자열과 비교하며 카운트를 증가시킨다.




*/

package string;

import java.util.Scanner;

public class FindString{

    public static void main(String[] args){
        
        //입력 받기
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        //두 문자열 모두 소문자로 변환
        int answer = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] word = str1.toCharArray();
        for( char i : word ){
            if( (i+"").equals(str2) ) answer++;
        }

        System.out.println(answer);
    }

}