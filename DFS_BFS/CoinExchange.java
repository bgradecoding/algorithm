/*
다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?

각 단위의 동전은 무한정 쓸 수 있다.


- 예시

3
1 2 5
15                                                    3
*/

package DFS_BFS;
import java.util.*;

public class CoinExchange {
    static int answer = Integer.MAX_VALUE;
    static int exCoin = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] coin = new Integer[N];
        for(int i=0;i<N;i++){
            coin[i] = sc.nextInt();
        }
        exCoin = sc.nextInt();
        Arrays.sort(coin, Collections.reverseOrder());
        DFS(coin,0,0);
        System.out.println(answer);
    }   
    public static void DFS( Integer[] coin, int L, int sum){
        if(sum>exCoin) return;
        if(L>answer) return;
        if( sum==exCoin ){
            answer = Math.min(answer, L);
        }else{
            for(int i=0;i < coin.length;i++){
                DFS(coin,L+1,sum+coin[i]);
            }
        }
    }
}
