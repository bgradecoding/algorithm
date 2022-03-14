/*

정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.

정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.

정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.

왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.

그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.

그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.

한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.

그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.

이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.


예를 들어 총 8명의 왕자가 있고, 3을 외친 왕자가 제외된다고 하자. 처음에는 3번 왕자가 3을 외쳐 제외된다.

이어 6, 1, 5, 2, 8, 4번 왕자가 차례대로 제외되고 마지막까지 남게 된 7번 왕자에게 공주를 구하러갑니다.


----------------------------생각의 과정----------------------------

1. 원형으로 계속 데이터를 돌리는 문제이기 때문에 큐를 사용한다.

2. 첫번째 입력받은 수 만큼 왕자를 큐에 차례로 입력한다.

3. 큐가 비어있을때까지 반복문을 돌린다.

4. 반복문 안에서 두번째 입력받은 수에서 1을 뺀만큼 반복문을 돌려 큐에서 뺀 수를 다시 오퍼한다.

5. 안쪽 반복문이 끝나면 큐에서 poll한다.

6. 큐의 사이즈가 1일때 answer에 poll하여 넣는다.

*/

package queue;

import java.util.*;

public class SavingQueen {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int str1 = in.nextInt();
        int str2 = in.nextInt();
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        
        for( int i = 1; i<=str1; i++ ) queue.offer(i);

        while( !queue.isEmpty() ){
            for(int i =1; i<str2; i++) queue.offer(queue.poll());
            queue.poll();

            if( queue.size() == 1 ) answer = queue.poll();
        }

        System.out.println(answer);

    }
}
