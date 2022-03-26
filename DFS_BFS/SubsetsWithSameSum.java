/*

N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때

두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.

둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.

예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.


- 예시

6
1 3 5 6 7 10                                                        YES



-----------------------------생각의 과정----------------------------

1. 입력받은 원소들을 배열에 넣고 오름 차순으로 정렬한다.

2. 배열의 합을 구하고 홀수면 NO를 리턴하고 짝수면 2로 나눈다.

3. 배열의 원소들을 사용한다 안한다로 깊이 우선 탐색을 하면 합에서 2를 나눈 수와 같다면 YES를 출력한다.

4. 해당 탐색이 종료되도록 합에서 2를 나눈 수와 같지 않다면 NO를 출력한다.

*/

package DFS_BFS;
import java.util.*;

public class SubsetsWithSameSum {
    static boolean flag = false;
    static int n = 0;
    static int total = 0;
    static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        n = n1;

        int[] arr = new int[n1];
        for(int i=0; i<n1; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        Arrays.sort(arr);
        
        DFS(arr, 0, 0);
        System.out.println(answer);
    }
    public static void DFS(int[] arr, int sum, int index) {
        if(flag) return;
        if(index == n){
            if(total-sum == sum) {
                answer ="YES";
                flag = true;
                return;
            }
        }else{
            DFS( arr, sum+arr[index], index+1);
            DFS( arr, sum, index+1);
        }
    }
}
