/*

N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

정렬하는 방법은 버블정렬.




- 예시
6
13 5 11 7 23 15                                      5 7 11 13 15 23



----------------------------생각의 과정----------------------------

1. 입력받은 숫자들을 저장하는 배열을 생성한다.

2. 반복문을 돌면서 크면 오른쪽으로 보내는 로직을 수행한다.

3. 배열의 값을 출력한다.

*/

package sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();

        int[] answer = new int[str1];
        for(int i =0; i<str1; i++){
            answer[i] = in.nextInt();
        }

        int temp = 0;
        for( int i =0; i<str1-1; i++ ){
            for( int j = 0; j<str1-i-1; j++ ){
                if( answer[j] > answer[j+1] ){
                    temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }
        for( int i = 0; i<str1; i++ ){
            System.out.print(answer[i]+ " ");
        }

    }
}
