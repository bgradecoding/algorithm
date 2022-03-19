/*
캐시메모리는 CPU와 주기억장치(DRAM) 사이의 고속의 임시 메모리로서 CPU가 처리할 작업을 저장해 놓았다가

필요할 바로 사용해서 처리속도를 높이는 장치이다. 워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.

철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.

LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.

캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.


캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후

캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.



- 예시
5 9
1 2 3 2 6 2 3 5 7                                                           7 5 3 2 6


----------------------------생각의 과정----------------------------

1. 처음 입력받은 수로 캐시메모리의 크기만큼 배열을 만든다.

2. 두번째로 입력받은 수의 배열만큼 반복문을 돌면서 캐시메모리에 똑같은 숫자가 있다면 해당 위치를 저장한다.

3. 캐시메모리에 끝부터 1까지 하나씩 밀어낸다.

4. 만약 2번에서 똑같은 수가 있다면 그 인덱스 부터 1까지 하나씩 밀어낸다.


*/

package sorting;
import java.util.*;
public class LeastRecentlyUsed_other {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();
        int str2 = in.nextInt();

        int[] answer = new int[str1];
        int[] work = new int[str2];

        for(int i =0; i<str2; i++){
            work[i] = in.nextInt();
        }

        for(int x : work){

            int index = -1;
            for(int i =0; i<answer.length; i++){
                if(answer[i] == x){
                    index = i;
                    break;
                }
            }
            if( index == -1){
                for( int j = str1-1; j>=1; j--){
                    answer[j] = answer[j-1];
                } 
            }else{
                for( int j = index; j>=1; j--){
                    answer[j] = answer[j-1];
                }
            }
            
            answer[0] = x;
        }
        for( int i = 0; i<str1; i++ ){
            System.out.print(answer[i]+ " ");
        }
    }
}
