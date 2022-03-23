/*

N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.

현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,

가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.

C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.


- 예시
5 3
1 2 8 4 9                                                         3



----------------------------생각의 과정----------------------------

1. 입력받은 마구간의 좌표를 오름차순으로 정렬한다.

2. 가능한 최대거리의 최소값을 lt로 두고 최대값을 rt로 둔다.

3. 가운데 값을 mid로 둔다.

4. mid값으로 C마리의 말을 배치한다. 따로 함수를 빼서 배치되는 말의 마리 수를 리턴한다.

5. C마리가 모두 배치되면 answer에 mid값을 넣는다. 

*/

package sorting;
import java.util.*;
public class Stall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i=0; i<n1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr[n1-1];
        int answer = 0;
        while (lt <=rt){
            int mid = (lt+rt)/2;
            if( batch(arr,mid) >= n2 ){
                answer = mid;
                lt = mid+1;
            }
            else {
                rt = mid-1;
            }
        }
        System.out.println(answer);
    }
    public static int batch(int[] arr, int mid){
        int cnt = 1;
        int temp = arr[0];
        for( int i=0; i<arr.length; i++){
            if(arr[i] - temp>=mid){
                temp = arr[i];
                cnt++;
            }
        }
        return cnt;
    }
}
