/*

----------------------------문제----------------------------

입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.



- 예시
(A(BC)D)EF(G(H)(IJ)K)LM(N) -> EFLM



----------------------------생각의 과정----------------------------

1. Stack을 만들어서 입력된 문자열을 반복문으로 돌려가며 하나씩 저장한다.

2. 반복문을 진행하다가 )를 만나면 Stack에서 (가 나올때까지 pop을 수행한다.

3. Stack안에 있는 것을 반복문을 돌려 answer 문자열에 추가하여 리턴한다.


*/


package stack;

import java.util.*;

public class BracketInString{
    

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String answer = "";
        
        Stack<Character> stack = new Stack<>();

        for( char i : str1.toCharArray() ){
            if( i == ')' ) while(stack.pop() != '(');
            else stack.push(i);
        }

        for( int i =0; i<stack.size();i++ ){
            answer += stack.get(i);
        }

        System.out.println(answer);

    }
}