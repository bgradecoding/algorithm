/*
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.

현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.

송아지는 움직이지 않고 제자리에 있다.

현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.

최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.


- 예시

5 14                                                        3



----------------------------생각의 과정----------------------------

1. 현수의 위치에서 +1, -1, +5를 해서 해당 값들을 저장한다.

2. 현수의 처음 위치를 레벨 0으로 두고 한번 1을 수행 할때 마다 레벨을 1씩 올린다.

3. 1번을 수행 결과를 차례대로 ArrayList에 저장한다.

4. 1번을 수행할 때 14가 나오면 레벨을 리턴하고 끝낸다.
 
*/

package DFS_BFS;
import java.util.*;
public class FindCow {
    int[] dis = {1, -1, 5};
    int[] ck;
    Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hsPosition = sc.nextInt();
        int cowPosition = sc.nextInt();
        
        FindCow fc = new FindCow();
        int answer = fc.BFS(hsPosition, cowPosition);
        
        System.out.println(answer);
    }
    public int BFS(int s, int x){
        int level = 0;

        ck = new int[10001];

        ck[s] = 1;

        Q.offer(s);

        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i=0; i<size; i++){
                int now = Q.poll();
                for(int j=0; j<3; j++){
                    int next = now + dis[j];
                    if(next == x) {
                        return level+1;
                        
                    }
                    if(next >= 1 && next <= 10000 && ck[next] == 0){
                        ck[next] = 1;
                        Q.offer(next);
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
