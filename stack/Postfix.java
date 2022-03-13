/*

----------------------------문제----------------------------

후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.

만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.






- 예시
352+*9-                                         12



----------------------------생각의 과정----------------------------

1. 입력받은 문자를 char배열로 반복문을 돌린다.

2. 반복문을 돌리면서 나오는 문자가 연산자일 경우 스택에서 두 번 pop을 하고 해당 연산을 실행한다.

3. 반복문을 돌리면서 나오는 문자가 숫자일 경우 스택에 push한다.

4. 반복문이 다 돌면 마지막에 남아 있을 수를 pop하여 answer에 넣는다.


*/
package stack;
import java.util.*;

public class Postfix {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for ( char i : str1.toCharArray() ){
            if( i == '-' ){
                int a = stack.pop();
                int b = stack.pop();
                int temp = b - a;
                stack.push(temp);
            }else if( i == '+' ){
                int a = stack.pop();
                int b = stack.pop();
                int temp = b + a;
                stack.push(temp);
            }else if( i == '/' ){
                int a = stack.pop();
                int b = stack.pop();
                int temp = b / a;
                stack.push(temp);
            }else if( i == '*' ){
                int a = stack.pop();
                int b = stack.pop();
                int temp = b * a;
                stack.push(temp);
            }else{
                stack.push(Integer.parseInt(String.valueOf(i)));
            }
        }
        answer = stack.pop();
        
        System.out.println(answer);

    }
}
