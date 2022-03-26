/*

이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.

각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.

제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.


- 예시

5 20
10 5
25 12
15 8
6 3
7 4                                                     41

*/

package DFS_BFS;
import java.util.*;
public class MaxScore {
    static int answer = 0;
    static int timeover = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tim = sc.nextInt();
        int[] time = new int[N];
        int[] score = new int[N];
        timeover = tim;
        for(int i=0;i<N;i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
            
        }
        DFS(time, score, 0, 0, 0);
        System.out.println(answer);
    }
    public static void DFS( int[] time, int[] score, int L, int sum, int time_sum ){
        if(time_sum>timeover) return;
        if( L == time.length ){
            answer = Math.max(answer, sum);
        }else{
            DFS(time,score,L+1,sum+score[L],time_sum+time[L]);
            DFS(time,score,L+1,sum,time_sum);
        }
    }
}
