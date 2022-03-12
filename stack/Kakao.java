/*

----------------------------문제----------------------------

인형뽑기 게임 만들기



- 예시
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4



----------------------------생각의 과정----------------------------

1. 두번째로 입력받은 수만큼 반복문을 수행한다. 반복문을 돌면서 열이 고정됨으로 고정된 열을 반복문을 돌려 0이 아닐 때 수를 꺼내고 해당 자리를 0으로 바꾼다. 반복문을 브레이크한다.

2. 뽑은 수를 stack의 size의 -1 한 index 값을 get하여 뽑은 수와 비교한다. 같으면 pop을 수행하고 answer를 2 증가 시킨다.

3. 같지 않다면 stack에 push 한다.


*/
package stack;

import java.util.*;

public class Kakao {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();
        int[][] arr = new int[str1][str1];
        for(int i =0; i<str1;i++){
            for(int j =0; j<str1;j++){
                arr[i][j] = in.nextInt();
            }
        }

        int str2 = in.nextInt();
        int[] moves =new int[str2];

        for(int i =0; i<str2;i++){
            moves[i] = in.nextInt();
        }
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();

        for( int i = 0; i<str2; i++ ){
            for( int j = 0; j<str1; j++ ){
                if( arr[j][moves[i]-1] != 0 ){
                    int temp = arr[j][moves[i]-1];
                    if( !stack.isEmpty() && temp == stack.get(stack.size()-1) ){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(temp);
                    }
                    arr[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        
        System.out.println(answer);

    }
}
