/*

철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.

철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.

N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.


- 예시

259 5
81 
58 
42 
33 
61                                                       242



-----------------------------생각의 과정----------------------------

1. 깊이우선탐색을 이용하여 바둑이들을 태우고 안 태우고를 진행하여 

*/
package DFS_BFS;
import java.util.*;
public class DogTruck {
    static int truck = 0;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        truck =n1;
        int[] weight = new int[n2];
        for(int i=0;i<n2;i++){
            weight[i] = sc.nextInt();
        }
        DFS(weight,0,0);
        System.out.println(answer);
    }
    public static void DFS( int[] weight, int L, int sum ){
        if(sum>truck) return;
        if( L == weight.length ){
            answer = Math.max(answer, sum);
        }else{
            DFS(weight,L+1,sum+weight[L]);
            DFS(weight,L+1,sum);
        }
        

    }
}
