/*

현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.

현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.

기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.

만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.



- 예시
10 3
13 15 34 23 45 65 33 11 26 42                                                    143



----------------------------생각의 과정----------------------------

1. 3중 반복문을 돌면서 3개수를 뽑아서 더하는 모든 경우의 수를 반복한다.

2. 반복하면서 중복되는 값은 지워지도록 트리셋에 담는다.

3. k번째 값을 찾아서 출력한다.


*/

package hash;
import java.util.*;
public class KthLargestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextInt();
        int str2 = sc.nextInt();
        
        int[] arr = new int[str1];
        for(int i =0; i<str1; i++){
            arr[i] = sc.nextInt();
        }

        int answer = -1;

        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());

        for(int i =0; i<str1; i++){
            for(int j =i+1; j<str1; j++){
                for(int k =j+1; k<str1; k++){
                    tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int count = 0;
        for( int i : tset){
            count++;
            if(count == str2){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}
